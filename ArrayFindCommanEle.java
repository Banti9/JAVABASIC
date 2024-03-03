// Write a Java Program to find common element from given two integer array ( No duplicate values in a single arrays)
// By Banti

import java.util.Scanner;

public class ArrayFindCommanEle {
    public static void main(String[] args) {
                int[] arr1=new int[20];
        int[] arr2=new int[20];
        Scanner sc =new Scanner(System.in);
        int n,i,j;
        System.out.println("Enter the size of the array:");
        n=sc.nextInt();
         System.out.println("Enter elements of the array1:");
          for(i=0;i<n;i++)
             arr1[i]=sc.nextInt();
        System.out.println("Enter elements of the array2:");
          for(i=0;i<n;i++)
             arr2[i]=sc.nextInt();
        System.out.println("Common elements in both the array is:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++){
                 if(arr1[i] == arr2[j])
                    System.out.print(" "+arr1[i]);
            }
        }

    }
}
