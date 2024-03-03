/*
 * Write a Java program that reads in two floating-point numbers and tests whether they are the same up to three decimal places.
 devloped by Km Banti Chauhan
 */
import  java.util.*;
public class floatnum {
    public static void main(String[] args) {
        // int a,b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the two floating numbers ");
        float a=sc.nextFloat();
         
        float b=sc.nextFloat();
        System.out.println("value of a "+a+ " value of b "+b);
        int a1=(int)(a*1000);
        int b1=(int)(b*1000);
        if(a1==b1){
            System.out.println("a and b are equale number ");
        }
        else{
            System.out.println(" not equale");
        }
        sc.close();
     
    }
}
