
//DevelOped by BANTI
public class pattern13 {

    public static void main(String[] args) {
        int i,j,n=3;
        for(i=1;i<=n;i++){
            for(j=1;j<=2*n-1;j++){
             if(j>=n-i+1&&j<=n+i-1){
              System.out.print("*");}
              else{
                System.out.print(" ");
              }
            }System.out.println();}
        for(i=n-1;i>=1;i--){
            for(j=1;j<=2*n-1;j++){
             if(j>=n-i+1&&j<=n+i-1){
              System.out.print("*");}
              else{
                System.out.print(" ");
              }
            }
            System.out.println();
          }
    }
}
