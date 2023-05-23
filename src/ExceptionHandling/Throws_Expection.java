package ExceptionHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//IOException is a checked Exception


public class Throws_Expection {
    

    /*using throws Exception without try catch finally
    
    public static void main(String[] args) throws Exception {
        int n, square;
        System.out.println("Enter a number: ");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        //to square a number

        square = n * n;

        System.out.println("Square of: " + n + " = " + square);

    }
*/
    
    //with try catch finally
    
    public static void main(String[] args) throws IOException {
        int n,square;
        System.out.println("Enter a number: ");
        BufferedReader br =null;
        /*
        br is a resource: Anything under from class IO is resource which means 
        after its usage we have to close it orelse it will occupy memory
        So after its work use br.close();
        */
        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            n = Integer.parseInt(br.readLine());
        //to square a number

        square = n * n;

        System.out.println("Square of: " + n + " = " + square);
        // br.close(); ->if we are using it in here once we got an expection cr will not close so
        }
        catch(Exception e){
            System.out.println("Error: "+e);
        }
        finally{
            /*Always close resources in finally block 
            to handle that it requires to throws Exception particularly 
            IOException which should be imported too
            */
            br.close();
            System.out.println("Rest of code executes..");
            
        }
    }

}
