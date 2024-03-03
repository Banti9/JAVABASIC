// public class IsShape {
    
// }
interface IShape {
    void S1();
    void S2();
    void S3();
}

class Circle implements IShape {
    public void S1() {
        // Implementation for S1() method specific to Circle
    }

    public void S2() {
        // Implementation for S2() method specific to Circle
    }

    public void S3() {
        // Implementation for S3() method specific to Circle
    }
}
public class IsShape {
    public static void main(String[] args) {
        IShape b ;
        Circle arr = new Circle();
      arr.S1();
    //   b.S2();  
    }
    // IShape arr = new IShape();
}
