
// Write  a Java program to insert an element (specific indrex) into an array.
// By Banti
import java.util.Scanner;

public class ArrayInsertEle {
    public static void main(String[] args) {
        
          Scanner sc=new Scanner(System.in);
          int[] arr=new int[30];
         int n;
       int i;
       System.out.println("Enter the size of array");
       n=sc.nextInt();
       System.out.println("Enter the elements of array ");
       for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       System.out.println("ARRAY : ");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
         System.out.println();
        System.out.println("Enter the index to insert a element from the array:");
         int inx=sc.nextInt();
         System.out.println("Enter the element to insert in the array:");
         int ele=sc.nextInt();
         for( i=n-1;i>=inx;i--)
              arr[i+1]=arr[i];
              arr[inx]=ele;
                System.out.println("New  array is:");
        
        int m=n+1;
        for(i=0;i<m;i++){
            System.out.println(arr[i]);
        }
           sc.close();
    }
}
