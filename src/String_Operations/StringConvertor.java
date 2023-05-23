package String_Operations;

/*

Here we have used a simple logic to explain String Handling methods and String Buffer Class Operation

StringBuffer: -> A thread-safe, mutable sequence of characters.(we can change again)
Normally Strings are immutable, it will create a new object in String pool of heap memory 

for eg: String str="a"; str= str+" b"; it will create 2 objects one for a and another for b.
But in StringBuffer it will use only one object for all work..

Logic: by using ascii values we can say which is letter, number or spl char.. using condition
we can delete others and print the remaining.

why i--;        after deletion: 
decrementing because if 2 letters coming next to next like 948ab89 a will be deleted and the b's index 
changed to a's index which will not able to check again and letter will not be removed
i-- will reset the index to same position so it will check all over the string..

 */
public class StringConvertor {

    public static String onlyNum(String str) {
        StringBuffer s = new StringBuffer(str);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < 48 || s.charAt(i) > 57) {
                s.deleteCharAt(i);
                i--;

            }
        }
        return s.toString();

    }

    public static String onlyLower(String str) {
        StringBuffer s = new StringBuffer(str);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < 97 || s.charAt(i) > 122) {
                s.deleteCharAt(i);
                i--;
            }
        }
        return s.toString();

    }

    public static String onlyUpper(String str) {
        StringBuffer s = new StringBuffer(str);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < 65 || s.charAt(i) > 90) {
                s.deleteCharAt(i);
                i--;
            }
        }
        return s.toString();

    }

    public static String onlySpl(String str) {
        StringBuffer s = new StringBuffer(str);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < 33 || s.charAt(i) > 47 
                    && s.charAt(i) < 58 || s.charAt(i) > 64
                    && s.charAt(i) < 91 || s.charAt(i) > 96
                    && s.charAt(i) < 123 || s.charAt(i) > 126) {
                
                s.deleteCharAt(i);
                i--;
            }

        }
        return s.toString();// s is object of StringBuffer so we need to convert to string.

    }

    public static void main(String[] args) {
        String s1 = "98hdf9ABC.@/^#!832Z7cs";
        System.out.println("Original String: " + s1+"\n");
        s1 = onlyNum(s1);
        System.out.println("String with only Numbers: " + s1);

        String s2 = "98hdf9ABC.@/^#!832Z7cs";
        s2 = onlyLower(s2);
        System.out.println("String with only Lowercase letters: " + s2);

        String s3 = "98hdf9ABC.@/^#!832Z7cs";
        s3 = onlyUpper(s3);
        System.out.println("String with only Uppercase letters: " + s3);

        String s4 = "98hdf9ABC.@/^#!832Z7cs";
        s4 = onlySpl(s4);
        System.out.println("String with only Special characters: " + s4);
    }

}
