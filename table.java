import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        int n,j;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number ");
        n=s.nextInt();
        System.out.println("table of n= ");
        for(j=1;j<=10;j++){
           
         System.out.println(n*j);
        }
        
    }

    
}
