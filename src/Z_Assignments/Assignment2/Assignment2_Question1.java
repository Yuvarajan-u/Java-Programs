package Z_Assignments.Assignment2;

interface Printable{public void print();   }
class Employee implements Printable{
    @Override
    public void print() {
        System.out.println("employee printed!");
    }
}
class Circle extends Employee implements Printable{
    @Override
    public void print() {
        System.out.println("circle printed!");
    }
    
    public void printAll(){
        super.print();
        print();
    }    
}
public class Assignment2_Question1 {

    public static void main(String[] args) {
          Circle obj =new Circle();
          obj.printAll();
    }    
}
