import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        int i,j,n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the n = ");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=2*n;j++){
                if(j>=i+1&&j<=2*n-i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }

System.out.println();

        for(i=1;i<=n;i++){
            for(j=1;j<=2*n-1;j++){
                if(j<=i+1&&j>=2*n-i+1){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
