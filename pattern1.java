// ?patter no. 1
public class pattern1 {
     public static void main(String[] args) {
        int i,j,n=4;
        
        for(i=0;i<n;i++){
          for(j=0;j<n;j++){
            System.out.print("*");
          } 
       
          System.out.println();
        }
    System.out.println();
       
      
          
        for(i=0;i<n;i++){
            for(j=i;j>0;j--){
              System.out.print("*");
            } 
        
            System.out.println();
          }

          
            
          for(i=0;i<n;i++){
            for(j=0;j<=n;j++){
                if((j<=n)&&(j>=n-i)){
              System.out.print("*");}
              else{
                System.out.print(" ");
              }
            } 
          //   System.out.print("\n");
            System.out.println();
          }
       System.out.println();
      
 
          for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(j<=n&&j>=i){
              System.out.print("*");}
              else{
                System.out.print(" ");
              }
            } 
          //   System.out.print("\n");
            System.out.println();
          }
       System.out.println();

          for(i=1;i<=n;i++){
            for(j=1;j<=2*n-1;j++){
             if(j>=n-i+1&&j<=n+i-1){
              System.out.print("*");}
              else{
                System.out.print(" ");
              }
            }
            System.out.println();
          }
          System.out.println();
          for(i=1;i<=n;i++){
            for(j=1;j<=2*n-1;j++){
                if(j>=i+1&&j<=2*n-i+1){
              System.out.print("*");}
              else{
                System.out.print(" ");
              }
            } 
          //   System.out.print("\n");
            System.out.println();
          }

 System.out.println();
          for(i=1;i<=2*n-1;i++){
            for(j=1;j<=n;j++){
                if(i>=n-j+1&&i<=n+j-1){
              System.out.print("*");}
              else{
                System.out.print(" ");
              }
            } 
          //   System.out.print("\n");
            System.out.println();
          }
          System.out.println();
          for(i=1;i<=2*n;i++){
            for(j=1;j<=n;j++){
                if(i>=n-j+1&&i<=2*n+j-1){
              System.out.print("*");}
              else{
                System.out.print(" ");
              }
            } 
          //   System.out.print("\n");
            System.out.println();
          }
    }
}
