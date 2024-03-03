public class anonymousArray {
    public static void main(String[] args) {
        int result=sum( new int[]{1,2,4,5,6});
        System.out.println(result);
    }
    static int sum(int[] a){
        int s=0;
        for(int val:a)
          s=s+val;
        return s;  
    }
}
