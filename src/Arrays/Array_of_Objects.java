package Arrays;

import java.util.Scanner;

class Student {

    private int rollno;
    private String name;
    private int mark;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public Student(int rollno, String name, int mark) {

        this.rollno = rollno;
        this.name = name;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" + "rollno=" + rollno + ", name=" + name + ", mark=" + mark + '}';
    }

}

public class Array_of_Objects {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] arr = new Student[2];
        int r;
        String n;
        int m;

        for (int i = 0; i < arr.length; i++) {
            r = Integer.parseInt(sc.nextLine());
            n = sc.nextLine();
            m = Integer.parseInt(sc.nextLine());
            arr[i] = new Student(r, n, m);
        }
        
        for (Student s : arr) {
            System.out.println(s);
        }
/*
        Student obj = new Student(1,"yuva",290);
        obj.setMark(156);
        System.out.println(obj);
*/
    }

}
