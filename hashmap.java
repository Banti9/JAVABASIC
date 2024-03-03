import java.util.HashMap;

public class hashmap {
    // hash map cantain uniqe key
    //  value cannot access  without key
// it works as dictionary
    // Value can be dublicat
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(1,1);
          hm.put(2,4);
            hm.put(3,9);
              hm.put(4,16);
                hm.put(5,25);
                System.out.println(hm);



        HashMap<String,String> s=new HashMap<>();

       s.put("Name :", " Km Banti chauhan");
        s.put("Roll No. :"," 2102900100071");

       s.put("Branch :"," CSE");
       s.put("College :"," ABESIT");
       s.remove("Branch");
       System.out.println(s);

     String s1="ABESIT ENGINEERING COLLEG";
    HashMap<Character,Integer> c=new HashMap<>();
    for(char ch:s1.toCharArray()){
      c.put(ch,c.getOrDefault(ch,0)+1);}
    System.out.println(c);

    for(char key:c.keySet()){
        System.out.println(key+" ");
    }
    //    System.out.println(s);
        }
}
 