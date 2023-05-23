package Class_and_Objects.Polymorphism;

/*
  Covariant Return type:
It is used in with method overriding. to change the return type in subclass we are using this way.
after java 5...
we can return whether sametype of returntype or it should be subclass of it.
for eg:

Object-> String

This is from source of Object class
    Class {@code Object} is the root of the class hierarchy.
    Every class has {@code Object} as a superclass. All objects,
    including arrays, implement the methods of this class.

Number-> Integer Integer class extends Number class

Animal->Dog ..>dog extends animal
 */

class Animal {

    public void name() {
    }
//Object class is parent of all classes, 
    //every class extended by object to inherit several methods.
    public Object specality() {

        return null;
    }
//Number class is parent of all Numeric classes eg: integer,float,double,long,short ,etc
    public Number lifeSpan() {

        return null;
    }
//this is parent class method
    public Animal lifestyle() {
        System.out.println("Pet or wild");
        return new Animal();
    }
}

class Dog extends Animal {

    @Override
    public void name() {
        System.out.println("dog");
    }

    @Override
    public String specality() {
        String s="fast running";
        return s;
    }
//Integer is a subclass of Number ->
    
    @Override
    public Integer lifeSpan() {
        System.out.println(15);
        return null;
    }
//Class dog is subclass of Class animal so it can inherit parents method to it
    
    @Override
    public Dog lifestyle() {
        System.out.println("Dog class: Pet");
        return new Dog();
    }
}

public class Covariant_ReturnType {

    public static void main(String[] args) {
        //All objects are reffering to Dog class..
        Animal obref = new Dog();
        obref.lifestyle();
        obref.name();
        System.out.println(obref.specality());
        obref.lifeSpan();
    }

}