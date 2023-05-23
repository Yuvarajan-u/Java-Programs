package ScannerClass;

import java.io.IOException;

//This reads chracters and stores ascii values -> int variable name = System.in.read();

public class System_in_read
{
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        int read = System.in.read();
        
        System.out.println(read);
        //It is also an resource from IO package so it should be closed.
        System.in.close();
    }
    
}
