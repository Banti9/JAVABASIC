
 class x {
    int b;
    static int a;
    public static void show(){
        System.out.println("Hello GOd!");
    }
    public void display(){
        System.out.println("Hello Godies!");
    }

 }
public class wt2 {
    public static void main(String[] args) {
        x obj= new x();
        obj.show();
        x.a=9;
        x.show();
        obj.b=30;
        System.out.println(obj.b);
        System.out.println(x.a);
        obj.a=79;
        System.out.println(obj.a);
        obj.display();
        
    }
}
