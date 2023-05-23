package Collections_API.Generic;

/*
Map is a interface with two generic parameters like key and value it exactly works like dictonary in python
it will have key and value which pairs and we can get value by key and key by value<vice versa>

To implement Map we need Class like HaspMap or HashTable

HashMap: It also uses the concept of Hash code which will not give in sequence 
it is not synchronized order may change from 1.2, Fast, Works with one thread.
allows null key
    
HashTable: it is synchronized , if we need it to be thread safe we can use hashtable 
from 1.0, slow, works with multi threads doesnt allow null key

LinkedHashMap is more like tree map it will not change the order.
 */
import java.util.Map;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class Map_Interface {

    public static void main(String[] args) {
        Map<String, String> m1 = new HashMap<>();
        m1.put("MyName", "yuva");
        m1.put("actor", "vijay");
        m1.put("ceo", "ram");

        System.out.println("Random:\n");
        //how to print which for
        Set<String> k1 = m1.keySet();

        for (String s1 : k1) {
            System.out.println("Key: " + s1 + ", Value: " + m1.get(s1));
        }

        Map<String, String> m2 = new Hashtable<>();
        m2.put("MyName", "yuva");
        m2.put("actor", "vijay");
        m2.put("ceo", "ram");

        System.out.println("\nReversed: \n");
        Set<String> k2 = m2.keySet();
        for (String s2 : k2) {
            System.out.println("Key: " + s2 + ", Value: " + m2.get(s2));

        }

        System.out.println("\nDirect: \n");
        Map<String, String> m3 = new TreeMap<>();
        m3.put("MyName", "yuva");
        m3.put("actor", "vijay");
        m3.put("ceo", "ram");

        Set<String> k3 = m3.keySet();
        for (String s3 : k3) {
            System.out.println("Key: " + s3 + ", Value: " + m3.get(s3));

        }
        System.out.println("\nLinked Hash Map with Map Entry\n");
        Map<String, String> m4 = new LinkedHashMap<>();
        m4.put("MyName", "yuva");
        m4.put("ceo", "ram");
        m4.put("actor1", "vijay");
        m4.put("actor2", "ajith");
        m4.put("actor3", "vikram");
        Set<Map.Entry<String, String>> k4 = m4.entrySet();

        for (Map.Entry<String, String> s4 : k4) {
            System.out.println(s4.getKey() + " : " + s4.getValue());
        }

        System.out.println();

        //Can we give duplicate-> no it will replace existing
        m1.put("ceo", "Ravi");

        System.out.println(m1);

        //to fetch value using key we have to specify key 
        //if it not exist it will give null not exception
        System.out.println("Ceo: " + m1.get("ceo"));

        //To get all values
        System.out.println(m1.values());

        //to get all keys
        System.out.println(m1.keySet());

        //to print all
        System.out.println(m1.entrySet());

        //to print all 2
        System.out.println(m1);

    }

}
