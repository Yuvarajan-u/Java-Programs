package Var_Args;


class VarArgs{
    
    /*
        int ... n (...)three dots represents the parameters 
        will reach the method as an array
        (4,5,4,6,7,6,7) -> {4,5,4,6,7,6,7}
        n is not a normal variable it is more like array
    this type of parameters (int ... n) where it is parsed as array is called
    
    Variable length Arguments
    */
    public int add(int ... n){
        
        int sum=0;
        
        for(int i:n){
            sum = sum+i;
        }
        return sum;
    }
}
public class Var_ArgsDemo {

    public static void main(String[] args) {
        VarArgs obj = new VarArgs();
        int result=obj.add(4,5,4,6,7,6,7);
        System.out.println(result);
    }
    
}
