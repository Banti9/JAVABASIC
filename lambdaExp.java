import java.util.ArrayList;
import java.util.Comparator;

import javax.swing.text.html.parser.Element;

public class lambdaExp {
    public static void main(String[] args) {
        //// d=.nextDouble();
        ArrayList<Integer> a=new ArrayList<>();
        a.add(20);
           a.add(200);  
            a.add(2000);  
             a.add(790);  
              a.add(300);   
              a.add(28);
        //   sort the Element
              a.sort((n1,n2)->n1.compareTo(n2));  //asending order
              System.out.println(a);
              // reverOrder method
              a.sort(Comparator.reverseOrder());
            a.sort((n1,n2)->n2.compareTo(n1));  //desending order
              System.out.println(a);
              a.removeIf((n)->n>100);
              System.out.println(a);
              for(Integer b:a)
              System.out.println(b+" ");


            //   STring

            ArrayList<String> s=new ArrayList<>();
            s.add("Banti");
            s.add("Sweety");
            s.add("Trisha");
            s.add("Google");
            s.add("MicroSoft");
            s.add("WhatsApp");
                          System.out.println(s+" ");





              
    }
}
