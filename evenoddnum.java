/*
 * WAP to find whether a number is even or odd
  devloped by km Banti chauhan
 */
import java.util.Scanner;
public class evenoddnum {
    public static void main(String[] args){
     int X;
     Scanner sc = new Scanner(System.in);
     System.out.println("Value of X = ");
     X = sc.nextInt();
     if(X%2==0){
        System.out.println("X is even number = "+X); 
     }
     else{
        System.out.println("X is odd number= "+X);
     }
   sc.close();

    }
}
