package Class_and_Objects.Inheritance.Super;

import java.util.*;
//To calculate Cube
class SuperMA{
    int cube;
    Scanner sc = new Scanner(System.in);
    int a;
    
    public SuperMA(){
        System.out.println("I'm Constructor A\n");
    }
    void Cube(){
        
        System.out.print("Enter A: ");
        
        a=Integer.parseInt(sc.nextLine());
        cube=a*a*a;
    }
}
//To calculate Square
class SuperMB extends SuperMA{
     int square;
     
    public SuperMB(){
        //Calling cube calulation
        
        System.out.println("I'm Constructor B\n");
        super.Cube();
        
    }
    void Square(){
        //We can Call inside a method using super like 
        super.Cube();
        //or we can call only method like this too..
        //Cube();
        square=a*a;
    }
    
}
//calling Calculate Square and To Print all
class SuperMC extends SuperMB{
    
    public SuperMC(){
        System.out.println("I'm Constructor C\n");
        
        //super.Cube();
        //Calling Square Calculation
        
        super.Square();
        
    }
    void Print(){
        //By Multilevel inheritance C can have A's and B's Properties to access those we using super.
        System.out.println("Cube: "+cube);
        System.out.println("Square: "+square);
    }
}
public class SuperMethod {

    public static void main(String[] args) {
        SuperMC obj = new SuperMC();
        obj.Print();
    
    }
        /*
        Here im creating obj and calling C's constructor
        in C's constructor it contains Square method and 
        due to inheritance it calls B's constructor which 
        has Cube Method of A's since It is multilevel we can
        class cube from C but to understand i used to code like
        this
        
        so by calling C's constructor
        i) calls Sqaure
        ii) Calls B's Constructor
        iii)In B's it calls Cube and It calls A's constructor
        iv) Print statement in A also gets Printed in Sequence
        
        Constructor of A and B will be called first
        and class A method cube called and class B method 
        square called and finally class C print Called.
        
        output:
        I'm Constructor A

        I'm Constructor B

        Enter A: 5
        I'm Constructor C

        Cube: 125
        Square: 25
        */    
}
