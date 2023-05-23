package Class_and_Objects.Inheritance;

import java.util.Scanner;
/*
    a
   / \
  b   c 
    B can use A's properties but not C's
    C can use A's properties but not B's
*/
class HA{
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
class HB extends HA{
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
    void Display(){
        System.out.println("\nName: "+ename+"\nAge: "+age+"\nEmp Id: "+empid+"\nSalary: "+salary
        +"\nDesignation: "+designation);
    }
}
class HC extends HA{
    //Set Address class
    String address;
    void setAddress(){
        //class HA has scanner class after extending HC also can use that Scanner.
        System.out.print("Enter Address:");
        address=sc.nextLine();
}
    void AddressDisplay(){
        
        // We can access this method becase HC only can have HA's methods
        //setDesignation();
        System.out.println("Address: "+address);
        
        
        
    }
}

public class Hirarchical {

    public static void main(String[] args) {
        HB obj1= new HB();
        
        HC obj2=new HC();
        
        obj1.getInput();
        obj1.setDesignation();
        obj2.setAddress();
        obj1.Display();
        obj2.AddressDisplay();
        
    }
    
}
