package Class_and_Objects.Inheritance;
import java.util.Scanner;


//IS-A type class

class SingleA{  // this kind of classes called as Super, Parent, Base
    int empid;
    int age;
    String ename;
    double salary;
    
    Scanner sc = new Scanner(System.in);
    
    void getInput(){
        System.out.print("Enter empid:");
        empid=Integer.parseInt(sc.nextLine());
        System.out.print("Enter name:");
        ename = sc.nextLine();
        System.out.print("Enter age:");
        age=Integer.parseInt(sc.nextLine());
        System.out.print("Enter salary:");
        salary=Double.parseDouble(sc.nextLine());   
    }
}

class SingleB extends SingleA{ // this kind of classes called as Sub, Child, Derived
    String designation;
    
    void setDesignation(){
        if(salary>=50000){
            designation="Software Developer";
        }
        else if(salary<50000 && salary>=25000){
            designation="Software Tester";
        }
        else{
            designation="Support Role";
        }
    }
    
    void display(){
        getInput();
        setDesignation();
        System.out.println("\nName: "+ename+"\nAge: "+age+"\nEmp Id: "+empid+"\nSalary: "+salary
        +"\nDesignation: "+designation);
    }
}

//HAS-A Type class
public class Single {

    public static void main(String[] args) {
       SingleB obj = new SingleB();
       obj.display();
    }   
}
