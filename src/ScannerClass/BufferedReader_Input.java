package ScannerClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
It is also used to get inputs from the user but it requires IOExceptions and it needs to be closed at 
the end as well or else it will occupy more memory.
*/

public class BufferedReader_Input {

    public static void main(String[] args) throws IOException {
        int n, square;
        System.out.println("Enter a number: ");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        //to square a number

        square = n * n;

        System.out.println("Square of: " + n + " = " + square);
        
        br.close();
    }
    
}
