package Class_and_Objects.Final;
/*
Final keyword with Variable:
    Final is used to make constant like once we declared we cannot modify again. 
*/
class FinalVar{
    
    //final double PI=3.14;
    final double PI;
    public FinalVar() {
        PI=3.14;
        //PI=3.15; ->gives error
    }
    void AreaofCircle(double r){
        double area = PI*r*r;
        System.out.println("Area of circle is: "+area);
    }   
}
//final class
// final classes cannot be inherited
final class Final_Class{
    public void show(){
        System.out.println("IN Final_Class");
                
    }
}

//class B extends Final_Class{} //-> error

//final method

class FinalMethod{
    public final void show(){System.out.println("Final method");}
}
class FMb extends FinalMethod{
    //Final method cannot be overRidden
    //public void show(){{System.out.println("fmB method");}
    
}
public class FinalClass {

    public static void main(String[] args) {
       FinalVar obj = new FinalVar();
       obj.AreaofCircle(5);
       
       Final_Class obj1= new Final_Class();
       obj1.show();
       
       FinalMethod obj2= new FinalMethod();
       obj2.show();
    }
    
}
