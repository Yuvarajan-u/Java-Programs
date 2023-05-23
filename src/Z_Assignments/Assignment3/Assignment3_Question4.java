package Z_Assignments.Assignment3;

import java.util.*;

class DoB {

    int date;
    int month;
    int year;

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public DoB(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

}

public class Assignment3_Question4 {

    public static void getResults(int d, int m, HashMap<DoB, String> hm) {

        Set<DoB> hs = hm.keySet();

        for (DoB ss : hs) {
            if ((ss.getDate() == d) && (ss.getMonth() == m)) {
                System.out.println(ss.getDate() + "/" + ss.getMonth() + "/" 
                        + ss.getYear()+" name: "+hm.get(ss));
            }
        }
    }

    public static void main(String[] args) {
        HashMap<DoB, String> hm = new HashMap<>();
        hm.put(new DoB(1, 3, 2000), "aaa");
        hm.put(new DoB(1, 3, 2001), "bbb");
        hm.put(new DoB(4, 4, 2002), "ccc");
        hm.put(new DoB(7, 8, 2000), "ddd");
        hm.put(new DoB(10, 5, 2000), "eee");

        int date = 1;
        int month = 3;

        getResults(date, month, hm);

    }

}
