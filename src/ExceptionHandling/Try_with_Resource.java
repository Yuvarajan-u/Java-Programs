
package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
This method is introduced after java 1.7 version

we can define resource in side try block like a method try(method){} so we 
dont need catch or finally to close it. it will close the resource when it scope 
ends.. that important of this usage..

*/
public class Try_with_Resource {

    public static void main(String[] args) throws IOException {
       int n,cube;
        System.out.println("Enter a number: ");
        
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            
            n = Integer.parseInt(br.readLine());
        //to square a number

        cube = n * n * n;

        System.out.println("Cube of: " + n + " = " + cube);
        
        }
    }
    
}
