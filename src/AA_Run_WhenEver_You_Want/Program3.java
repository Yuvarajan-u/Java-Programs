package AA_Run_WhenEver_You_Want;

import java.util.Scanner;

class SimpleInterest {

    int principle = 0;
    int rate = 10;
    int time = 2;

    public void CalculateSI(int p) {
        int res = p * rate * time / 100;
        System.out.println("Simple Interest: " + res);
    }

    public void CalculateSI(int p, int t) {
        int res = p * rate * t / 100;
        System.out.println("Simple Interest: " + res);
    }

    public void CalculateSI(int p, int t, int r) {
        int res = p * r * t / 100;
        System.out.println("Simple Interest: " + res);
    }
}

public class Program3 {

    public static void main(String[] args) {
        SimpleInterest obj = new SimpleInterest();
        Scanner sc = new Scanner(System.in);
        int principle = Integer.parseInt(sc.nextLine());
        int rate = Integer.parseInt(sc.nextLine());
        int time = Integer.parseInt(sc.nextLine());
        obj.CalculateSI(principle);
        obj.CalculateSI(principle, time);
        obj.CalculateSI(principle, rate, time);
    }

}
