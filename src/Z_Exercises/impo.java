package Z_Exercises;

import java.util.*;

public class impo {

    public static void main(String args[]) {
            String s="important";
            
           int n=4;
           
           String n1 = s.substring(0,n);
           int m =s.length()-1;
           String n2 = s.substring(n,m+1);
           char []c = n1.toCharArray();
           String rev="";
           for(int i=c.length-1;i>=0;i--){
               rev+=c[i];
           }
           String finals= rev+n2;
           System.out.println(finals);
    }
}
