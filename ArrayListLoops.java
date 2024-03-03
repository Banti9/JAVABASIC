import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListLoops {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        int sum=0;
        a.add(20);
        a.add(40);
        a.add(89);
        a.add(80);
        a.add(40);
        // Using Simple loop
        for(int i=0; i<a.size();i++){
            sum=sum+a.get(i);
            // System.out.print(a.get(i)+" ");
        }
        System.out.println(sum);
        // Using Each for loop
        for(Integer val:a){
            System.out.print(val+" ");
        }

        ListIterator <Integer> lr=  a.listIterator();
        
    }
}
