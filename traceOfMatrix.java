import java.util.Scanner;
// Wap To Print Trace of a matrix
public class traceOfMatrix {
     public static void main(String[] args) {
        int[][] arr=new int[3][3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("THE Matrix is ");
            for(int i=0;i<3;i++){
                System.out.print("|");
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("|");

        

        }    
        for(int i=0;i<3;i++){
                System.out.print("|");
            for(int j=0;j<3;j++){
                if(i==j){
                System.out.print(arr[i][j]+" ");}
                else{
                    System.out.print(" _ ");
                }
            }
            System.out.println("|");

        
        }
    }
}
