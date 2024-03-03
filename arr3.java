

// Write a Java program to sum and average values of an array
//By Banti


public class arr3 {
    public static void main(String[] args) {
       int i;
        int[] arr = { 5, 10, 15, 20, 25 };
       System.out.println(" ARRAY = ");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
        
        int sum = 0;
        for (int arr1: arr) {
            sum += arr1;
        }

        double average = (double) sum / arr.length;

        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}



 