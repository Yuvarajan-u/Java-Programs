package Class_and_Objects.Polymorphism.OverRiding;

class RideA{
    int speedlimit=90;
    public void show(){
        
        System.out.println("In A");
    }
    public void run(){
        System.out.println("In A unique");
    }
}
class RideB extends RideA{
    int speedlimit=150;
    @Override
    public void show(){
        
        //to call class A's show method use 
        
        //super.show();
        System.out.println("In B");
    }
    
}
public class Method_Overriding {

    public static void main(String[] args) {
        //to call A
        RideA obj1 = new RideA();
        obj1.show();
        System.out.println(obj1.speedlimit);
        System.out.println(" ");
        //to call B
        RideB obj2 = new RideB();
        obj2.show();
        obj2.run();
        System.out.println(obj2.speedlimit);
        System.out.println(" ");
        //to call B with class A
        //A is reference and B is Implementation so output is B
        RideA obj3 = new RideB();
        obj3.show();
        obj3.run();
        System.out.println(obj3.speedlimit);
        
        /*
        Overriding cannot be acheived by data members 90 will be 90 for all time..
        */
        
    }
    
}
