import java.util.ArrayList;

public class ArrayListRemove {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>() ;
        a.add(30);
        a.add(40);
        a.add(20);
        a.add(10);
        a.add(40);
        a.add(60);
        a.add(80);
        a.add(50);
        System.out.println(a);
        a.remove((Integer)30);
        System.out.println(a);
        a.size();
        System.out.println("Size of array list  "+a.size());


        System.out.println(a.indexOf(40));
        System.out.println(a.subList(0, 3));
        System.out.println(a.contains(58));
        //  String 
        ArrayList<String> s=new ArrayList<>();
        s.add("Banti");
        s.add("Kajal");
        s.add("Priti");
        s.add("Beauty");
        System.out.println(s);
        // s.remove("Beauty");
        // System.out.println(s);
        s.remove(3);
        System.out.println(s);

        // s.removeAll(s);
        s.clear();
        System.out.println(s);


    }
}
