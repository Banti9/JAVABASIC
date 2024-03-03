import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size n = ");
        n=sc.nextInt();
        for(i=1;i<=2*n;i++){
            for(j=1;j<=n;j++){
                if(i<=n&&j>=1&&j<=i){
                    System.out.print("*");
                }
                else if(i>=n && j>=1 &&j<=(2*n-i+1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }


        System.out.println();
        for(i=1;i<2*n;i++){
            for(j=1;j<=n;j++){
                if(i<=n&&j>=1&&j<=i){
                    System.out.print("*");
                }
                else if(i>n &&j>=1 &&j<(2*n-i+1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

        System.out.println();
        for(i=1;i<2*n;i++){
            for(j=1;j<=n;j++){
                if(i<=n&&j<=n&&j>=n-i+1){
                    System.out.print("*");
                }
                else if(i>=n &&j<=n &&j>=(i-n+1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
