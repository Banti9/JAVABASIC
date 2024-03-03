
abstract class Branch{
    double minbalance=1000.0;

    public abstract double idProof(String proof);
    public abstract double adressProof();
    double cilrcle(double r){
      return 3.14*r*r;
    }

    
}

/**
 * Innerabstractclasss
 */
class UPBranch extends Branch {
 double  idProof(String proof){
    if (proof.equalsIgnoreCase("pan card")) {
        return true;
    }
    
 }  
}

public class abstractclasss {
    public static void main(String[] args) {
     Branch obj=new Branch() ;   
     obj.
    }
}
