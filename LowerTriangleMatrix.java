import java.util.Scanner;

public class LowerTriangleMatrix {
    static void input(int[][] m)
    {
        Scanner in=new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                m[i][j]=in.nextInt();
            }
            System.out.println();}
        }
    
    static void printMatrix(int[][] m){
       for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(m[i][j]+"  ");
            }
            System.out.println();
        } 
    }
    static void logicOfLowerTriangle(int[][] m){
       for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
            if(i>=j){
                System.out.print(m[i][j]+"  ");
            }
            else{
                System.out.print("  ");
            }
            }
            System.out.println();
        }
    } static void logicOfUpperTriangle(int[][] m){
       for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
            if(i<=j){
                System.out.print(m[i][j]+" ");
            }
            else{
                System.out.print("  ");
            }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] m1=new int[3][3];

        int[][] m2=new int[3][3];
        // System.out.println("Matrix elements are ");
        // input(m1);
        System.out.println("Matrix elements are ");
        input(m2);
        System.out.println("Matris is ");
        printMatrix(m2);
        System.out.println("Lower Triangle Matrix is");
        logicOfLowerTriangle(m2);
        System.out.println("Uperre Triangle Matrix is");
        logicOfUpperTriangle(m2);
        

    }
}
