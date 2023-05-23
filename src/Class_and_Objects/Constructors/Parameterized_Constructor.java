package Class_and_Objects.Constructors;

import java.util.*;
//In a Class it can have multiple constructors

class ParamC{
    int i;
    float b;
    float res;
    //Here int a and float b are parameters 
    public ParamC(int a,float b)
    {
        System.out.println("This is Parameterized Constructor");
       i=a;
       this.b=b;
       res=a+b;
       System.out.println(a+"+"+b+"="+res);
    }
    //This is Construtor OverLoading by having different Signature
    //By changing Parameters, Datatypes, or no parameters
    
    public ParamC()
    {
        i=5;
        b=4.5f;
        System.out.println("This is Default Constructor");
        res=i+b;
       System.out.println(i+"+"+b+"="+res);
    }

}
public class Parameterized_Constructor {

    public static void main(String[] args) {
        //Calling Default Constructor
        ParamC obj1= new ParamC();
        System.out.println("We can get values "
                + "assigned in Constructor: i="+obj1.i);
        
        //Calling Parameterized Constructor
        
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        float m=Float.parseFloat(sc.nextLine());
        ParamC obj2= new ParamC(n,m);
    }
    
}
