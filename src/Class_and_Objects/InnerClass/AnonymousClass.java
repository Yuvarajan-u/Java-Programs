package Class_and_Objects.InnerClass;
/*
Anonymous class which doesnt have a name and by creating object, before the semi colon(;) 
we can provide the implemention inside curly braces.
*/

class Anon_A {

    public void show() {
        System.out.println("Anonymous A");
    }
}
// this class only purpose is to override the method
/*but this class is not required
class Anon_B extends Anon_A{
   public void show(){
        System.out.println("Anonymous B");
    }
}*/

public class AnonymousClass {

    public static void main(String[] args) {
        
        Anon_A obj = new Anon_A();
        obj.show();
         
        
        Anon_A obj1 = new Anon_A() {
            @Override
            public void show() {
                System.out.println("Anonymous B");
            }
        };
        obj1.show();
        
        /*
        new Anon_A(){};
        is a class now but it doesnot have a name thats why it is called anonymous
        and it is only for one time use
        */
        
    }

}
