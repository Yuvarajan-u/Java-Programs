package Menu_Driven_Programs;

import java.util.Scanner;

class Employee{
    int eid;
    double salary;
    String ename;
    
    static String ceo;
    Scanner sc = new Scanner(System.in);
    public Employee(){
        System.out.print("Enter Ceo name: ");
        ceo=sc.nextLine();
    
}
    
    public void getInput(){
        System.out.print("Enter eid: ");
        eid=Integer.parseInt(sc.nextLine());
        System.out.print("Enter Salary: ");
        salary = Double.parseDouble(sc.nextLine());
        System.out.print("Enter name: ");
        ename=sc.nextLine();
        
    }
    
    public void display(){
        System.out.println(eid+" : "+ename+" : "+salary+" : "+ceo);
    }
    public void getOption(){
        
        lp: while(true){
            int opt=0;
        System.out.println("\nEnter Option: \n1. GetInput\n2.Display\n3.Exit");
        opt=Integer.parseInt(sc.nextLine());
        switch(opt){
            case 1:
                getInput();
                break;
            case 2:
                display();
                break;
            case 3:
                System.out.println("Program Ends\n");
                break lp;
        }
    }
}
}
public class SampleMD {

    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.getOption();
    }
    
}
