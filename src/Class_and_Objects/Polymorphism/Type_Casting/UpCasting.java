package Class_and_Objects.Polymorphism.Type_Casting;

/*
Upcasting is a type of object typecasting in which a child object is typecasted 
to a parent class object. By using the Upcasting, we can easily access the 
variables and methods of the parent class to the child class. Here, 
we don't access all the variables and the method. 
We access only some specified variables and methods of the child class. 
Upcasting is also known as Generalization and Widening.

In Java, we rarely use Upcasting. 
We use it when we need to develop a code that deals with only the parent class. 
Downcasting is used when we need to develop a code that accesses behaviors of the child class.


upcasting is as same as method overriding(dynamic polymorphism)
we can invoke child class method by creating object of parent class and refering to child class
parent ob = new child();

ob.show(); will be in parent and child class but it will call child class method 
this is upcasting.
it is happening implicitly we can do by adding(parent) infront of child class while
object creation. 
Parent ob = (Parent)new  Child();
 */

class Parent2 {
 int age=20;
    void PrintData() {
        System.out.println("method of parent class "+age);
    }
     void PrintData1() {
        System.out.println("method of parent class "+age);
    }
}

class Child2 extends Parent2 {

   

    @Override
    void PrintData() {
        System.out.println("method of child class");
    }
    void PrintData2() {
        System.out.println("method of parent class "+age);
    }
    
}
 
public class UpCasting {

    public static void main(String[] args) {
        Parent2 ob1 = (Parent2) new Child2();
        ob1.PrintData();
        ob1.PrintData1();
       
        Parent2 ob2 = (Parent2) new Child2();
        
        
        ob2.PrintData();
        
       
    }

}
