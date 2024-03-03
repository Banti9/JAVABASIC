/*
 * WAP to create a basic calculator using switch.
  Devloped by km BAnti Chauhan
 */
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        float a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a = ");
        a=sc.nextFloat();
        System.out.println("Enter the value of b = ");
        b=sc.nextFloat();
        System.out.println("Enter the option for calculation ==");
        int n = sc.nextInt();
        sc.close();
        switch(n){
            case 1: System.out.println("Addition (a+b) = "+(a+b)); break;
            case 2: System.out.println("Subtraction (a-b) = "+(a-b)); break;
            case 3: System.out.println("Multiplecation (a*b) = "+(a*b)); break;
            case 4: System.out.println("Division (a/b) = "+(a/b)); break;
            default : System.out.println("Enter the correct option from 1-4");

        }
    }
}
