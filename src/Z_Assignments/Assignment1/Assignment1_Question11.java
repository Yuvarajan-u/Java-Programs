package Z_Assignments.Assignment1;

abstract class Shape{
    abstract void draw();
}
class Line extends Shape{

    @Override
    void draw() {
        System.out.println("Line Drawn");
    }
    
}
class Rectangle extends Shape{

    @Override
    void draw() {
        System.out.println("Rectangle Drawn");
    }
    
}
class Cube extends Shape{

    @Override
    void draw() {
        System.out.println("Cube Drawn");
    }  
}

public class Assignment1_Question11 {

    public static void main(String[] args) {
        Shape obj1 =new Line();
        obj1.draw();
        Shape obj2 =new Rectangle();
        obj2.draw();
        Shape obj3 =new Cube();
        obj3.draw();
    }   
}
