class student{
    int r;
    String n;
    student(int R,String N){
        this.r=R;
        this.n=N;
        System.out.println(r+" "+n);

    }
    void display( String Name){
        System.out.println(Name+"....."+r);

    }
}


public class thisKeyword {
    public static void main(String[] args) {
        student s1=new student(2, "ABC");
        student s=new student(0, null);
        // s.display();
    }
}
