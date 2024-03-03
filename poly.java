
class abc{
    double add(double a,int b){
        System.out.println("int type parameter");
        return a+b;
    }
    int add(int a,int b,int c){
        System.out.println("defrent parameter");
        return a+b+c;
    }
    double add(double a,double b){
        System.out.println("overloading");
        return a+b;
    }
}
public class poly {
    
    public static void main(String[] args) {
        abc obj =new abc(); 
        // obj.add(89900,800000);
        System.out.println(obj.add(900, 9080));
        // System.out.println(obj);
    }
}
