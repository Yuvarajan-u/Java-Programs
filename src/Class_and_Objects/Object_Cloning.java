package Class_and_Objects;
/*
    adv:
    You don't need to write lengthy and repetitive codes. 
    Just use an abstract class with a 4- or 5-line long clone() method.
    
    It is the easiest and most efficient way for copying objects, 
    especially if we are applying it to an already developed or an old project.
    
    Just define a parent class, implement Cloneable in it, 
    provide the definition of the clone() method and the task will be done.
    Clone() is the fastest way to copy array.
    
    Disadv: 
    Object.clone() is protected, 
    so we have to provide our own clone() and indirectly call Object.clone() from it.

    Object.clone() doesn't invoke any constructor so we don't have 
    any control over object construction.

    If you want to write a clone method in a child class then all of its superclasses 
    should define the clone() method in them or inherit it from another parent class. 

    Otherwise, the super.clone() chain will fail.

    Object.clone() supports only shallow copying but 
    we will need to override it if we need deep cloning.
*/

//To use object cloning we need to implement first..
class ObClass implements Cloneable {

    int rollno;
    String name;

    public ObClass(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

public class Object_Cloning {

    public static void main(String[] args) throws CloneNotSupportedException {
        ObClass ob1 = new ObClass(20, "yuva");
        //Down casting
        ObClass ob2 = (ObClass) ob1.clone();

        System.out.println(ob1.rollno + " " + ob1.name);
        System.out.println(ob2.rollno + " " + ob2.name);
    }

}
