import java.util.Scanner;

public class stringIndex {
    public static void main(String[] args) {
        String s,s2;
        char ch;
        int i,count=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String  ");
        s=sc.nextLine();
        // System.out.println("Enter the String  s2 ");
        // s2=sc.nextLine();
        
        // .out.printlSystemn("aeiouAEIOU".contains(s));

        for(i=0;i<s.length();i++){
            ch=s.charAt(i);
            // if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='O'||ch=='o'||ch=='U'||ch=='u'){
            //  count++;
            // }
            if("aeiouAEIOU".contains(String.valueOf(ch))){
             count++;
            }

            System.out.println(count);

        }
        sc.close();

    }
}


// ch>'a'&&ch<'z'