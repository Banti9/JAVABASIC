import webtech.abc;

class abc{
   int n=900;
  void abc(){

    System.out.println("In abc ");
}
//  void
}
class B extends abc{
    // int n=800;
    next s="B";
    void abc(){
        // n=200;
        
        System.out.println("In B and abc"+super.n+ +s);
    }
}
class C extends B{
    C(){
        System.out.println("IN c  abc and B ");
    }
}
class D extends B{
  void D(){
    System.out.println("in D abc B and C");
   }
}
public class inheritances {
    public static void main(String[] args) {
        C c =new C();
        D d =new D();
        d.D();
        B b = new B();

        abc a=new abc();
        b.abc();
        a.abc();
    
        // a=9;

    }
}
