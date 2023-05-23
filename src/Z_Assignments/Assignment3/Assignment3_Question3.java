package Z_Assignments.Assignment3;

import java.util.*;

public class Assignment3_Question3 {

    public static void main(String[] args) {
     List<Integer> ls=new ArrayList<>();
     ls.add(128);
     ls.add(332);
     ls.add(219);
     ls.add(310);
     ls.add(99);
     
     ListIterator<Integer> revlist=ls.listIterator(ls.size());
     
     while(revlist.hasPrevious()){
         System.out.println(revlist.previous());
     }
    }   
}
