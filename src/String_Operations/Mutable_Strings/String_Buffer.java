package String_Operations.Mutable_Strings;
/*
StringBuffer is a class used to create muttable string, usually strings are immutable 
it cannot be modified but with StringBuffer we can append, insert inbetween, replace
delete, reverse and find the capacity and we can ensurecapacity.
It was introduced in 1.0

we cannot run two threads simantanously

//Always end index 's character will be ignored 

default capacity of StringBuffer is 21 when it is exceeding it will double the capacity and add 2.

*/


public class String_Buffer {

    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("Hello");
        //append();
        System.out.println("Initial Capacity of "+sb.capacity());
        sb.append(" Java");
        System.out.println("After append "+sb);
        
        //insert(fromindex,str);
        
        //5 is index of space btwn hello and java and world has space b4 and after
        
        sb.insert(5," world");
        System.out.println("After insert "+sb);
        
        //replace(startindex,endindex,str); 0 to 5 is hello with is replaced with HELLO
        
        sb.replace(0, 5,"HELLO");
        System.out.println("After replace "+sb);
        
        //delete(startindex,endindex);
        
        sb.delete(1,3);
        System.out.println("After delete "+sb);
        
        //reverse
        
        sb.reverse();
        System.out.println("After reverse "+sb);
        
        //capacity(); used to find max capacity of StringBuffer
        
        sb.reverse();
        
        System.out.println("Capacity before appending "+sb+"\nlength: "
                +sb.length()+" which is less than "+sb.capacity());
        
    
        sb.append(",java is object oriented");
        
        System.out.println("Capacity after appending (21*2)+2=44 "
                +sb+"\nlength: "+sb.length()+" which is less than "+sb.capacity());
        
        sb.append(" Language since 1995");
        
        System.out.println("Capacity after appending (44*2)+2=90 "
                +sb+"\nlength: "+sb.length()+" which is less than "+sb.capacity());
        
        //ensureCapacity(); is used to set min capacity for stringbuffer
        
        StringBuffer sb1 = new StringBuffer("Hello");
        System.out.println("Capacity : "+sb1.capacity());
        
        sb1.append("Java is my favorite language");
        
          System.out.println("Capacity after appending (21*2)+2=44 "
                +sb1+"\nlength: "+sb1.length()+" which is less than "+sb1.capacity());
          
          sb1.ensureCapacity(31);
          System.out.println("no change in Capacity because 31 is less than : "+sb1.capacity());
          
          sb1.ensureCapacity(50);
          System.out.println("Capacity changed to (44*2)+2=90 : "+sb1.capacity()+"\nbecause ensured capacity is 50");
        
    }
    
}
