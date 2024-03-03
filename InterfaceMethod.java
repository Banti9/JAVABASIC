

/**
 * InnerInterfaceMethod
 */
public interface InnerInterfaceMethod {
          int a=90;
          void display(){

          }
          void xyz(){

          }
   
}
/**
 * InnerInterfaceMethod_1
 */
public class InnerInterfaceMethod_1 {

   
}
 class A implements InnerInterfaceMethod {
void display(){
    System.out.println(a);
}
   
}


public class InterfaceMethod {
   public static void main(String[] args){
    InnerInterfaceMethod i=new InnerInterfaceMethod() {
      
    };
   }
}
