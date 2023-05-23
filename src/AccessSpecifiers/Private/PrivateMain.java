package AccessSpecifiers.Private;

class A{
   private int age = 20; 
}
public class PrivateMain {

    private static int marks=85;

    public static void main(String[] args) {
        StudentPrivate ob = new StudentPrivate();
        
        //ob.name="rajan"; -> name is private here it will not be accessible
        
        // we can access private variables by using properties like getter setter methods
        String name1= ob.get();
        System.out.println(name1);
        
        A s = new A();
        
        // s.age=21; this is also similiar to above
        
        PrivateMain p = new PrivateMain();
        marks=90;
        System.out.println(marks);
        //Private variables can be accessible only inside the class it is defined.
        
    }
    
}
