package Basics.Operators;

public class Arithmetic_Operators {

    /*
    Arithmetic +, -, *, /, %
    Bitwise &, ^,|, >>, <<
    Relational <, >, ==, !=, <=, >=
    Logical &&, ||,
    */
    public static void main(String[] args) {
        //Arithmetic Operators
        
        int n=5;
        int m=2;
        int add = m+n;
        int sub = m-n;
        int mul = m*n;
        double div= (double)m/n;
        double mod = (double)m%n;
        
        System.out.println("ADD= "+add);
        System.out.println("SUB= "+sub);
        System.out.println("MUL= "+mul);
        System.out.println("DIV= "+div);
        System.out.println("MOD= "+mod);
        
        //Short hand operators
        
        int a=1;
        a+=1; // a=a+1; we can also use -=, *=, /=, %= 
        System.out.println("A="+a);//gives 2
        
    }
    
}
