import java.util.Scanner;
public class Les6{
  public static void main(String[] args) {
      Les6 les6 = new Les6();
  }
  public Les6()
  {
    //showProblem();
    showSolution();
  }
  private void showProblem()
  {
    //Met de onderstaande code kun je een appel extends
    //Wat nu als je meer appels wil kunnen eten?
    //Moet ik dan de complete code kopieren?
    //Ik wil een mand met 20 appels die ik allemaal kan eten.

    Apple apple1 = new Apple();
    Scanner scanner = new Scanner(System.in);

    while(true){
      System.out.println("eat, look, next or exit?");
      String input = scanner.next();

      if(input.equals("eat")){
        apple1.takeBite();
      }
      else if(input.equals("look")){
        apple1.printAppleStatus();
      }
      else if(input.equals("exit")){
        break;
      }else if(input.equals("next")){
        //ga naar de volgende appel
        System.out.println("there is only one apple!");
      }else{
        System.out.println("i don't understand.");
      }
    }
  }
  private void showSolution()
  {
    //programmeer hier de oplossing om 20 appels te kunnen eten.
    int amount = 2;
    Apple[] apples = new Apple[amount];
    for(int i = 0; i < amount; i++){
      apples[i] = new Apple();
    }
    Scanner scanner = new Scanner(System.in);
    int current = 0;
    while(true){
      System.out.println("eat, look, next or exit?");
      String input = scanner.next();

      if(input.equals("eat")){
        apples[current].takeBite();
      }
      else if(input.equals("look")){
        apples[current].printAppleStatus();
      }
      else if(input.equals("exit")){
        break;
      }else if(input.equals("next")){
        //ga naar de volgende appel
        if(current < apples.length-1){
          current++;
        }else{
          current = 0;
        }
        System.out.println("picked up the next apple.");
      }else{
        System.out.println("i don't understand.");
      }
    }

  }

}
