package Class_and_Objects.Encapsulation;

/*
primitive datatypes     Wrapper Class
int                     Integer
float                   Float
double                  Double
char                    Character
byte                    Byte
short                   Short
long                    Long
boolean                 Boolean

*/
public class WrapperClass {

    public static void main(String[] args) {
       /*
        In oops everything should be with object, here int is primitive datatype
        i is a variable not object so we need to replace this
        Instead of int we can use classes
       */
        int i=10;  // this is faster
        
        /*
        why wrapper class?
            It will be used in frameworks like hibernate, Collections api
        which only supports wrapper class not with primitive.
        */
        
        /*
        obj is a reference/object not a variable
        */
        Integer obj = 5; // this is wrapper class // this is slower than int
        //Integer obj = new Integer(5); -> we can write like this too.
        
        System.out.println(i);
        System.out.println(obj);
        
        
        //If im inserting a primitive datatype into this it is called Boxing or Wrapping
        
        
        Integer obj1 = new Integer(i);//Boxing or Wrapping
        
        Integer obj2 = i; //AutoBoxing or AutoWrapping new Integer() will be done by java in backend.
        System.out.println(obj1+obj2);
        
        //to get value of wrapper class obj
        
        // this is unboxing or unWrapping -> changing object to primitive datatype
        int j = obj.intValue(); 
       
        int k = obj; // it is AutoUnboxing or AutoUnWrapping
        
        int oo = (int)obj; //-> we can cast object to int datatype instead of above
        System.out.println(oo);
        
       /*-------------------------------------------------------------------------------*/
       
       String str ="123";
       // this will parse the string to int 
       int n = Integer.parseInt(str);
       
       System.out.println(n);
    }
    
}
