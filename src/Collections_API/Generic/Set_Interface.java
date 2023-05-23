package Collections_API.Generic;

/*
Difference between list and set is we cannot have duplicate values 
and set will not print in the same way we added
 
to find it is added or not we can just print while adding

Why random order: <HashSet>
    It is because of HashSet uses a concept of Hashing, it does whenever adding values to set
it will go to heap memory hashing will some algorithm and by using that it will fetch nearest value 
first so sequence will not get maintained.

To want Set in Ascending order <TreeSet> we can use.


 */

import java.util.*;

public class Set_Interface {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        Integer [] arr=new Integer[5];
        
        Set<Integer> set100=new HashSet<>();
        Collections.addAll(set100, arr);
        
        set.add(87);
        set.add(97);
        set.add(34);

        System.out.println("Adding 34 again: " + set.add(34));
        System.out.println("Adding 27 new: " + set.add(27));

        System.out.println("It is not in order as we added: ");
        for (Integer s : set) {
            System.out.println(s);

        }
        
        Set<Integer> set1= new TreeSet<>();
        set1.add(87);
        set1.add(97);
        set1.add(34);
        System.out.println("Adding 97 again(TreeSET): " + set1.add(97));
        System.out.println("It is in asc sorted order: ");
        for (Integer s : set1) {
            System.out.println(s);
        }
        Set<Integer> set2= new LinkedHashSet<>();
        set2.add(87);
        set2.add(97);
        set2.add(34);
        System.out.println("Adding 97 again(LinkedHashSET): " + set2.add(97));
        System.out.println("It is in order entered: ");
        for (Integer s : set2) {
            System.out.println(s);

        }
    }

}
