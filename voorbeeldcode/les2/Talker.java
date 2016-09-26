public class Talker{
  private int a = 17;
  public void talk()
  {
    int b = 12;
    System.out.println("Ik gedraag me vaak als iemand van " + b);
    System.out.println("Lichamelijk voel ik me soms " + (a + b));
  }
  public void talkSomeMore()
  {
    System.out.println("de variabele b bestaat nog steeds en heeft de waarde" + a);
    a += 5;
    System.out.println("en de waarde van a is nu " + a);
    //System.out.println("b bestaat helaas niet meer" + b);

  }
}
