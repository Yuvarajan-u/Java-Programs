package String_Operations;

import java.util.Arrays;

public class String_Split {

    public static void main(String[] args) {

        String str = "yuva.rajan,yuva,rajan";

        System.out.println(str);

        String name[] = str.split("\\,");

        for(String i: name)
            System.out.println(i);
        
        System.out.println(Arrays.toString(name));
    }
    

}
