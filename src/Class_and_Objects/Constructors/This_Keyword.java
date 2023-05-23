
package Class_and_Objects.Constructors;

class ThisKey{
    
    int num1,num2;
    /*
    What is This Keyword?
        It is used to specify the variable with same name is not local
    it is instance variable.
    
    Why is This Keyword?
        When local and instance variable have same name it is not possible
    to get the value from object. This keyword will solve the ambiguity problem.
    */
    ThisKey(int num1, int num2){
        
      //this.Instance variable = local Variable;
        
        this.num1=num1; //current object
        this.num2=num2;
        int res = num1+num2;
        System.out.println("Result: "+res);
    }

}
public class This_Keyword {

    public static void main(String[] args) {
      
        ThisKey obj = new ThisKey(5,10);
        
    }
    
}
