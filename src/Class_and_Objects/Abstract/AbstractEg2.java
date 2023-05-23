package Class_and_Objects.Abstract;
/*
In this program:

(Number i)
Number is an abstract class which was extended by Integer, Double, Float classes
So we can define Number directly which will work as int,double and float
*/

class Printer{
    public void show(Number i){
        System.out.println(i+" "+ i.getClass().getName());
    }
}
public class AbstractEg2 {

    
    public static void main(String[] args) {
        Printer obj = new Printer();
        obj.show(5);
        obj.show(5.6);
        obj.show(5.7f);
    }
    
}
