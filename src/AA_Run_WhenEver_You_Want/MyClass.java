package AA_Run_WhenEver_You_Want;
import java.util.*;
public class MyClass {
    public static int fs(String s) {
        Set<Character> temp=new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            temp.add(s.charAt(i));
        }        
        return s.length()-temp.size();
    }
    public static void main(String[] args) { 
        System.out.println(fs("abbcbcbb"));
    }
}
