package Class_and_Objects.Abstract;

/*
Abstract class:
    It is basically used for extending it , like in future somebody will extend and use
it with another class. In Abstract class we cannot create objects in main method. 
We can extend this class and use this methods. We cannot instantiate the abstract class.

We use abstract class when we dont want to create object for it.
*/
abstract class Human{
    /*
    Abstract Method:
        we cannot give method definition only declaration.
    Abstract classes can have abstract methods and normal methods.
    */
    
    public abstract void eat();
    
    public void walk(){
        System.out.println("Hello I'm Abstract");
    }
    
}
//This Man class is called as concrete class
class Man extends Human{

    
//if we are extending an abstract class it is compulsory to implementing its abs methods.
    @Override
    public void eat() {
        System.out.println("Man Eats");
    }
    //To run this method we need to create reference of this class not super class
    public void run(){
       
        System.out.println("Man run");
    }
    
    
}

public class AbstractClass {

    public static void main(String[] args) {
        Human obj = new Man();
        //Human obj = new Human(); ->error;
        obj.walk();
        obj.eat();
       
        Man obj1= new Man();
        obj1.run();
        
    }
    
}
