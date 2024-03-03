
//Devloped by Banti
public class pattern9 {
    public static void main(String[] args) {
        int i,j,n=5;
        for(i=n;i>=1;i--){
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
