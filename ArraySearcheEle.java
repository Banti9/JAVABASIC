// Write a Java program to find the index of an array element. If the element is not found print -1.
// BY BAnti

import java.util.Scanner;

public class ArraySearcheEle {
    public static void main(String[] args) {
        int i,ele;
        Scanner sc=new Scanner(System.in);

         int[] arr = { 5, 10, 15, 20, 25 };
       System.out.println(" ARRAY = ");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
        System.out.println("Enter the element  : ");
        ele=sc.nextInt();
        int index = -1;
        for ( i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                index = i;
                break;
            }
        }

        for(i=0;i<arr.length;i++){
            if(index!=-1){
            System.out.println(arr[i]+" is found at "+i+ " index");}
            else{
                System.out.println("Element is not found");
            }
        }
        
        
    }
}
