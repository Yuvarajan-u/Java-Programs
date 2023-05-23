package Class_and_Objects;

class Calculator{
    int num1,num2,result;
    
//Method Creation
    void Compute(){
        result=num1+num2;
        System.out.println("Result of "+num1+"+"+num2+"="+result);
    }
}

//main class
public class Class_object_1 {
    
//main method
    public static void main(String[] args) {
        //Object Creation
       Calculator obj = new Calculator();
       //ref  = assigned to object of Calculator .
       obj.num1=5;
      // <reference variable name >.<instance  variable_name / method_name>
       obj.num2=6;
       obj.Compute();
    }
    
}
