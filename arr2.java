
///wap input position and value to be insert

import java.util.Scanner;

public class arr2 {
    public static void main(String[] args) {
       int i ,n,pos;
       int val=90;
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the size of elements = ");
       n=sc.nextInt();
       int a[] = new int[100];
       for (i=0;i<a.length;i++){
        a[i]=sc.nextInt();
       }
       pos=3;
        System.out.println("elements after shifting position ");
        for(i=n;i>pos;i--){
         a[i]=a[i-1];
        }
        a[pos]=val;
        for(i=0;i<n;i++){
        System.out.println("prosition "+val);}
    }
}
