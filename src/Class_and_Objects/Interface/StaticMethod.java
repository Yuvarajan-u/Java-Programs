
package Class_and_Objects.Interface;

interface StaticMethod1{
    void run();
    // static methods of interface introduced in JAVA 8
    // so we dont need objects to call methods of interface it is the usage of static interface method
    static void show(){
        System.out.println("Im static method of interface");
    }
    //Can we have variables , yes and if we create variables inside interface it becomes
    //Final or constant by default we cannot modify it
    double PI=3.14;
        
}
class InterfaceC implements StaticMethod1{
        int r=5;
        double area;
    @Override
    public void run() {
        //PI=3.15 -> gives error
        area=PI*r*r;
        System.out.println("Area: "+area);
    }
    
}
public class StaticMethod {

    public static void main(String[] args) {
       StaticMethod1.show();
       
       StaticMethod1 obj = new InterfaceC();
       obj.run();
    }
    
}
