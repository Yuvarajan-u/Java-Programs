
package String_Operations;

public class String_Comparison {

    public static void main(String[] args) {
        String s1="A";
        String s2= "a";
        String s3 = new String("A");
       
        
        //String Comparison equals, ==, compareTo
        
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s2));
        System.out.println(s2.equalsIgnoreCase(s3));
        System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)
        System.out.println(s1==s2);//true (because both refer to same instance) 
         
        String c1="ab";
        String c2 = "ad";
        String c3="ab";
        String c4="dn";
        String c5 = "db";
        String c6 =""; // empty string
        String c7 ="AB"; //case sensitive
        
        // 2 a and a same next distance between d and b is 2, d is compared to b d is big so +
        System.out.println(c2.compareTo(c1));
        
        //0 all are same so 0
        System.out.println(c1.compareTo(c3));
        
        // -3 distance between a and d is b c d 3 c4 is compared to c2 c4 had d so c2<c4  so -3
        System.out.println(c2.compareTo(c4)); 
        
        //d and d same distance between n and b is 12 and c4>c5 so pos val =12.
        System.out.println(c4.compareTo(c5)); 
        
        //compare to between string and empty string it gives length of compared string
        System.out.println(c5.compareTo(c6)); 
        
        //compare between a and A ASCII of a is 97 and A is 65 so, 97-65=32 will be printed..
        System.out.println(c1.compareTo(c7)); 
    }
    
}
