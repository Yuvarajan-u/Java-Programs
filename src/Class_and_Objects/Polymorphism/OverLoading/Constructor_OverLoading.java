package Class_and_Objects.Polymorphism.OverLoading;

/*
Construtor is member method of class
We can overload methods 
Similarly we can overload Constructors 
with Different Parameters or without Parameters
*/
class CO{
    public int i;
    public int j;
    public int result;
    //Default Constructor
    public CO()
    {   
        i=15;
        j=35;
        result=i+j;
        System.out.println("C1: Result: "+result);
    }
    public CO(int a,int b)
    {   
        i=a;
        j=b;
        result=a+b;
        System.out.println("C2: Result: "+result);
    }
    //Different DataType of Variables also considered as another Constructor.
    public CO(float i,float j)
    {
        float result = i+j;
        System.out.println("C3: Result: "+result);
    }
    
}
public class Constructor_OverLoading {

    public static void main(String[] args) {
        CO obj1 = new CO();
        CO obj2 = new CO(15,59);
        CO obj3 = new CO(34.5f,45.9f);
    }
    
}
