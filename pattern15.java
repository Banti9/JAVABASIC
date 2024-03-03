
//Devloped by Banti
public class pattern15 {

    public static void main(String[] args) {
    int i,j,n=5,x;
        for(i=1;i<=n;i++){
            
            x=1; 
            for(j=n;j>=1;j--){
              if(j>=n-i+1&&j<=n){
               System.out.print(x +" ");
              }

              else{
                System.out.print("  ");
              }
              x++;
            } 
            
          
            System.out.println();
          }
    }
}
