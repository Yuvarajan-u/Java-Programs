package Collections_API.Generic;

/*
T is userdefined word which is used to define the general name for all data types Classes
we can restrict it using extends with specific super class like in line 9.

even in the Getter setters it gets T type and sets T type.
*/
import java.util.*;

class NumOnly<T extends Number> {

    T val;

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public void showType() {
        System.out.println("DataType: " + val.getClass().getName());
    }

    public void getArr(ArrayList<? extends T> obj) {
/*
   extends will allow to use sub classes Number-> integer,float,double
   super will allow to use super class of that class Integer-> Number
*/
    }
}

public class GenericDemo {

    public static void main(String[] args) {
            NumOnly<Number> obj = new NumOnly<>();
            obj.val=Integer.MAX_VALUE;
            obj.showType();
            obj.val=Short.MAX_VALUE;
            obj.showType();
            obj.val=Long.MAX_VALUE;
            obj.showType();
            obj.val=Byte.MAX_VALUE;
            obj.showType();
            obj.val=Double.MAX_VALUE;
            obj.showType();
            obj.val=Float.MAX_VALUE;
            obj.showType();
            
            //obj.getArr(new ArrayList<Double>());
    }

}
