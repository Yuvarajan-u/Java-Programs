package String_Operations;

import java.util.Scanner;

class ContainsMethod {

    void find() {
        Scanner sc = new Scanner(System.in);
        String s1 = "Yuvarajan";
        String pattern;
        System.out.println("Enter pattern to Search");
        pattern = sc.nextLine();

        boolean result = s1.contains(pattern);
        if (result == true) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
    }
}

class ManualMethod {

    void find() {
        Scanner sc = new Scanner(System.in);
        String s1 = "Yuvarajan";
        String pattern;
        System.out.println("Enter pattern to Search");
        pattern = sc.nextLine();

        int count = 0;
        int tlen = s1.length();
        int plen = pattern.length();
        char c, p;

        for (int i = 0; i <= tlen - plen; i++) {
            c = s1.charAt(i);
            p = pattern.charAt(0);

            if (c == p) {
                for (int j = i, k = 0; j < i + plen; j++, k++) {
                    c = s1.charAt(j);
                    p = pattern.charAt(k);
                    if (c == p) {
                        count++;
                    }
                }
            }
        }
        if (count == plen) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
    }
}

public class String_Contains {

    public static void main(String[] args) {
        ManualMethod ob1 = new ManualMethod();
        ob1.find();
    }
}
