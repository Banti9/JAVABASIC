public class marge {
    public static void conquer(int a[],int si,int mid, int ei){
        int marged[]=new int[si-ei+1];
        int id1=si;
        int id2=mid+1;
        int x=0;
        while(id1<=mid && id2<=ei){
            if(a[id1]<=a[id2]){
                marged[x++]=a[id1++];
            }
            else{
                marged[x++]=a[id2++];
            }
        } 
        while(id1<=mid){
          marged[x++]=a[id1++];
          
          
        }
        while(id2<=ei){
            marged[x++]=a[id2++];
        }
        for(int i=0 , j=0;i<marged.length;i++,j++){
            a[j]=marged[i];
        }
    }
    public static void divide(int a[],int si,int ei){
        si=0;
        int mid=si+(ei-si)/2;
        if(si>=ei){
          return;
        }
        divide(a, si, mid);
        divide(a, mid+1, ei);
        conquer(a, si, mid,ei);

    }
    public static void main(String[] args) {
        int a[]={1,4,8,56,3,2,80,45,5};
        int n=a.length;
        
        
        divide(a, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.print( a[i]+" ");    
        }
        System.out.println(" ");
        


    }
}
