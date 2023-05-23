package Basics.ControlFlow.DecisionMaking;

import java.util.Scanner;
public class If_elseif_else {

    public static void main(String[] args) {
       
        Scanner sc= new Scanner(System.in);
        
        int age;
        String name;
        char grade;
        System.out.print("Enter age: ");
        age=Integer.parseInt(sc.nextLine());
       
        System.out.print("\nEnter Name: ");
        name=sc.nextLine();
        
        
        if(age<18)
        {
            System.out.println(name+", Your age is less, "+age);
        }
        else if(name.length()>15)
        {
            System.out.println(name+", Your name is invalid, "+age);  
        }
        else
        {
            System.out.println(name+", You can vote, "+age);
        }
        
    }
    
}
