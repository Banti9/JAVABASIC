import java.util.Scanner;


public class sum2Darry {
    static void input(int[][] arr){
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements of Matrix");
       for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }
    static void display(int[][] arr){
        
            for(int i=0;i<3;i++){
                System.out.print("|");
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("|");
        }    
    }
    static void sum(int[][] arr1,int[][] arr2,int[][] arr3){
        int sum=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                
                 
                    arr3[i][j]=arr1[i][j]+arr2[i][j];
            
            }
        }
        
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int[][] arr1=new int[3][3];
          int[][] arr2=new int[3][3];
          int[][] arr3= new int[3][3];
          input(arr1);
           System.out.println(" Array1 ");
           display(arr1);
          input(arr2);
         System.out.println("Array2");
          display(arr2);
          sum(arr1,arr2,arr3);
          System.out.println("Sum of Two Array");
          display(arr3);
          

    }
}
