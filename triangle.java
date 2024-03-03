/*
 * WAP to check a triangle is a equilateral, isosceles or scalene
 * devloped by Km Banti chauhan
 */

import java.util.Scanner;
public class triangle
 {
    public static void main(String[] args){
        int a, b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of side a = ");
        a=sc.nextInt();
        System.out.print("Enter the value of side b = ");
        b=sc.nextInt();
        System.out.print("Enter the value of side c = ");
        c=sc.nextInt();
        if(a==b&&b==c){
            System.out.print("the triangel is equilateral ");
        }
        else if((a==b&&b!=c)||(a==c&&c!=b)||(b==c&&c!=a)){
            System.out.print("the triangle is isosceles ");

        }
        else{
            System.out.print("the triangle is scalene ");
        }
        sc.close();

    }
}
