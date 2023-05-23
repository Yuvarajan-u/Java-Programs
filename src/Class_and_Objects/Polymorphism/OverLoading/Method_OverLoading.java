package Class_and_Objects.Polymorphism.OverLoading;
/*
What is method overloading?

Method overloading is known as multiple methods with same name 
and with different parameters or no parameters. 
It is also called as Compile Time Polymorphism.
*/
class MO{
    public float result;
    float i;
    float j;
    public void add(int i,int j)
    {
        result=i+j;                     
        System.out.println(i+"+"+j+"="+result);
    }
    
    //Same method with different Parameters
    public void add(int i,int j,int k)
    {
        result=i+j+k;                        //casting it to integer
        System.out.println(i+"+"+j+"+"+k+"="+(int)result);
    }
    
    //Or without Parameters
    public void add(){
        
        result=i+j;
        System.out.println(i+"+"+j+"="+result);
    }
    
}
public class Method_OverLoading {

    public static void main(String[] args) {
        MO obj = new MO();
        
        obj.add(10,20);
        
        obj.add(10,20,30);
        
        obj.i=5.4f;
        obj.j=4.5f;
        obj.add();
        
    }
    
}
