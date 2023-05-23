package Basics.ControlFlow.DecisionMaking;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                                                                                                                        
        char grade;
        
        // we can use char,int and string in switch statement
        grade = sc.nextLine().charAt(0);
        
        //to convert character to uppercase use
        
        char grade1 = Character.toUpperCase(grade);
        
        switch(grade1)
        {
            case 'S':
                System.out.println("Excellent");
                break;
            case 'A':
                System.out.println("Good");
                break;
            case 'B':
                System.out.println("Nice");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'F':
                System.out.println("Fail, Retry");
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }
    }   
}
