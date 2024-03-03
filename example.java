public class example {
    public static void main(String[] args) {
        int n=4;
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<2*n;j++){
             if(j<=n+i-1&&j>=n-i+1){
              System.out.print("*");
             }
             else{
              System.out.print(" ");
             }
            
            }
            System.out.println();
        }
    }
}
