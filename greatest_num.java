import java.util.Scanner;


public class greatest_num {
    // public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int x;
        x=(a>b)?(a>c)?a:c:b;
        
        System.out.println("Value of a = "+a);
        System.out.println("Value of b = "+b);
        System.out.println("Value of c = "+c);
        System.out.println("the greatest no. of c = "+x);
    }
}
