package Class_and_Objects.Polymorphism;

/*
Instance Initializer:
    *It is used to initialize the instance data member. 
    *It run each time when object of the class is created.

in the below example's output it seems like instance init block runs before constructor
but it is not true. Instance intializer block is invoked at the time of object creation. 
The java compiler copies the instance initializer block in the constructor after the first statement super().
So firstly, constructor is invoked.

like will change like 

constructor()
{instance block}
method()
 |
\|/
 *

super();
{instance block}
constructor()
method()

* so it seems like constructor comes after instance initializer block..

rules:

The instance initializer block is created when instance of the class is created.
The instance initializer block is invoked after the parent class constructor is invoked (i.e. after super() constructor call).
The instance initializer block comes in the order in which they appear.
 */

class InsA {

    public InsA() {
        System.out.println("\nsuper class Cons");
    }
}

class InsB extends InsA {

    //data type class also can be used..
    static int speed;

    public InsB() {
        //it will have super() by default;
        System.out.println("\nSub class Cons");
    }

    public InsB(int a) {
        //It is param cons so we need to give super for default cons
        super();
        System.out.println("\nSub class param Cons");
    }

    //Instance Initializer block;
    {
        System.out.println("\nInstance Initializer");
    }

    public void run() {
        System.out.println("\nsub class method speed: " + speed);
    }

    //Ins Init block used with method.. static block is also an initializer
    static {
        speed = 100;
        System.out.println("Value assigned!");
    }
}

public class Instance_Initializer {

    public static void main(String[] args) {
        InsB ob1 = new InsB();
        ob1.run();
        System.out.println("\n\nDefault constructor ends..\n");
        InsB ob2 = new InsB(10);
        ob2.run();
    }

}
