//package AA_Run_WhenEver_You_Want;
//
//import java.util.*;
//
//class Shape {
//
//    protected String ShapeName = "";
//    int l = 0;
//    int b = 0;
//    double r = 0;
//    int s = 0;
//
//    Shape(String s) {
//        ShapeName = s;
//    }
//
//    Shape(int len, int bre) {
//        l = len;
//        b = bre;
//    }
//
//    Shape(double rad) {
//        r = rad;
//    }
//
//    Shape(int side) {
//        s = side;
//    }
//
//    public double calculateArea() {
//        return 0;
//    }
//
//}
//
//class Rectangle extends Shape {
//
//    public Rectangle(String s) {
//        super(s);
//    }
//
//    public Rectangle(int len, int bre) {
//        super(len, bre);
//
//    }
//
//    public double calculateArea() {
//        double res = 0;
//
//        res = l * b;
//        return res;
//    }
//
//}
//
//class Square extends Shape {
//
//    public Square(String s) {
//        super(s);
//    }
//
//    public Square(int side) {
//        super(side);
//
//    }
//
//    public double calculateArea() {
//        double res = 0;
//
//        res = Math.pow(s, 2);
//        return res;
//    }
//}
//
//class Circle extends Shape {
//
//    public Circle(String s) {
//        super(s);
//    }
//
//    public Circle(double radius) {
//        super(radius);
//
//    }
//
//    public double calculateArea() {
//        double res = 0;
//        res = Math.PI * Math.pow(r, 2);
//        return res;
//    }
//}
//
//public class MainSolution {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = 0;
//        int len = 0;
//        int bre = 0;
//        int s = 0;
//        double r = 0;
//        System.out.println("1. Rectangle\n2. Square\n3. Circle\nArea Calculator --- Choose your Shape");
//        num = Integer.parseInt(sc.nextLine());
//
//        switch (num) {
//            case 1:
//                System.out.println("Enter length and breadth:");
//                len = Integer.parseInt(sc.nextLine());
//                bre = Integer.parseInt(sc.nextLine());
//                Shape obj = new Rectangle(len, bre);
//                obj.ShapeName = obj.getClass().getSimpleName();
//                System.out.print("Area of " + obj.ShapeName + " is:");
//                System.out.printf("%.2f", obj.calculateArea());
//                System.out.println();
//                break;
//            case 2:
//                System.out.println("Enter side:");
//                s = Integer.parseInt(sc.nextLine());
//                Shape obj1 = new Square(s);
//                obj1.ShapeName = obj1.getClass().getSimpleName();
//                System.out.print("Area of " + obj1.ShapeName + " is:");
//                System.out.printf("%.2f", obj1.calculateArea());
//                System.out.println();
//                break;
//            case 3:
//                System.out.println("Enter radius:");
//                r = Double.parseDouble(sc.nextLine());
//                Shape obj2 = new Circle(r);
//                obj2.ShapeName = obj2.getClass().getSimpleName();
//                System.out.print("Area of " + obj2.ShapeName + " is:");
//                System.out.printf("%.2f", obj2.calculateArea());
//                System.out.println();
//                break;
//        }
//    }
//}
