package String_Operations.String_VS_StringBuffer;

public class HashCodeTest {

    public static void main(String[] args) {
        System.out.println("Hash code will change with strings");

        String str = "Hello";
        System.out.println(str + " " + str.hashCode());
        str = str + "World";
        System.out.println(str + " " + str.hashCode());
 
        System.out.println("Hashcode will not change when using StringBuffer");

        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb + " " + sb.hashCode());

        sb.append("World");
        System.out.println(sb + " " + sb.hashCode());
    }

}
