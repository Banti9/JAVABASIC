
import java.util.Scanner;
import java.lang.Math;
public class decimal {
    public static void main(String[] args){
     float X;
     Scanner sc = new Scanner(System.in);
     X = sc.nextFloat();
     System.out.println("Value of X = "+X);
    
  
     int r = Math.round(X);
     System.out.println("decimal = "+r);
     sc.close();

    }
}
