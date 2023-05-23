package AA_Run_WhenEver_You_Want;

import java.util.Scanner;

public class InputUntilQ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        boolean a=true;
        while (a) {
            String n = " ";
            n = sc.nextLine();
            if (n.equals("q")) {
                a=false;
            } else {
                count++;
                sum += Integer.valueOf(n);
            }
        }
        int avg = sum / count;
        System.out.println(avg);

    }

}
