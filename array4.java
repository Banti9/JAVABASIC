

import java.util.Scanner;
// WAP to print alternat valule of array
public class array4 {
    public static void main(String[] args) {
        int i,temp=0,j;
    
        
        Scanner sc=new Scanner(System.in);
    
       
    
        int[] arr=new int[10];
        int[] b=new int[arr.length]; 
       
        System.out.println("Enter the elements  of array = ");
        for(i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int n=arr.length;
        for(j=n-1,i=0;j>=0,i<=n/2;j--,i++){
           temp=a[i];
          b[j]=arr[i];    
               
           }
       System.out.println("revers array is "+b[j]);
          
       sc.close();
    }
}
