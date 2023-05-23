package Class_and_Objects.Interface;

interface Anon_interface{
    void show();
}

class Implementor implements Anon_interface{
    @Override
    public void show(){
        System.out.println("It is an Implementor class with interface");
    }
}
public class Anonymous_withInterface {

    public static void main(String[] args) {
        /*
        Normally we cannot create obj for Interface like
        Anon_interface obj = new Anon_interface();
        It will throw an error
        
        but we can create object with anonymous class like
        
        with this we can instantiate the interface
       it will not waste lots of memory compared to normal class because it is onetime  use
        and in particular class.
        */
        Anon_interface obj = new Anon_interface(){
            @Override
            public void show(){
                System.out.println("It is an Anonymous class with interface");
            }
        };
        obj.show();
        
    }
    
}
