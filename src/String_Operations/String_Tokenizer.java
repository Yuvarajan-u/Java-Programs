package String_Operations;

/*

boolean hasMoreTokens() 	It checks if there is more tokens available.
String nextToken()              It returns the next token from the StringTokenizer object.
String nextToken(String delim)	It returns the next token based on the delimiter.
boolean hasMoreElements()	It is the same as hasMoreTokens() method.
Object nextElement()            It is the same as nextToken() but its return type is Object.
int countTokens()               It returns the total number of tokens.

String Tokenizer is used to seperate the string with some regex like delimiter
we can store it to arrays also.
 */

import java.util.Arrays;
import java.util.StringTokenizer;

public class String_Tokenizer {

    public static void main(String[] args) {

        String s1 = "Hello, im, java, programming";

        StringTokenizer st = new StringTokenizer(s1, " ");

        //hasMoreTokens() and  nextToken()
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        //we cannot use again because it will print to end 
        //and it will not have nextToken to print: cause error

        StringTokenizer st1 = new StringTokenizer(s1, " ");

        //nextToken(String delimiter);
        System.out.println("Next token: " + st1.nextToken(","));

        StringTokenizer st2 = new StringTokenizer(s1, " ");

        //hasMoreElements () and nextElement() -> returns object type we can use in enum.
        while (st2.hasMoreTokens()) {
            System.out.println(st2.nextElement());
        }

        //countTokens()
        StringTokenizer st3 = new StringTokenizer(s1, " ");
        //We cannot use already used because it has used all tokens so st2 count will give 0
        System.out.println("Number of tokens: of st2: " + st2.countTokens());
        System.out.println("Number of tokens: of st3: " + st3.countTokens());

        //String Tokenizer to Array
        s1="hello world im java";
        StringTokenizer st4 = new StringTokenizer(s1, " ");
        int i = 0;

        int len = st4.countTokens();
        String arr[] = new String[len];
        //i<len is not mandatory because limit will be given by hasmoretokens itself
        
        while (i < len && st4.hasMoreTokens()) {
            arr[i] = st4.nextToken();
            i++;
        }
        for (String s : arr) {
            System.out.println(s);
        }

        System.out.println(Arrays.toString(arr));

        //Reverse Order of String in Array not letters..
        int j;

        String[] revarr = new String[len];

        for (i = arr.length - 1, j = 0; i >= 0; i--, j++) {

            revarr[j] = arr[i];

        }
        for (i = 0; i < arr.length; i++) {
            System.out.print(revarr[i] + " ");
        }

    }

}
