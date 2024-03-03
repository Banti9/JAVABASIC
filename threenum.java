/*
 * Write a Java program that accepts three numbers and prints "All numbers are equal" if all three numbers are equal, "All numbers are different" if all three numbers are different and "Neither all are equal or different" otherwise.
 Devloped by Km Banti Chauhan
 */
import java.util.Scanner;
public class threenum {
    public static void main(String[] args){
    int a, b,c;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of  a = ");
    a=sc.nextInt();
    System.out.print("Enter the value of  b = ");
    b=sc.nextInt();
    System.out.print("Enter the value of  c = ");
    c=sc.nextInt();
    if(a==b&&a==c){
        System.out.print("all is equal number ");
    }
    else if((a==b)||(a==c)||(c==b)){
        System.out.print("neither all numbers are equal nor different  ");
    }
    else{

        // (a!=b)&&(a!=c)&&(b!=c)
        System.out.print("all numbbers are different");
    }
  sc.close();
}
}
