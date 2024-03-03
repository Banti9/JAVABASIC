import java.util.ArrayList;

public class ArrayListGeneric {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("ABESIT");
        arr.add("ENGINEERING ");
        arr.add("COLLEGE");
        arr.add("GHAZIABAD");
        System.out.println(arr);
        String City=arr.get(3);
        System.out.println(City);
        // CoPy array list in other array
        ArrayList<String> temp=new ArrayList<>(arr);
        temp.add("STUDENT");
        System.out.println(temp);

    //   differnt parameter in arraylist


       temp.add(1,"COLLEGE");
       System.out.println(temp);

       temp.remove("COLLEGE");
    }
}
