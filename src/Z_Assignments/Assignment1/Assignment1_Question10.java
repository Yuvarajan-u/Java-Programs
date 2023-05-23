package Z_Assignments.Assignment1;
/*
// 1) If any class has any of its method abstract then you must declare entire class abstract-True
abstract class AbstractClass1{

    abstract void draw();
}

abstract class AbstractClass2{
    abstract void write();
}
// 3) When we extend an abstract class, we must either override all the abstract methods in sub class 
// or declare subclass as abstract. - True
class NormalClass extends AbstractClass2{

    @Override
    void write() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
// 4) Abstract class cannot be private. -True
/*private*/ abstract class AbstractClass3{
    
}
// 5) Abstract class cannot be final.-True
/*final*/ abstract class AbstractClass4{
    
}
// 6) You can declare a class abstract without having any abstract method. -True
abstract class AbstractClass5{
    void run(){
        System.out.println("Abstract classes can have about abstract methods and non-abstract methods");
    }
}
/*
public class Assignment1_Question10 {

    public static void main(String[] args) {
    // 2) Abstract class cannot be instantiated.  
     AbstractClass obj1=new AbstractClass;
     
    }  
}
*/