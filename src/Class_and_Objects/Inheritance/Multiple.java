package Class_and_Objects.Inheritance;
/*
Java does not support multiple inheritance directly
It does using interfaces and with implements keyword we can inherit interfaces

*/
import java.util.*;

interface Official{
     void getOfficial();
     
}
interface Personal{
     void getPersonal();
}

class Person implements Official,Personal{
    Scanner sc = new Scanner(System.in);
    int empid,age;
    String name,address,award;
    public double salary;
    
     public void getOfficial() {
        empid=Integer.parseInt(sc.nextLine());
        salary=Double.parseDouble(sc.nextLine());
    }

 
    public void getPersonal() {
        name=sc.nextLine();
        age=Integer.parseInt(sc.nextLine());
        address=sc.nextLine();
    }
    public void Awards(){
        
        if(salary<=50000 && salary>=25000){
            award="Good";
        }
        else{
            award="Excellent";
        }
    }
    public void Display(){
       getPersonal();
        getOfficial();
        Awards();
        System.out.println("Personal Details: \n"+
                "Name: "+name
                +"\nAge: "+age
                +"\nAddress: "+address
                +"\nOffical Details: "
                +"\nEmp id: "+empid
                +"\nSalary: "+salary
                +"\nAwards: "+award);
    }
    
}


public class Multiple {

    public static void main(String[] args) {
        Person obj = new Person();
        obj.Display();
    
    }
    
}
