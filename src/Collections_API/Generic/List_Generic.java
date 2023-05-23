package Collections_API.Generic;

/*
<> - angular brackets to mention type of collection or Diamond Interface

In java 1.0 we got vector

In java 1.2 we got collection api

in java 1.5 we got generics

before java 1.7 
we have to mention collection type which makes it generic in both sides. like

List <Integer>values = new ArrayList<Integer>(); 

after  java 1.7 
If we have <Integer> on left why to mention it in right we can do like <> this
hereafter
List<Integer> values = new ArrayList<>();

 */
import java.util.*;

public class List_Generic {

    public static void main(String[] args) {
        // List <Integer>values = new ArrayList<Integer>(); 
        //List is an interface , ArrayList is a class, List is Mutable
        
        List<Integer> values = new ArrayList<>();
        values.add(448);
        values.add(695);
        values.add(939);
        values.add(221);
        //error-> values.add("yes");
        
        
       //To sort the list
        Collections.sort(values);
        
        //To reverse
        Collections.reverse(values);
        
        //To shuffle Collections.shuffle(values);

         
        //Since it is generic and mentioned as Integer we cannot add Strings
        for (Integer ob : values) {
            System.out.println(ob);
        }
        System.out.println("SIZE: "+values.size());
        
        System.out.println();
        
        //to initialize known values without add method.
        List<Integer> l2 = Arrays.asList(4,5,6,7,8,9,10);
        
        for (Integer ob : l2) {
            System.out.println(ob);
        }
        //to initialize values with double braces method.
        //After java 9 no need of <Datatype mention> in right side
        List<Integer> l3 = new ArrayList<Integer>(){{
            
            add(1);
            add(2);
            add(3);
            
        }};
        System.out.println();
        for (Integer ob : l3) {
            System.out.println(ob);
        }
    }

}
