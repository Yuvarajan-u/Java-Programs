package Class_and_Objects.Inheritance.Super;
/*
What is Super Method? super();
    Super Method will be given (default) by the compiler at the use of inheritance.
    Every construtor in Subclass will have by default method called super();
    So it will call default constructor of super class.
    
    If we want to call the param constructor of super class we need to write super method
    in sub class with the parameter.
*/
class SuperA{
    //constructor
    public SuperA(){
        System.out.println("A's Def Constructor");
    }
    //Parameterized constructor
    public SuperA(int i){
        System.out.println("A's Param Constructor "+i);
    }
   
    void MethodA(){
        System.out.println("A's Method ");
    }
   
}

class SuperB extends SuperA{
    //constructor
    public SuperB(){
        //super();-> in default it will be called
        /*
        super(5); -> if we want to call Def constructor of B and Param Constructor of A
        We can simply give parameter inside super 
        */
        
        System.out.println("B's Def Constructor");
    }
    //Parameterized constructor
    public SuperB(int i){
        
        super(i);   //-> it will call SuperA's Param Constructor 
        //without calling this
        // it will call super a default constructor and super b param constructor only.
        
        // //-> to call Super Class normal methods
        
        System.out.println("B's Param Constructor "+i);
    }
    public void MethodB(){
        System.out.println("Method of B");
    }

}

public class SuperConstructor {

    public static void main(String[] args) {
       //It will simply call Class A's Default Constructor
        SuperA obj = new SuperA(); 
        System.out.println();
        
       //It will simply call Class A's  Parameterized Constructor
        SuperA obj1 = new SuperA(5);
       System.out.println();
       
        //It will call both Class A's and B's Default Constructor
        SuperB obj2 = new SuperB();
        System.out.println();
        
        //It will call both Class A's and B's Parameterized Constructor
        SuperB obj3 = new SuperB(10);
        System.out.println();
        
        /*
        Here We are Calling Class B's Default Constructor {new SuperB();}
        B's Constructor will have super(); because it is extended(inherited by) A
        So It will Call both Class A and B's Default Constructor
       */
        
        SuperA obj4 = new SuperB();
        System.out.println();
        
       /*
        Here We are Calling Class B's Param Constructor {new SuperB(15);}
        B's Param Constructor will have super(i); because it is extended(inherited by) A
        So It will Call both Class A and B's Parameterized Constructor
        */
        SuperA obj5 = new SuperB(15);
        obj5.MethodA();
    // obj5.MethodB(); 
      //since we are taking SuperA has obj reference we cannot access B class methods.
        
    }
    
}
