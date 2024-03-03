
/**
 * InnerMain
 */
interface IShape {
     void f();
     } 
class Circle implements IShape {
     public void f() {
         System.out.println("Interface"); 
        } 
        public void c() {
             System.out.println("class"); 
            } } 
           
interface sup { 
    int a = 7;
 } 
 class sub implements sup {
     void fun() { 
        // a = 10;
         System.out.println("a = " + a);
     } 
} 
public class Main {
         public static void main(String[] args) {
        //  { sub obj = new sub(); 
            // obj.fun();
         
         IShape obj = new Circle(); 
         obj.f(); 
}
}
