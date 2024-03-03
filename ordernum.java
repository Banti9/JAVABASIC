/*
 * Write a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order, "decreasing" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise
 Devloped by Km Banti Chauhan
 */
import java.util.Scanner;
 public class ordernum {
    public static void main(String[] args){
        int a, b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of  a = ");
        a=sc.nextInt();
        System.out.print("Enter the value of  b = ");
        b=sc.nextInt();
        System.out.print("Enter the value of  c = ");
        c=sc.nextInt();
        if(a<b&&b<c){
            System.out.print("Increasing order ");
        }
        else if((a>b)&&(b>c)){
            System.out.print("Decreasing order");
        }
        else{
            System.out.print("Neither increasing nor decreasing");
        }
        sc.close();
}
 }