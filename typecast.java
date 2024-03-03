public class typecast {
    public static void main(String[] args){
        int a=10;
        int b=20;
        // int c;
        boolean c;
        c= a>b && ++b>a;
        System.out.println(c);

        long l=123;
        float f=123.4567f;
        // l=f cannot store the float value in long  but float size 4 and long 8
        f=l;
        System.out.println(f);
    }
}
