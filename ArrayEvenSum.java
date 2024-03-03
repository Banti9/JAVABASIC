
// Write a Java program to find sum of even values in a given integer array
//By Banti

public class ArrayEvenSum {
    public static void main(String[] args) {
    
       int i;
        int[] arr = { 5, 10, 15, 20, 25 };
       System.out.println(" ARRAY = ");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
        
        int sum = 0;
        for (int arr1:arr) {
            if(arr1%2==0){
            sum += arr1;
          }
        }

        

        
        System.out.println("Sum: " + sum);
        
    }
}
