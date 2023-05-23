package Arrays;

/*  
    Array is a collection of variables
    int a; int b; int c; int d; can be like int [] arr = {a,b,c,d};
    Array index starts with 0.
    To access array we can use index values like a points to index of 0. 

*/
public class Array_Demo {

    public static void main(String[] args) {
        //1 deminsional array
        int [] num  = new int[4]; //list=[]
        
        //or int num[]={2,4,6,8}; we can use this when we know elements of array 
        num[0]=2;
        num[1]=4;
        num[2]=6;
        num[3]=8;
        
        String student[]={"raj","ram","ravi","rahul"};
        //Displaying array
                        //num.length -> refers to size of array something array size may change 
                        // so it is good to use
               System.out.println("Int Array and array size: "+num.length);         
        for (int i=0;i<num.length;i++)
        {   
            // i refers to  index position and num[i] refers to value in the index of array
            System.out.println("Array Index: "+i+" Value in that index: "+num[i]);
        }
        System.out.println("\nString Array");
        for (int i=0;i<num.length;i++)
        {   
            // i refers to  index position and num[i] refers to value in the index of array
            System.out.println("Array Index: "+i+" Value in that index: "+student[i]);
        }
    }
    
}
