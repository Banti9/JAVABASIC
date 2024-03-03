
//Developed by Banti
import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size n = ");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=i;j<=n;j++){
                
                
                    System.out.print("*");
            }
            System.out.println();

        }
        for(i=n-1;i>=1;i--){
            for(j=i;j<=n;j++){
                
                
                    System.out.print("*");
            }
            System.out.println();

    }
    }
}
