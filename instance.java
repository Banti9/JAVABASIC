class abc{
    int a=10;
    int b=90;
    {
        System.out.println("instance block abc");
    }
    static void xyz(){
        System.out.println("STATIC");
    }
    void display(){
        System.out.println(a);
        xyz();
        System.out.println(b);

    }
}
public class instance {
     static{
       System.out.println("banti");
    }
    public static void main(String[] args) {
        abc n1=new abc();
        abc n2=new abc();//these are instance variable
        abc n3=new abc();
        abc n4=new abc();
        abc a1=new abc();
        a1.display();
        System.out.println(a1);
        abc b1=new abc();
        b1.display();
    }
}
