package Class_and_Objects.Polymorphism;
/*
Binding which can be resolved at compile time
Also called early binding
Binding happens before program runs
eg. method overloading

Compiler will know which type it is and which method should be invoked for this 
call at the compile time this is static binding.
 
*/

public class Static_binding {

    void area(float r){
        
        final float PI=3.14f;
        double area = PI* r*r;
        
        System.out.println("Area of circle: "+area);
    }
    
    void area(float l, float b){
        
        double area= l*b;
        System.out.println("Area of Rectangle : "+area);
    }
    
    public static void main(String[] args) {
    
        Static_binding ob = new Static_binding();
        
        /*
        Binding will be done using the parameter in this one parameter is there 
        so it will be binded to area(r) method compiler knows for this method it 
        should invoke frst method which is having one parameter.
        */
        ob.area(5); 
        /*
        when method call comes with 2 parameters compiler will bind it to second method 
        with also have same type of parameters compiler knows it need to be invoke that second method
        */
        ob.area(10, 20);
    }
    
}
