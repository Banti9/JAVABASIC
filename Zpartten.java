

// devloped by banti
public class Zpartten {


    public static void main(String[] args) {
        int i,j,n=6;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
              if(i==1||i==n){
               System.out.print("* ");
              }
              else if(j==n-i+1){
                System.out.println("* ");
              }
              else{
                System.out.print("  ");
              }
            } 
          
            System.out.println();
          }
         
    }
}
