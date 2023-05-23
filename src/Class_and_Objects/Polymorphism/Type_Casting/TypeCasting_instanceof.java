package Class_and_Objects.Polymorphism.Type_Casting;

/*
instance of:
It is used to return boolean value which checks the Class reference, references to
the object/class of subject. 
if it is true the block of code will execute.

Downcasting:

Compiler will not know when we created a reference of super class assigned to subclass
like super s = new sub();
and we try to assign new reference to invoke sub class methods
like sub s1 = s; it says parent cannot convert to child. but s is referencing to sub class
to tell the program we need downcasting like sub s1 = (sub)s; which will allow to 
use the sub class unique methods.

when we are creating object s gives reference of super class it will not have
any access to subclass in that case if we try to downcast it will throw ClassCastException.

but, s is referencing subclass, so sub s1 can be created from object s.

s cannot get the unique methods of sub class because it refering to super class.

if we are using downcasting within instance of it will be safe because, if it is not
refering to subclass it will not throw any exceptions. so rest of code can work 
properly.
 */
class Parent {

    void show() {
        System.out.println("Parent");
    }
    void show1() {
        System.out.println("Parent unique");
    }
}

class Child extends Parent {

    @Override
    void show() {
        System.out.println("child");
    }

    void showc() {
        System.out.println("unique child");
    }
}

public class TypeCasting_instanceof {

    public static void main(String[] args) {
        //Parent class obj refers to child class..
        Parent p = new Child();
        p.show();//child class show method not parent.. (method overriden)

        //if will help to find object p is referencing child class or not.
        if (p instanceof Child) {
            Child c = (Child) p;//downcasting
            c.showc();
            c.show1();
        }
        // it will give error:
        Parent p1 = new Parent();
        p1.show();
        try {
            Child c1 = (Child) p1;
            c1.show();
            c1.showc();
        } catch (ClassCastException e) {
            System.out.println("Error: " + e);
        }
    }

}
