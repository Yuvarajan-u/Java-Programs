package Class_and_Objects.Polymorphism;
/*
Dynamic Binding: (over riding) it is also called as late binding

we have create a reference for super class and we are storing
different obj for it subclasses. 

At the compile time it will look for draw method in shape
class (in loop) for sub classes also because it reference variable
belongs to super class shape. 

At the run time:

It will look for all classes first it will look for shape class because s is 
pointed (assigned) to object of shape class.

then reference s points to object of Rect class Rect class draw method is now invoked
as same as circle class's method also get invoked

dynamic binding works based on object type, not on the reference variable 
compiler will not know it type at the compile time compiler will know that 
at run time.

Static vs Dynamic

Static binding uses Type information for binding while Dynamic binding
uses objects to resolve binding.

Binding of all the static, private and final methods are done at compile time

Overloaded methods are resolved using static (compile time)
Overriden methods are resolved using dynamic (run time)

*/

 class Shape{
    void draw(){
        System.out.println("shape class");
    } 
   
}

class Rect extends Shape{

    @Override
    void draw() {
        System.out.println("Rectangle");
    }
     
}
class Circle extends Shape{

    @Override
    void draw() {
        System.out.println("Circle");
    }
    
}
public class Dynamic_Binding {

    public static void main(String[] args) {
        Shape s;
        s= new Shape();
        s.draw();
        s= new Rect();
        s.draw();
        s= new Circle();
        s.draw();
            
        
    }
    
}
