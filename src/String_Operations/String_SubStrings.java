package String_Operations;

import java.util.Arrays;

/*
2 types of substring methods are there in java

1) with start index -> gives char sequence after that index-> inclusive
2) with start, end index-> gives charseq within that index and ignores end index. -. exclusive
 */
public class String_SubStrings {

    public static void main(String[] args) {
        //substrings
        
        String s, s1, s2;
        s = new String("YuvarajanU");
        //length() method -> to find length of string
        
        int strlen = s.length();
        int len = strlen-1;
        
        s1 = s.substring(4);//gives rajanU
        s2 = s.substring(0, 9);//gives Yuvarajan and ignores 9th index U
        
        System.out.println("Length "+strlen+" Considering arrays index starts from 0 so length is "+len);
        System.out.println("StartIndexOnly: "+s1);
        System.out.println("start and end index: "+s2);
        
        //split() method
        
        String s4 = new String("yuvarajan-u-20mca0020");
        
        String [] s5 = s4.split("\\-");
        // split search for given regex in this hypen(-) is given at it splits when it gothrough it
        System.out.println(Arrays.toString(s5));
    }

}
