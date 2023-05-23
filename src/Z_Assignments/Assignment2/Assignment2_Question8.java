package Z_Assignments.Assignment2;

public class Assignment2_Question8 {

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "abcde";

        System.out.println("s1 and s2 both are same because the value is stored in same instance of string pool"
                + "\n");
        System.out.println("HashCode of s1: " + s1.hashCode() + "\nHashCode of s2: " + s2.hashCode());

        s1.concat(s2);
        System.out.println("Immutable String: " + s1 + " HashCode hasn't changed: " + s1.hashCode());
        s1 = s1.concat(s2);
        System.out.println("String value is changed \nbut it refers to new object: "
                + s1 + " its new HashCode: " + s1.hashCode());

        StringBuffer sb1 = new StringBuffer("abcdefg");
        System.out.println(sb1 + " its HashCode of StringBuffer: " + sb1.hashCode());
        sb1.append(s2);
        
        System.out.println(sb1 + " its HashCode of StringBuffer: " + sb1.hashCode()
                + "\nboth are same after changing,  StringBuffer is Mutable");
        sb1.hashCode();
        
        StringBuilder sb2 = new StringBuilder("abcdefgh");

        System.out.println(sb2 + " its HashCode of StringBuilder: " + sb2.hashCode());
        sb2.append(s2);
        
        System.out.println(sb2 + " its HashCode of StringBuilder: " + sb2.hashCode()
                + "\nboth are same after changing, StringBuilder is Mutable");
        sb2.hashCode();
    }
}
