import java.util.HashMap;

public class hm {
    // wap to count frequence of  vowels
    public static void main(String[] args) {
        String s1="ABESIT ENGINEERING COLLEG";
        HashMap <Character,Integer> hMap=new HashMap<>();

       for(char ch:s1.toCharArray()){
        if(ch=='A'||ch=='I'||ch=='E'||ch=='O'||ch=='U'){
      hMap.put(ch,hMap.getOrDefault(ch,0)+1);}
    
      }
    
       System.out.println("Frequency of Vowel "+hMap);

          
    }
}
