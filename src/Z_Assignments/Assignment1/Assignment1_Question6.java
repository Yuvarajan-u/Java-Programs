package Z_Assignments.Assignment1;

class SingletonClass {

    private SingletonClass() {

    }
    static SingletonClass obj = new SingletonClass();

    public static SingletonClass getInstance() {
        return obj;
    }
}
/* SingletonClass has private constructor and 
it is a singleton class it cannot be inherited
and using singleton, can create only one instance.

class CheckInheritance extends SingletonClass{
    
}
*/
public class Assignment1_Question6 {

    public static void main(String[] args) {
        SingletonClass obj1=SingletonClass.getInstance();
        System.out.println(obj1.hashCode());
        SingletonClass obj2=SingletonClass.getInstance();
        System.out.println(obj2.hashCode());
    }
}
