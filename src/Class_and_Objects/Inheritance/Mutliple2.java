package Class_and_Objects.Inheritance;

interface DefMeth1{
    
    
    //public void run(){} //will not work
    default void run(){
        System.out.println("defMeth1 Interface run");
    }
}
interface DefMeth2{
    
    default void run(){
        System.out.println("defMeth2 Interface run");
    }
}

class Runners implements DefMeth1,DefMeth2{
    @Override //can we override-> yes
    public void run(){
        System.out.println("Runner Class run");
        
 //to call interface default methods we can use super keyword  and 
 //we have to mention which interface
 
        DefMeth1.super.run();
        DefMeth2.super.run();
    }
    
}

public class Mutliple2 {

    public static void main(String[] args) {
       DefMeth1 obj = new Runners();
       obj.run();
      
    }
    
}
