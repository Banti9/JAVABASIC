import java.util.Scanner;
// import java.util.*;

public class simple_intrest {
    public static void main(String[] args){
    int P,r,t;
    float A;
    Scanner sc= new Scanner(System.in);
    // A=sc.nextInt();
    P=sc.nextInt();
    r=sc.nextInt();
    t=sc.nextInt();
    System.out.println("Value of initial principal balance = "+P);
    System.out.println("Value of annual interest rate = "+r);
    System.out.println("Value of Time = "+t);
    A=(P*r*t)/100;
    System.out.println("Simple interest = "+A);

}
}
