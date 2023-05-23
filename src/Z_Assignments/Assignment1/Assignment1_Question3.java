package Z_Assignments.Assignment1;
import java.util.Scanner;

class Account{
    int totalbalance=0;
    Scanner sc=new Scanner(System.in);
    void deposit(){
        System.out.println("\nEnter the amount to deposit");
    int depositamount=sc.nextInt();
    sc.nextLine();
    totalbalance+=depositamount;
    
}
    void withdraw(){
        System.out.println("\nEnter the amount to withdraw");
       int withdrawamount=sc.nextInt();
       sc.nextLine();
       if(withdrawamount<totalbalance){
       totalbalance-=withdrawamount;
       }
       else{
           System.out.println("\nInsufficient Balance! Available Balance is: "+totalbalance);
           System.exit(0);
       }
    }
    void print(){
        System.out.println("\nAvailable balance: "+totalbalance);
       
    }
}
public class Assignment1_Question3 {

    public static void main(String[] args) {
        Account obj =new Account();
        obj.deposit();
        obj.print();
        obj.withdraw();
        obj.print();
    }
}
