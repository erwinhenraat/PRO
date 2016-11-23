import java.lang.Math;
public class TestArray{
  public static void main(String[] args) {
    double[] cashList = new double[50];
    //cashList[0] = 56.66d;
    for(int i = 0; i < cashList.length; i++){
        cashList[i] = 20.00d + Math.random()*80.00d;

        System.out.println(
        "de waarde van cashlist[" +i+ "] is " + cashList[i] );
    }



  }
}
