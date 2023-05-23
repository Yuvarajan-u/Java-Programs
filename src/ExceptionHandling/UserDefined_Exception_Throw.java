package ExceptionHandling;

import java.util.*;

class ThrowEGCalc {

    String grade;
    int totalMarks;
    int nos;
    double average;
    int array1[] = new int[5];
    int array2[] = null;

    Scanner sc = new Scanner(System.in);

    public void getInput() {
        System.out.println("Enter Total Marks, No of Subjects: ");

        totalMarks = Integer.parseInt(sc.nextLine());
        nos = Integer.parseInt(sc.nextLine());
    }

    public void calculate() {
        try {
            if (nos == 0) {
                //User Defined Exception
                throw new NotZeroException("No of subjects should not be zero");
            } else {
                average = totalMarks / nos;
            }

            if (average > 35) {
                grade = "PASS";
            } else if (average == 0) {
                throw new NotZeroException("Average is Zero");
            } else {
                grade = "FAIL";
            }

            //ArrayIndexOutOfBoundsException
            array1[34] = 90;

            //NullPointerException
            array2[4] = 10;
        } catch (Exception e) {
            // instead of e we can use e.getMessage() to get message alone

            System.out.println("Error: " + e);
        } finally {

            System.out.println("\nResult: "
                    + "\nTotal Marks: " + totalMarks
                    + "\nNo of subjects: " + nos
                    + "\nAverage: " + average
                    + "\nGrade: " + grade);
        }
    }
}

class Voter {

    int age;
    String name;
    Scanner sc = new Scanner(System.in);

    void getInput() {
        System.out.println("Enter name and Age: ");

        name = sc.nextLine();

        age = Integer.parseInt(sc.nextLine());

    }

    void checkValid() throws NameLengthException, LowAgeException {
        try {
            if (name.length() > 15) {
                throw new NameLengthException("Name length should be less than 15");
            } else if (age < 18) {
                throw new LowAgeException("Age should be greater than 18");
            } else {
                System.out.println("Code Run successful: \nYou can vote");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            System.out.println("\nRest of the code");
        }
    }

}

public class UserDefined_Exception_Throw {

    /*
     public static void main(String[] args) {
       ThrowEGCalc ob = new ThrowEGCalc();
       ob.getInput();
       ob.calculate();
    }
     */
    public static void main(String[] args) throws NameLengthException, LowAgeException {

        Voter obj = new Voter();
        obj.getInput();
        obj.checkValid();

        //in this class NameException and Age Exception are 
        //not used but it will not affect obj creation
        ThrowEGCalc ob = new ThrowEGCalc();
        ob.getInput();
        ob.calculate();

    }

}
