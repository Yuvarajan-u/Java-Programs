package Z_Assignments.Assignment1;
import java.util.Scanner;

class Employee{
    
    int incentive_amt=5000;
    int overtime_amt=200;
    int salary;
    int hours;
    int totalamt;
    Scanner sc=new Scanner(System.in);
  int totalSalary(){
      return 0;
  }  
}

class Manager extends Employee{

   @Override
   public int totalSalary(){
       System.out.println("Enter Manager's salary: ");
       salary=sc.nextInt();
       totalamt=incentive_amt+salary;
       return totalamt;
   }
}
class Labour extends Employee{
    
   @Override
   public int totalSalary(){
       System.out.println("Enter Labour's salary: ");
        salary=sc.nextInt();
        System.out.println("Enter Labour's Overtime (in hours): ");
        hours=sc.nextInt();
       totalamt=(overtime_amt*hours)+salary;
       return totalamt;
   } 
}

public class Assignment1_Question8 {

    public static void main(String[] args) {
        Employee obj1=new Manager();
        int managersal=obj1.totalSalary();
        System.out.println("Manager's total salary is: Rs. "+managersal);
        
        Employee obj2=new Labour();
        int laboursal=obj2.totalSalary();
        System.out.println("Labour's total salary is: Rs. "+laboursal);
    }  
}
