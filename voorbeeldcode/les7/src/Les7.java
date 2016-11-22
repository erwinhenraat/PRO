import java.util.Scanner;
import food.fruit.Apple;
import media.sound.Sound;

//De imports hierboven zorgen ervoor dat je de classes uit andere packages kunt gebruiken

public class Les7{
  public static void main(String[] args) {
      Les7 lesson = new Les7();
  }
  public Les7(){
    Apple[] apples = new Apple[10];

    for(int i=0; i<apples.length; i++){
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
        if(current < apples.length){
          current++;
        }else{
          current = 0;
        }
        System.out.println("grab the next apple : #"+(current+1));
      }else{
        System.out.println("i don't understand.");
      }
    }


  }
}
