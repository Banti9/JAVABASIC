import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class substring {
    public static void main(String[] args) {
        String s;
        int i,alphabet=0,digit=0,spcialchar=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String  ");
        s=sc.nextLine();
        for(i=0;i<s.length();i++){
            char ch = s.charAt(i);
        
            if(ch>='a'&&ch<='z' || ch>='A'&&ch<='Z'){
                alphabet++;
            }
            else if(ch>='0'&&ch<='9'){
                digit++;}
                else{
                    spcialchar++;
                }
        }
        System.out.println("Alphabets "+alphabet);
        System.out.println("DIGITS "+digit);
        System.out.println("spacialcahr "+spcialchar);
    
        sc.close();
 

    }
}
