package ExceptionHandling;

import java.util.*;

class MarkCalC {

    int id;
    String name,grade;
    int totalMarks;
    int nos;
    double average;
    int array1[] = new int[5];
    int array2[] = null;

    Scanner sc = new Scanner(System.in);

    public void getInput() {
        System.out.println("Enter ID, Name, Total Marks, No of Subjects: ");
        id = Integer.parseInt(sc.nextLine());
        name = sc.nextLine();
        totalMarks = Integer.parseInt(sc.nextLine());
        nos = Integer.parseInt(sc.nextLine());
    }

    public void calculate() {
        try {
            average = totalMarks / nos;
            if(average>35){
                grade="PASS";
            }
            else{
                grade="FAIL";
            }
            //ArrayIndexOutOfBoundsException
            array1[8] = 90;
            
            //NullPointerException
            array2[4]=10;
            
        } 
        /*  we can give seperate msgs to each expection
            but only one catch will work at a time because when an expection occurs
            it jumps off to catch so it will not check other statements in try.
        */
        /*
        catch (ArithmeticException e) {
                System.out.println("Error: Cannot divide by Zero"+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Error: Stay in your limit because"+e);
        }
         */ 
        
        //After java 1.7 it is introduced we can use multi catch like this using pipe key( | )
        
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e);
        }
        
        //Always Exception e catch should be last because it can handle everything
        catch(Exception e){
            System.out.println("Error: " + e);
        }
        finally{
            
            System.out.println("\nResult: "+
                    "\nName: "+name+
                    "\nID: "+id+
                    "\nTotal Marks: "+totalMarks+
                    "\nNo of subjects: "+nos+
                    "\nAverage: "+average+
                    "\nGrade: "+grade);
        }

    }

}

public class Multiple_Catch {

    public static void main(String[] args) {
        MarkCalC ob = new MarkCalC();
        ob.getInput();
        ob.calculate();
    }

}
