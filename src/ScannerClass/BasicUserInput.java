package ScannerClass;

import java.util.Scanner;

public class BasicUserInput {

    public static void main(String[] args) {
        
        //(System.in) refers to the compiler that we are going to get input from the uer by keyboard
        Scanner sc= new Scanner(System.in);
        
        int age;
        String name;
        char grade;
        int opt=0;
        System.out.println("Enter option 1: all nextline, 2: nextInt,nextLine");
        opt=sc.nextInt();
        switch(opt){
            case 1:
                //used nextline bcz it will consume the leftover to new line
                sc.nextLine();
                System.out.print("Enter age: ");
        age=Integer.parseInt(sc.nextLine());
        System.out.print("\nEnter Name: ");
        name=sc.nextLine();
        System.out.print("\nEnter Grade: ");
        grade=sc.nextLine().charAt(0);
        
        if(age<=18)
        {
            System.out.println(name+"Your age is less");
        }
        else if(name.length()>15)
        {
            System.out.println(name+"Your name is invalid");  
        }
        else
        {
            System.out.println(name+" You can vote "+grade);
        }
            break;
            case 2:
                System.out.print("Enter age: ");
                age=sc.nextInt();
                //It is required to start over from 0th position in input area
                
                sc.nextLine();
                System.out.print("\nEnter Name: ");
                name=sc.nextLine();
                System.out.print("\nEnter Grade: ");
                grade=sc.nextLine().charAt(0);
        
                if(age<=18)
                {
                    System.out.println(name+"Your age is less");
                }
                else if(name.length()>15)
                {
                    System.out.println(name+"Your name is invalid");  
                }
                else
                {
                    System.out.println(name+" You can vote "+grade);
                }
            break;
        }
        System.out.println("Code ends");
    }
    
}
