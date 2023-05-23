package Class_and_Objects.Polymorphism.OverRiding;

// to achieve dynamic method dispatch we have to follow run time polymorphism (method override)

class DyA{
    void show(){System.out.println("This is show of A");}
}
class DyB extends DyA{
    @Override
    void show(){System.out.println("This is show of B");}
}
class DyC extends DyA{
    @Override
    void show(){System.out.println("This is show of C");}
}
class DyD extends DyA{
    @Override
    void show(){System.out.println("This is show of D");}
}

public class Dynamic_Method_Disptach {

    public static void main(String[] args) {
        /*
        DyA a = new DyA(); // this linking happens at runtime 
        a.show(); // so which show should be called also decided at runtime
        a = new DyB();
        a.show();
        a = new DyC();
        a.show();
        a = new DyD();
        a.show();
        */
        
        //Another method:
        DyA a = new DyA(); 
        DyB b = new DyB();
        DyC c = new DyC();
        DyD d = new DyD();
        
        //r is reference
        DyA r;
        r = a;
        r.show();
        r = b;
        r.show();
        r = c;
        r.show();
        r= d;
        r.show();
        

    }
    
}
