package Basics.ControlFlow.DecisionMaking;

public class TernaryOperator 
{
    public static void main(String[] args) 
    {
        
        //? and : is used in Ternary Operator
        //?:-> condition?expr1:expr2
        
        int i=83;
        int j=10;
        int k=19;
        int res;
        
        //Largest among three numbers
        res=(i>j && i>k)?i:(j>k && j>i)?j:k;
        System.out.println(res+" is largest of "+i+","+j+","+k);
    }
}
