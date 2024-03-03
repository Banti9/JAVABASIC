
//WAP  to print reverse of array
// BY Banti

public class aary5 {

    public static void main(String[] args) {
        int i,temp;
        int[] arr = { 5, 10, 15, 20, 25 };
       System.out.println(" ARRAY = ");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
        int n =arr.length;
        System.out.println("Reverse of array");
        for( i=0;i<n/2;i++)
        {
          temp=arr[i];
          arr[i]=arr[n-1-i];
          arr[n-1-i]=temp;
        }

        for(i=0;i<n;i++){
            System.out.print(arr[i]+"  ");
        }
        
    }
}
