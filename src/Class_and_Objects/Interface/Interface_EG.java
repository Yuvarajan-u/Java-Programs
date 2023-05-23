package Class_and_Objects.Interface;
/*
Interface used to achieve generalization

If in future the class pen needs to be extended with some other classes in that
case multiple inheritance is not supported directly so abstract class cannot be
helpful. so we can use interface and implements keyword to make use of multiple
inheritance

This program also an example for multiple inheritance
*/
interface Writers{
   public abstract void write();
}
interface Readers{
    // no need to mention public abstract it will be done by default
    void read();
}
class Pens implements Writers,Readers{

    
    @Override
    public void write() {
        System.out.println("Pen Writes");
    }

    @Override
    public void read() {
        System.out.println("User Reads");
    }
    
}
class Pencils implements Writers{

    
   @Override
   public void write() {
         System.out.println("Pencil Writes");
    }
    
}

class Kits {                 //Writer class as parameter with object
    public void doSomething(Writers w){
        // this can call one class based on obj reference given in main method
        w.write();
    }
}
public class Interface_EG {

    public static void main(String[] args) {
        Kits k = new Kits();
        Writers p = new Pens();
         k.doSomething(p);
         
        Writers pc = new Pencils();
        k.doSomething(pc);
       
        Readers obj = new Pens();
        obj.read();
    }
    
}
