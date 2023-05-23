package Class_and_Objects.Inheritance;
import java.util.Scanner;
/*
    a
    |
    b
    |
    c 'c can use both a and b's methods and variables'
*/
class MulA{
    //Employee class
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
class MulB extends MulA{
    //SetRole class
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
}
class MulC extends MulB{
    //Set Address class
    String address;
    void getAddress(){
        
        System.out.print("Enter Address:");
        address=sc.nextLine();
}
    void FinalDisplay(){
    // Class MulC extends B and B extends A so C can use/access A class methods and variables
        
    // i can create object for class MulC and call this methods too instead i code like this below
        getInput();
        setDesignation();
        getAddress();
        System.out.println("\nName: "+ename+"\nAge: "+age+"\nEmp Id: "+empid+"\nSalary: "+salary
        +"\nDesignation: "+designation+"\nAddress: "+address);   
    }
}

public class MultiLevel {

    public static void main(String[] args) {
            MulC obj2=new MulC();
            obj2.FinalDisplay();
            MultiLevel.run();
    }
 public static void run(){
    System.out.println("im method of Multilevel class");   
}    
}
