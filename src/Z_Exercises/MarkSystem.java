package Z_Exercises;

import java.util.Scanner;
/*
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
*/
public class MarkSystem {

    static String GetInput() {
        Scanner sc = new Scanner(System.in);
        int size=3;
        Student[] arr = new Student[size];
        int[] rolls = new int[size];
        String[] names = new String[size];
        int[] marks = new int[size];
        int r;
        String n;
        int m;
        int ids = 0;
        for (int i = 0; i < size; i++) {
            System.out.println(i+")Enter Student rollno: ");
            r = Integer.parseInt(sc.nextLine());
            System.out.println(i+")Enter Student name: ");
            n = sc.nextLine();
            System.out.println(i+")Enter Student mark: ");
            m = Integer.parseInt(sc.nextLine());
            arr[i] = new Student(r, n, m);
            rolls[i] = r;
            names[i] = n;
            marks[i] = m;

        }
        
        int first = marks[0];
        int second = 0;
        for (int i = 0; i < size; i++) {

            //to find second largest mark
            if (marks[i] > first) {
                second = first;
                first = marks[i];
            } else if (marks[i] > second && marks[i] != first) {
                second = marks[i];
            }
        }
        //to get name of second largest
        for (int i = 0; i < size; i++) {
            if (marks[i] == second) {
                ids = i;
            }
        }

        String answer = String.valueOf(names[ids]);

        return answer;
    }

    public static void main(String[] args) {
        System.out.println("Second Largest Mark in Class: Name: "+MarkSystem.GetInput());
         
    }

}
