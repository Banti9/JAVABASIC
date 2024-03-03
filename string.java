import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        String s,s2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String  ");
        s=sc.nextLine();
        System.out.println("Enter the String  s2 ");
        s2=sc.nextLine();
        
        System.out.println(s.compareTo(s2));
        sc.close();


    }
}


///it  gives the input in ascii value diffence between first latter missmatch.