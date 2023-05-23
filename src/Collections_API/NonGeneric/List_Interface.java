package Collections_API.NonGeneric;

/*  List interface have Index so we can access through index position still its starts from 0
    Collection dont have index numbers to add element in between we need to use 
    List interface instead of Collection 
Arraylist implementing List and list implementing Collection it is connection between them
Advantage of list is  it has index position to add elements we can do by add(index,value);

This is a non generic Collection type
    so we can have int,string,float in same list or collection.
    This is a list of objects.(Wrapper Class Object) 
*/

import java.util.*;

public class List_Interface {

    public static void main(String[] args) {
        //Interface obj = new class();
        //This is a raw type Collection-> List
        List values = new ArrayList();
        values.add(4);//int 4 it is Integer v = new Integer(4);
        values.add(6);//This all are objects of integer.
        values.add(9);

        //adding in between
        System.out.println(values);
        //Iterator is used to fetch one elment from collections

        values.add(2, 2);

        //We cannot sort in collections but we can in lists
        Collections.sort(values);
        Iterator it = values.iterator();

        //System.out.println(it.next()); since we dont know how many in collection
        //we can use loop to fetch all
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //To access specific element through index->  values.get(index number);
        System.out.println("\n" + values + "and its Index position 1: " + values.get(1));

        //To remove use its index position
        values.remove(3);
        
        //To remove using value in the list we need Object
        Object o = 6;
        values.remove(o);
        //We can add String with it because it is non generic
        values.add("String");
        
        System.out.println("\nPrinting list with for loop");

        for (int i = 0; i < values.size(); i++) {
            System.out.println(values.get(i));
        }
        
        
        System.out.println("\nusing for each loop");
        
        for(Object ob : values){
            System.out.println(ob);
        }
        
        /*
        For each loop using lambda expression we cannot use for all 
        only with Collections
        
        values.forEach((ob) -> {
            System.out.println(ob);
        });
        
        //Another method to print this is Stream API which uses Lambda Expression
        
        values.forEach(System.out::println);
    */
         
        
    }

}
