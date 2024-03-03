
// Write a Java program to remove an element (at specific index) from an array.
// By Banti

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRemoveEle {
public static void main(String[] args) {
        int i,index;
        Scanner sc=new Scanner(System.in);

         int[] arr = { 5, 10, 15, 20, 25 };

         System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println();
        System.out.println("Enter the index for removing  : ");
        index=sc.nextInt();
                 for(i=index+1;i<arr.length;i++){
               arr[i-1]=arr[i];}
                System.out.println("New  array is:");
             for(i=0;i<arr.length-1;i++)
              System.out.print(" "+arr[i]);    
    }
    }
