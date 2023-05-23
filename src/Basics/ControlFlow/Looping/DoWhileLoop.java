package Basics.ControlFlow.Looping;

public class DoWhileLoop {

    public static void main(String[] args) {
        int i=50;
        //It will execute atleast once even condition is false
        //It is exit controlled loop
        do
        {
            System.out.println("Hello "+i);
            i--;
        }while(i>=50);//It is exit controlled loop
    }
    
}
