package Class_and_Objects.Constructors;


class StaticC{
    int id;
    String name;
    int age;
    /*
    Java CONSTRUCTOR Cannot have Static, final or abstract
    One of the important property of java constructor is that it can not be static. 
    We know static keyword belongs to a class rather than the object of a class. 
    A constructor is called when an object of a class is created, 
    so there is no use of the static constructor.
    */
    
    /*
   public static StaticC(){
       
   }
*/
}
public class Static_Constructor {

    public static void main(String[] args) {
        System.out.println("Static Constructor is not possible in JAVA");
    }
    
}
