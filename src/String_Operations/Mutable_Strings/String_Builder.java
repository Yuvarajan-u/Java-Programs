package String_Operations.Mutable_Strings;

/*
StringBuilder is same as StringBuffer but this is not thread safe.
String builder is non synchronized, so if we need to run two methods simultaneously 
with string it is preffered to use StringBuilder other than StringBuilder is same 
as StringBuffer including their methods and constructors.

StringBuilder is more efficient than StringBuffer it was introduced in 1.5
*/
public class String_Builder {

    public static void main(String[] args) {
       StringBuilder sb = new StringBuilder("Hello Java");
       //To get substring
        System.out.println(sb.substring(0, 5));
    }
    
}
 