package String_Operations;

public class String_HandlingDemo {

    public static void main(String[] args) {
        //String literal
        /*
        Using string literal all the string will get into the string pool which is in
        the heap memory and all the string will get same reference 
        here s1 will get into string pool and by creating s2 jvm will check the string
        pool if the string already exists in the pool, it will not create a new instance
        of s2(Only one object will be created).
        
        and for s3 same will happen but string will not be there in pool
        so new instance will be created.
        
        It is used because it will be more memory efficient
        */
        
        String s1 ="Helloworld";
        String s2 ="Helloworld";
        String s3 ="java";
        
        
        //By new keyword
        /*
        In this case JVM will create 2 objects this s4 will be stored in heap memory directly
        that takes 1 object and s2 will be stored in string pool but the variable s4 will refer 
        to object in the heap. (not string pool)
        */
        String s4 = new String("JAVA");
        
        char ch [] ={'J','A','V','A'};
        
        String s5 = new String(ch);
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
    }
    
}
