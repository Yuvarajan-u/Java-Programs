package AA_Run_WhenEver_You_Want;

class Student {

    String n = "";

    Student() {

    }

    Student(String name) {
        n = name;
    }

    void checkName() {
        if (n == "") {
            System.out.println("Unknown");
        } else {
            System.out.println(n);
        }
    }
}

public class Program1 {

    public static void main(String[] args) {
        Student obj1 = new Student("yaga");
        obj1.checkName();
        Student obj2 = new Student();
        obj2.checkName();
    }

}
