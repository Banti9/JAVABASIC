class student{
    // roll and name are instance var
    int roll;
    String name;
    student (String name){
        this.name=name;
    }
    public void display(){
        System.out.println(name);
    }
}
public class first{

    public static void main(String[] args){
        // s and s1 is local var
        student s=new student("banti");
        student s1=new student("chauhan");
        System.out.println(s.name);
        System.out.println(s1.roll);

    }

}