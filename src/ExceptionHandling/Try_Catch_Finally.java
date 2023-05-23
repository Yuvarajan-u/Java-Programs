package ExceptionHandling;

/*
Exception handling:
    The main usage of EH is to handle the errors with an exception and let run the
rest of the code. If we are not using EH it will break the execution on the Error Occured..

There are so many types of Exceptions:

 */
public class Try_Catch_Finally {

    static void show() {
        int a = 5;
        int b = 5;
        int res = a + b;
        System.out.println("Result: " + a + "+" + b + "=" + res);
    }

    public static void main(String[] args) {

        try {
            int i = 25 / 0;
            System.out.println("Result: "+i);
            //this will throw the object of expection
        } 
        catch (Exception e) {
            System.out.print("Error: " + e);

        } 
        /*
        finally is used to reduce code redundancy like  if we are getting an exception
        catch block will work or else try will work, so something may be missed.
        
        Even we are getting or not getting expections finally block will execute 
        its code and methods in it.
        
        And important usage is it close the resourses like if we are working with files
        or buffer reader we should close it after its usage or else it will occupy memory
        if we are using close in try block and an expection occurs before that close operation
        will not happen so memory will be wasted so we can use it in finally block.
        */
        finally {
            System.out.println("\nFinally Block: Rest of the code can execute");
            show();

        }

    }

}
