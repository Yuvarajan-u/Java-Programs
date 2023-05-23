package Z_Assignments.Assignment1;

class ComplexNumbers{
    
    int real;int image;

    public ComplexNumbers(int real, int image) {
        this.real = real;
        this.image = image;
    }
    
    public static void add(ComplexNumbers c1, ComplexNumbers c2){
        ComplexNumbers res = new ComplexNumbers(0, 0);
        
        res.real=c1.real+c2.real;
        
        res.image=c1.image+c2.image;
        
        System.out.println("Addition: "+res.real + " +i" + res.image);
        
    }
    public static void sub(ComplexNumbers c1, ComplexNumbers c2){
        ComplexNumbers res = new ComplexNumbers(0, 0);
        
        res.real=c1.real-c2.real;
        
        res.image=c1.image-c2.image;
        
        System.out.println("\nSubtraction: "+res.real + " +i" + res.image);
        
    }
    public static void mul(ComplexNumbers c1, ComplexNumbers c2){
        ComplexNumbers res = new ComplexNumbers(0, 0);
        
        res.real=c1.real*c2.real;
        
        res.image=c1.image*c2.image;
        
      
        System.out.println("\nMultiplication: "+res.real + " +i" + res.image);
    }
    
    public static void swap(ComplexNumbers c1, ComplexNumbers c2){
        System.out.println("\nBefore Swapping: ");
        System.out.println("C1: "+c1.real + " +i" + c1.image);
        System.out.println("C2: "+c2.real + " +i" + c2.image);
        
        ComplexNumbers temp= c1;
        c1=c2;
        c2=temp;
        System.out.println("After Swapping: ");
        System.out.println("C1: "+c1.real + " +i" + c1.image);
        System.out.println("C2: "+c2.real + " +i" + c2.image);   
    }   
}
public class Assignment1_Question2 {

    public static void main(String[] args) {
        ComplexNumbers c1=new ComplexNumbers(5,9);
        ComplexNumbers c2=new ComplexNumbers(4,3);
        ComplexNumbers.add(c1,c2);
        ComplexNumbers.sub(c1, c2);
        ComplexNumbers.mul(c1, c2);
        ComplexNumbers.swap(c1, c2);
    } 
}
