package Collections_API.Generic;

/*
Vector -> dynamic array it is like list, 
    arraylist but their is one extra thing which is capacity. its is from jdk 1.0 
    list all came after 1.2

Difference: 
    Arraylist has size,                         Vector has capacity
    Capacity/ Size increases by 50%,            Capacity/ Size increases by 100%
    Helps in memory management,                 Waste lots of memory
    It is not thread safe/ not synchronized     It is Synchronized, thread safe by theoritically
    Fast because not Thread safe                Slow due to Thread safe
    Wins                                        Lost

*/

import java.util.Vector;

public class Vector_Class {

    public static void main(String[] args) {
        
        Vector<Integer> v = new Vector<>();

        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        v.add(6);
        v.add(1);
        v.add(2);
        v.add(3);// 8 values
        v.add(9);//Capacity is 10 till now
        v.add(11);
//It increased dynamically to 20 now if we add 20 values it will double the 100% its cap 

        for (int i : v) {
            System.out.println(i);
        }
        System.out.println("Capacity of Vector:" + v.capacity());
    }

}
