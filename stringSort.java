public class stringSort {
    public static void main(String[] args) {
        String[] str={"Rupanjali","dipanjali","Rupesh","Banti","Sweety","Nidhi","Siddhi","Anshu","Shivani","Ishant"};

        for(int i=0;i<str.length;i++){
            for(int j=0;j<str.length-1-i;j++){
                if(str[j].CompareTo(str[j+1])>0){
                    string x=str[j];
                    str[j]=str[j+1];
                    str[j+1]=x;
                }
            }
        }
    }
}
