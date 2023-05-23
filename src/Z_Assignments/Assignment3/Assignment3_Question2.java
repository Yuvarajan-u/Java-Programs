package Z_Assignments.Assignment3;

import java.util.*;

public class Assignment3_Question2 {

    public static void main(String[] args) {
        System.out.println("HashSet: ");
        Set<Integer> set = new HashSet<>();
        set.add(87);
        set.add(97);
        set.add(34);

        System.out.println("It is not in order as we added: ");
        for (Integer s : set) {
            System.out.println(s);
        }
        System.out.println("\nLinkedHashSet");
        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(87);
        set2.add(97);
        set2.add(34);

        System.out.println("It is in order entered: ");
        for (Integer s : set2) {
            System.out.println(s);
        }
    }
}
