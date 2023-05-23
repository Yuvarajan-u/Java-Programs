package Collections_API.NonGeneric;
/*
    collection -concept
    Collection -Interface
    Collection -Class
   
    Array is fast compared to Collections, It is size is fixed we can use array
    or else we can go for collections. Uses: Dynamic array, expand or shrink 

    Collection interface belongs to util package
    to add elements use add(); to remove use remove() for arraylist

    Collections dont work with index numbers.


*/
import java.util.*;
public class CollectionDemo {

    public static void main(String[] args) {
        /*
        Interface we cannot create object directly so 
        we do search for class implements collections
         */
        Collection values = new ArrayList();
        values.add(458);//We are adding objects here It is Integer v = new Integer(4);
        values.add(4786);
        values.add(9468);
        values.add(9);
        //In collections we should give the value that we have to remove
        values.remove(9);
        System.out.println(values);
        //Iterator is used to fetch one elment from collections
        
        values.add(8);
        
/*
        Iterator is an interface used to values from collection
        it can iterate over the collection so we can fetch one by one
        It has a method iterator() which can return values
        
*/
        Iterator it = values.iterator();
/*
        System.out.println(it.next()); since we dont know how many in collection
        we can use loop to fetch all
        hasNext() will check or iterator over the collection to end.
*/
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("\n\n");
        //we can use for each for Collections to print all
        
        for(Object ob:values){
            System.out.println(ob);
        }

    }

}
