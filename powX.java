
import java.util.Scanner;
public class powX {
    public static void main(String[] args){
        // double r = Math.pow(X,n);
        Scanner sc = new Scanner(System.in);
        double X = sc.nextDouble();
        Double n = sc.nextDouble();
        double r = Math.pow(X,n);
        System.out.println("Value of X = "+X);
        System.out.println("Value of n = "+n);

        System.out.println("power of X of n = "+r);
        sc.close();
    }
    
}
