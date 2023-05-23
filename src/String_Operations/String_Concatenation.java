package String_Operations;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class String_Concatenation {

    public static void main(String[] args) {
        String s1= "Hello";
        String s2 = "World";
        
        //+ concat
        String s3 = s1+s2;
        System.out.println(s3);
        
        //concat()
        
        s3=s1.concat(s2);
        System.out.println(s3);
        
        // we can use so many times to concat more
        String s11 ="JAVA";
        System.out.println(s1.concat(s2).concat(s11));
        
        //String Builder class
        StringBuilder s4 = new StringBuilder(s1);
        StringBuilder s5 = new StringBuilder(s2);
        
        StringBuilder s6= s4.append(s5);
        System.out.println(s6);
        
        //format()
        
        String s7 = String.format("%s * * %s",s1,s2);
        System.out.println(s7);
        
        //String.join() method
        
        String s8 =String.join("-", s1,s2);
        System.out.println(s8);
        
        //String joiner class
        
        StringJoiner s9 = new StringJoiner("--");
        s9.add(s1);
        s9.add(s2);
        System.out.println(s9.toString());
        
        //Collections method Collectors.joining() 
        //need to import list and arrays
        
        List<String> l1 = Arrays.asList("Hello","World","Java");
        String s10 = l1.stream().collect(Collectors.joining(", "));
        System.out.println(s10);
        
    }
    
}
