package Z_Exercises;

import java.util.Scanner;

class Student {

    private int rollno;
    private String name;
    private int mark;

    public Student(int rollno, String name, int mark) {

        this.rollno = rollno;
        this.name = name;
        this.mark = mark;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }

}

public class Solution_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 3;
        Student[] arr = new Student[size];
        for(int i = 0; i < size; i++){
            int rollno = Integer.parseInt(sc.nextLine());
            String name = sc.nextLine();
            int mark = Integer.parseInt(sc.nextLine());
            
            arr[i] = new Student(rollno, name, mark);
        }
        int answer =getSecondLargest(arr);
        
        System.out.println("Second Largest Roll Number: "+answer);
    }
    public static int getSecondLargest(Student [] s){
    int ss=0;
    int first = s[0].getMark();
        int second = 0;
        for (int i = 0; i < s.length; i++) {

            //to find second largest mark
            if (s[i].getMark() > first) {
                second = first;
                first = s[i].getMark();
            } else if (s[i].getMark() > second && s[i].getMark() != first) {
                second = s[i].getMark();
            }
        }
        //to get rollno of second largest
        for (int i = 0; i < s.length; i++) {
            if (s[i].getMark() == second) {
                ss = i;
            }
        }

        int answer = s[ss].getRollno();

    return answer;
    
    }
}
