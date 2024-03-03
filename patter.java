public class patter {
    public static void main(String[] args) {
        int i,j,n=5;
        char sy='a';
        int B;
        for(i=1;i<=n;i++){
            for(j=n;j>=1;j--){
              if(j>=n-i+1&&j<=n){
               System.out.print(sy+" ");
              }

              else{
                System.out.print("  ");
              }
              
            } 
            sy++;
          
            System.out.println();
          }

System.out.println();
     char c='A';
          for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
              if(j>=n-i+1&&j<=n){
               System.out.print(c++ +" ");
              }

              else{
                System.out.print("  ");
              }
              
            } 
            
          
            System.out.println();
          }
        
          int p=0,x;

          for(i=1;i<=n;i++){
            p=p+i;
            x=p; 
            for(j=1;j<=n;j++){
              if(j>=n-i+1&&j<=n){
                
               System.out.print(x-- +" ");            }

              else{
                System.out.print("  ");
              }
              
            } 
            
          
            System.out.println();
          }

System.out.println(" pattern");

          for(i=1;i<=n;i++){
            
            x=1; 
            for(j=1;j<=n;j++){
              if(j>=n-i+1&&j<=n){
               System.out.print(x++ +" ");
              }

              else{
                System.out.print("  ");
              }
              
            } 
            
          
            System.out.println();
          }
          System.out.println(" pattern");

          for(i=1;i<=n;i++){
            
            x=1; 
            for(j=1;j<=n;j++){
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

          System.out.println(" pattern");
           int X=0;
          for(i=1;i<=n;i++){
            
            X=X+i;
              
            for(j=1;j<=n;j++){
              if(j>=n-i+1&&j<=n){
               System.out.print(X+" ");
              }

              else{
                System.out.print("  ");
              }
              
            } 
            
          
            System.out.println();
          }
          System.out.println(" pattern");
        

         int s=0 ;
         int r;
          for(i=1;i<=n;i++){
        
          r=s+i;
            for(j=1;j<=n;j++){
              if(j>=n-i+1&&j<=n){
               System.out.print(r++ +" ");
              }

              else{
                System.out.print("  ");
              }
              
            } 
            
          
            System.out.println();
          }

System.out.println();
System.out.println(" pattern");

          for(i=1;i<=n;i++){
            
            x=i; 
            for(j=1;j<=n;j++){

              if(j>=n-i+1&&j<=n){
               System.out.print(x +" ");
              }

              else{
                System.out.print("  ");
              }
              
            } x++;
            
          
            System.out.println();
          }
    
    }

}
    

