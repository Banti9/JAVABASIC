/*
 * WAP to find largest number among three numbers
Developed by Km Banti Chauhan
 */
import java.util.Scanner;
public class greatest_if {
    public static void main(String[] args){
        int a, b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Value  of a  =");
        a=sc.nextInt();
        System.out.println("Vlaue of b =");
        b=sc.nextInt();
        System.out.println("Vlaue of c =");
        c=sc.nextInt();
        if((a>b)&&(a>c)){
            System.out.println("the greatest no. is a ="+a);
        }
        else{
            if((b>a)&&(b>c)){
            System.out.println("the greatest no is b = "+b);}
            else{
                System.out.println("the greatest no is c = "+c);
            }
        }
        sc.close();

    }
    
}
