package Basics.ControlFlow.Jumping;

public class Continue {

    public static void main(String[] args) {
        int i=1;
        
        for(i=1;i<=10;i++)
        {
            if(i%2!=0) // if i reaches 7 it will skip 7 and loop continues..
                continue;
            System.out.println("Value is "+i);
        }
        
    }
    
}
