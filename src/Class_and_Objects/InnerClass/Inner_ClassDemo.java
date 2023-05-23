package Class_and_Objects.InnerClass;
/*
Inner class types:
    Member class
    Static Class
    Anonymous Class
*/
class outerClass{
    //Member Variable
    int a;
    //Member Method
    public void show(){
        System.out.println("Outer class Display");
    }
    //Inner Class inside the outerClass
    //Member Class
    /*
    When we can use inner class?
    
    We can use inner class when it is only useful for outer class, 
    Inner class's only purpose is work with outer class.
    */
    class Inner{ //It will create a file name like --> outerClass$Inner.class
        public void display(){
            //we can access outer class variables with inner classes.
            a=10;
            System.out.println("Inner class Display "+a);
        }
    }
    //Static inner class
    static class InnerStatic{
        public static void display(){
            System.out.println("Static Inner class Display");
        }
    }
}
public class Inner_ClassDemo {
    
    // we can create variables,methods, class in main class
    public static void main(String[] args) {
        outerClass obj = new outerClass();
        obj.show();
        
        //creating object for Inner Class
        
        /* 
        Error: Inner obj1 = new Inner(); because it is inside outerClass
        We have to mention it belongs to outerClass
        In order to use inner class we have to use outer class 
        and to create object we need to use outerClass object
        */
        //Outer class.Inner class objectname = outerclass Object. new InnerClass Constrcutor();
        outerClass.Inner obj1 = obj.new Inner();
        obj1.display();
        
        //Static inner class invokation
        //Outer class.Inner class objectname= new outerClass.InnerStatic Class Constructor();
        outerClass.InnerStatic obj2= new outerClass.InnerStatic();
        //Static inner class static method calling with object
        obj2.display();
        //without object
        outerClass.InnerStatic.display();
    }
    
}
