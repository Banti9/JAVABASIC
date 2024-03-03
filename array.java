// Write a Java program to find the second largest element in an array.
// By Banti
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
    
        int i;
        int max;
        
        Scanner sc= new Scanner(System.in);
    
       
    
        int[] arr=new int[10];
       
        System.out.println("Enter the elements  of array = ");
        for(i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        max=arr[0];
        
        for(i=0;i<arr.length;i++){
           if(arr[i]>max){
               max=arr[i];
               
           }}
       System.out.println("Max value is "+max);
          
       sc.close();

        
    }
}
