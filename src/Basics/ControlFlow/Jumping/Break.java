package Basics.ControlFlow.Jumping;

public class Break {

    public static void main(String[] args) {
        
        for(int i=1;i<=10;i++)
        {   
            if(i>=5)
            { // it will break the loop when it reaches 5
               break;
            }
            else
            {
                System.out.println("Value is "+i); //prints 1 2 3 4 5
            }
        }
    }
    
}
