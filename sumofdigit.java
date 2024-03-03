// import java.lang.FdLibm.Pow;
import java.lang.Math;
import java.util.Scanner;

public class sumofdigit {
    public static void main(String[] args) {
        int i, n,d,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the digit = ");
        n=sc.nextInt();
        for(i=n;i!=0;Math.pow(10,i-- )){
          d=i%10;
          sum=sum*d+n;
          n=(int)n/10;
          System.out.println(sum);
        }
          sc.close();

        
    }
}
