package Collections_API.Generic;

/*
In this program im going to sort based on the last digit of the integer.

Comparator is used to create logic of out own in sorting

To do this We need a object with logic 

Collections.sort(Collection obj, comparator object);

 
 Why returning 1 and -1?
  sort() will search the element and asking permission to swap the elements 
  or not. sorting is totally based on when and when not to swap.
  1 means swap and -1 means dont swap.
               
 */
import java.util.*;

class LastDigit implements Comparator<Integer> {

    @Override
    public int compare(Integer i, Integer j) {
        //We can write code here or we can use anonymous class
        //%10 because we want lAst digit

        if (i % 10 > j % 10) {
            return 1;
        } else {
            return -1;
        }
    }

}

public class Comparator_UserSort {

    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(7244);
        values.add(6413);
        values.add(9331);
        values.add(8122);

        /*
        Lets create object of Comparator it is a interface which cannot able to create object
        so we need a class to get it unfortunatly Comparator of collections doesnt implemented
        by classes so we should create our own class.
         */
        System.out.println("\nFourth Digit");
        Comparator<Integer> c1 = new LastDigit();
        //to use custom sort use obj with sort(list,obj);
        Collections.sort(values, c1);

        for (Integer ob : values) {
            System.out.println(ob);
        }

        System.out.println("\nThird Digit");

        Comparator<Integer> c2 = new Comparator<Integer>() {
            @Override 
            public int compare(Integer i, Integer j) {
                /*                
                We can write code here or we can use anonymous class
                %100 because we want last before digit
                Instead of if else we can use Ternary operator
                 */
                return i % 100 > j % 100 ? 1 : -1;
            }
        };
        Collections.sort(values, c2);

        for (Integer ob : values) {
            System.out.println(ob);
        }

        System.out.println("\nSecond Digit");
               //No need to mention datatype with parameter c3=(Int.. i, Int.. j)
               
        Comparator<Integer> c3 = (i, j) -> i % 1000 > j % 1000 ? 1 : -1;
        /*
        We can use lambda expression also so no need of Integer i, j and no need of curly braces
        and no need of return statement also.
        
        %1000 because we want last before digit
         */

        Collections.sort(values, c3);

        for (Integer ob : values) {
            System.out.println(ob);
        }

        System.out.println("\nFirst Digit");
        Collections.sort(values);
        values.forEach((ob) -> {
            System.out.println(ob);
        });

    }

}
