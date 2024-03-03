import java.util.Scanner;

public class upperTrangleMatrix {
    public static void main(String[] args) {
        int[][] m=new int[4][4];
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the Element of MAtrix ");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                m[i][j]=in.nextInt();
            }
            System.out.println();
        }
        System.out.println("Matrix is ");
        for(int i=0;i<4;i++){
            System.out.print("|");
            for(int j=0;j<4;j++){
            System.out.print(m[i][j]+" ");
            }
            System.out.println("|");
        }
        System.out.println("Upper Triangle Matrix");
        for(int i=0;i<4;i++){
            System.out.print("|");
            for(int j=0;j<4;j++){
                if(i<=j){
                    System.out.print(m[i][j]+"  ");
                }
                else{
                    System.out.print(" _ ");
                }
            }
            System.out.println("|");
        }
    }
    
}
