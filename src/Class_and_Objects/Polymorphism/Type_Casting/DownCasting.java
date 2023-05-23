package Class_and_Objects.Polymorphism.Type_Casting;

/*
    Upcasting                                               
	A child object is typecasted to a parent object.	
	We can perform Upcasting implicitly or explicitly.	
	In the child class, we can access the 
        methods and variables of the parent class.	
	We can access some specified methods of the child class.
syntax:	
        Parent p = new Child()	

    DownCasting:
        The reference of the parent class object is passed to the child class.
	Implicitly Downcasting is not possible.
	The methods and variables of both the classes(parent and child) can be accessed.
        All the methods and variables of both classes can be accessed by performing downcasting.
syntax:
        Parent p = new Child()
        // Child c = new Parent(); -> gives error and it is written as below.
        by specifying (Child) explicitly helps to do downcasting.
        Child c = (Child)p;
        
If we want to do inheritance in reverse like class a extends b but we need to access a's items 
using b we can do it with downcasting

for eg in class parent name is available by downcasting we can access name through child class
object reference c.name="yuva"; this is possible only by using downcasting

By using downcasting we can get the child class unique methods also.

but sometimes it will throw classcastexception to solve we need to use instanceof operator.
 */
//Parent class  
class Parent1 {

    String name;

    // A method which prints the data of the parent class   
    void showMessage() {
        System.out.println("Parent method is called");
    }

    void run() {
        System.out.println("run parent class");
    }
}

// Child class   
class Child1 extends Parent1 {

    int age;

    // Performing overriding  
    @Override
    void showMessage() {
        System.out.println("Child method is called");
    }

    void cRun() {
        System.out.println("run child class");
    }
}

public class DownCasting {

    public static void main(String[] args) {
        Parent1 p = new Child1();
        p.name = "yuva";

        // Performing Downcasting Implicitly   
        //Child c = new Parent(); // it gives compile-time error   
        // Performing Downcasting Explicitly   
        Child1 c = (Child1) p;

        c.age = 18;
        c.name = "yuvarajan"; //parent class variable accessed by child object.
        System.out.println(c.name);   //here we are using parent class name using child class
        System.out.println(c.age);
        c.showMessage();
        c.run(); // we can call parent run method by child object.
        c.cRun();
        //gives error -> to understand where downcasting used and instanceof used
        Parent1 p1 = new Parent1();
        try {

            // p1 doesnt refers to child class so we cannot do downcasting.
            Child1 c1 = (Child1) p1;
            c1.run();
            c1.cRun();
            c1.showMessage();
        } catch (Exception e) {
            System.out.println("Error: " + e);
            System.out.println("Parent cannot be casted to child");
        } finally {
            if (p1 instanceof Child1) {
                Child1 c1 = (Child1) p1;
                c1.run();
                c1.cRun();
                c1.showMessage();
            } else {
                System.out.println("\nDowncasting not possible");
            }
        }

    }

}
