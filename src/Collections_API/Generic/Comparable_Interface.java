package Collections_API.Generic;

/*
Comparable interface:

    Whenever we want a class objects to be compared and sorted 
we have to implement Comparable interface   with<Classname> mentioned in angular braces.

To create a collection class:

Create a class with param constructor and toString() method to print
in the main method Create a object for kind of Collection 
we need and reference an interface to class.
use add() method with new Classname(parameters); to add the inputs to collection

and to sort use compareTo method of comparable interface 
in that use a varaible which needs to be compare with if else or ternary operator to sort
in which to give permission to swap when it is less than previous value and return it.

In comparator we need two values but in comparable we need one value to sort.
 */
import java.util.*;

class Students implements Comparable<Students> {

    int rollno, marks;
    String name;

    public Students(int rollno, String name, int marks) {
        this.rollno = rollno;
        this.marks = marks;
        this.name = name;

    }

    @Override
    public String toString() {

        return "Students[" + "rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";

    }
/* to sort numbers
    @Override
    public int compareTo(Students o1) {

        return marks > o1.marks ? 1 : -1;
    }
*/
    //To sort Strings using length
 /*@Override
    public int compareTo(Students o) {

        return name.length() > o.name.length()  ? 1 : -1;
    }
*/
    // to sort names with last letter
@Override
    public int compareTo(Students o){
        return name.charAt(name.length()-1)> o.name.charAt(o.name.length()-1)? 1:-1;
    }
}

public class Comparable_Interface {

    public static void main(String[] args) {
        List<Students> s = new ArrayList<>();
        s.add(new Students(20, "yuva", 85));
        s.add(new Students(21, "rajan", 66));
        s.add(new Students(22, "nirmal", 79));
        s.add(new Students(23, "kumar", 56));
        s.add(new Students(24, "udaya", 90));

        Collections.sort(s);
        System.out.println("\nName sorted\n");
        for (Students sb : s) {
            System.out.println(sb);

        }
        //To sort in future we can do like this 
        Collections.sort(s,(i,j)->i.marks>j.marks?1:-1);
        
        System.out.println("\nMark sorted\n");
        for (Students sb : s) {
            System.out.println(sb);

    }
    }
}
