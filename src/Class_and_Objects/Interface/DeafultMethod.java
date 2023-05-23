package Class_and_Objects.Interface;

//Abstract -> define and declare
//Interface -> only declare < java 1.7 version 
//but after java 8 can define methods in interface

@FunctionalInterface 
// 2 methods can be there reason is functional interface can have only one abstract method
interface DefMeth{
    
    void show();
    //public void run(){} //will not work
    default void run(){
        System.out.println("Interface Method Definition");
    }
}

class Runner implements DefMeth{
    public void show(){
        System.out.println("Runner Class show");
    }
    //can we override-> yes
    //@Override
    public void run1(){
        System.out.println("Runner Class run");
    }
    
}

public class DeafultMethod {

    public static void main(String[] args) {
       DefMeth obj = new Runner();
       obj.show();
       obj.run(); // we can get this because of default keyword
    }
    
}
