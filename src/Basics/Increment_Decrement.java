
package Basics;

public class Increment_Decrement {

    public static void main(String[] args) {
        // ++n -> Pre increment
        // n++ -> Post increment
        System.out.println("Increment");
        int n=1;
        int m=1;
        int o;
        // n =1 and 1 increments to 2 and assigned to n then printed
        
        n=++n;//2
        System.out.println(n);
        
        // m =1 and assigned to o, o printed and m incremented to 2
        
        o=m++;//1
        System.out.println(o); 
        
        // here m =2 now again it is assigned to m and incremented and finally m printed..
        
        m++;//3
        System.out.println(m);
        
        System.out.println("\nDecrement");
        
        int a=10;
        int b=10;
        int c;
        //a =10 it is decremented to 9 and assigned to a and printed
        
        a=--a;//9
        System.out.println(a);
        
        //b = 10, it is assigned to c printed and  b decremented to 9
        
        c=b--;//10
        System.out.println(c);
        
        // now b = 9, it is assigned to b and decremented to 9 and printed
        
        b--;//8
        System.out.println(b);     
    }    
}
