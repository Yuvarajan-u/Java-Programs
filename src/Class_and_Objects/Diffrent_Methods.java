package Class_and_Objects;

class Calculate{
    
    int a,b;float result;
    // no return no arguments
    void add(){
        result =a+b;
        System.out.println("Result of "+a+"+"+b+"="+(int)result);
    }
    // no return with arguments
    void sub(int a,int b){
        result=a-b;
        System.out.println("Result of "+a+"-"+b+"="+(int)result);
    }
    //return with no arguments
    float mul(){
        result=a*b;
        return result;
    }
    //return with arguments
    float div(int a,int b){
        result=a/b;
        return result;
    }
}
public class Diffrent_Methods {

    public static void main(String[] args) {
        
        Calculate obj = new Calculate();
        //add
        obj.a=5;
        obj.b=10;
        obj.add();
        
        //sub
        obj.sub(15, 10);
        
        //mul
        obj.a=5;
        obj.b=5;
        System.out.println("Result of "+obj.a+"*"+obj.b+"="+obj.mul());
        
        //div
        System.out.println("Result of 10"+"/"+"5="+obj.div(10,5));
             
    }
    
}
