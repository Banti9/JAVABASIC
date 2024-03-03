
class abc{
    static{
        System.out.println(" In static block abc ");
    }
}
public class second {
    static{
        System.out.println("In static block ");
    }
    public static void main(String[] args) {
        abc n=new abc();
         abc n1=new abc();
          abc n2=new abc();
           abc n3=new abc();
        
    }
}
