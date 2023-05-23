package Class_and_Objects.Abstract;

abstract class Writer{
   abstract void write();
}
class Pen extends Writer{

    @Override
    void write() {
        System.out.println("Pen Writes");
    }
    
}
class Pencil extends Writer{

    @Override
    void write() {
         System.out.println("Pencil Writes");
    }
    
}

class Kit {                 //Writer class as parameter with object
    public void doSomething(Writer w){
        // this can call one class based on obj reference given in main method
        w.write();
    } 
}
public class AbstractEg3 {

    public static void main(String[] args) {
        Kit k = new Kit();
        Writer p = new Pen();
         k.doSomething(p);
         
        Writer pc = new Pencil();
        k.doSomething(pc);
       
        
        
        
    }
    
}
