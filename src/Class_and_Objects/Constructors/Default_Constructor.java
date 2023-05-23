package Class_and_Objects.Constructors;

class DefaultC{
    //Default Constructor
    /*
    Constructor is a [member method] of class which has same name as class name
    Constructor will always be there even it is not mentioned in the code
    Constructor will never return any thing 
    so it will not have any return types but it will have access specifiers like
    public,private,protected..
    Why constructor is used?
    It is used to allocate memory to object.
    Finally it is also used to initialize the values..
    */
    
    int i;
    float j;
    public DefaultC(){
       i=10;
       j=10.5f;
       float div = i/j;
       //It will be called automatically and prints first..
        System.out.println(i+"/"+j+"="+div);
    }
    static void sum1(){
        System.out.println("im static");
    }
    void Sum(){
        float add=i+j;
        System.out.println(i+"+"+j+"="+add);
    }
    
}
public class Default_Constructor {
    //MAIN METHOD
    /*
    What is String args[]?
    String can accept all values and [] is used because we cant say no of args
    so, taking it as array of args.
    It returns nothing so void
    */
    /*
    Why main method is static?
    To call any method in JAVA we need Object,
    main is the starting point of execution 
    so, main cannot be called without object and object cannot be created without main
    It becomes a deadlock, to solve it 
    we are using static (no need of objects)
    */        
    public static void main(String[] args) {
       
        /*
        Object Creation -> obj is reference of Class A,
        new will create object, it provides space that
        obj will take space in heap memory.
        How much Space for Object? (it will be given by Constructor)
        */
        //Constructor will be called when object created..
        DefaultC obj = new DefaultC();
        DefaultC.sum1();
        obj.Sum();
    }
    
}
