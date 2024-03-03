/*
 * Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative".
 * Devloped by Km Banti Chauhan
 */
import  java.util.Scanner;
public class negorpos {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        // n=sc.nextInt();
        System.out.println("Value  of a  =");
        n=sc.nextInt();
        if(n==0){
            System.out.println("n is zero ");
        }
        else if(n>0){
            System.out.println("n is positive number ");
        }
        else{
                System.out.println("n is negstive number ");
            }
        
        sc.close();
    }
        
}
