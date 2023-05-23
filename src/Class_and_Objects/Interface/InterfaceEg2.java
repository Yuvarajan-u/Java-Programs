package Class_and_Objects.Interface;

interface Abc{
    void show();
    //abstract methods cannot have body 
    //void display(){System.out.println("Int class");}
}
class Int implements Abc{
    
    public void show() {
        System.out.println("Int class");
    }

    
}

public class InterfaceEg2 {

    public static void main(String[] args) {
       //Abc obj = new Abc; //-> we cannot create obj but we can create reference
       Abc obj1 = new Int();
       obj1.show();
    }
    
}
