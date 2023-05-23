package Class_and_Objects.Interface;

/*
Functional Interfaces we can use Lambda Expression:-> it is from Scala language
Types of Interface:
1. normal-> more than one method
2. Single abstract method-> have only one method-> Functional interface in JAVA 8
3. Marker Interface-> doesnt have any methods-> serializable

 */
//This Annotation is used to prevent from creating more than one method

@FunctionalInterface
interface FunInter {

    void show();
    //void run(); we cannot have another method in functional interface
}

public class Function_Interface_LambdaExp {

    public static void main(String[] args) {

        /*
        FunInter obj = new FunInter() {
            public void show() {
                System.out.println("Its a Anonymous Class");
            }
        };
*/
        //Lambda Expression
        FunInter obj = () -> System.out.println("Its a Anonymous Class");
        
        obj.show();
    }

}
