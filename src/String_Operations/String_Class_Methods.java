package String_Operations;

import java.util.Locale;

public class String_Class_Methods {

    public static void main(String[] args) {

        String s = new String("YuVaRaJaN U ");

        System.out.println("Lowercase: " + s.toLowerCase());

        System.out.println("Uppercase: " + s.toUpperCase());

        // This will remove unwanted space after string: 
        //if we want to update we need to use s=s.trim();
        System.out.println("Trim: " + s.trim());
        
        //startsWith();
        System.out.println("Starts with Y? " + s.startsWith("Y"));

        //endsWith();
        System.out.println("Ends with U? " + s.endsWith("U")
                + " Because this string has space after chars");

        //charAt();-> to get char from specific index
        System.out.println("charAt 4th index: " + s.charAt(4));
        
        //intern();
        /*
        intern() is used to get the String from the heap memory and set in string pool
        here s1 will  be in heap memory by using s1.intern() assigned to s1 will set
        s1 to string pool.
        */
        String s1 = new String("yuva");
        String s2 = "yuva";
        String s3 = "yuva";
        
        System.out.println(s1==s2);//false s1 is not in string pool so it is not equal
        
        System.out.println(s2==s3);//true both are in string pool
        
        s1 = s1.intern();
        
        System.out.println(s1==s2);//s1 is in string pool now, so true
        
        //valueOf() method is used to change any datatype to String
        
        int a =100;
        
        String s4=String.valueOf(a);
        //concatentation will happen not addition 
        System.out.println("Result: "+a+10);
        
        /*
        replace(str1,str2) will find for str1 in given 
        string and replace with str2 in that position
        */
        String s10="C++ is Object oriented Programming language";
        System.out.println(s10);
        String s5 = s10.replace("C++", "Java");
        
        System.out.println(s5);

    }

}
