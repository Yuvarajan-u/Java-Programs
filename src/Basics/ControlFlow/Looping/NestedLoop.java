package Basics.ControlFlow.Looping;

public class NestedLoop {
    //Loop inside loop
    /*
    To print:
    * * * *
    * * * *
    * * * *
    * * * *
    */
    public static void main(String[] args) {
        for ( int i = 0; i < 4; i++) 
        {
            for (int j = 1; j <= 4; j++) 
            {
                System.out.print("* ");
                
            }
            System.out.println();
        }
    }
    
}
