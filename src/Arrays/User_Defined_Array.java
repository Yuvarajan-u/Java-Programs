package Arrays;

import java.util.Scanner;
//1d array

public class User_Defined_Array {

    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Elements: ");
        n = Integer.parseInt(sc.nextLine());
        int[] arr1 = new int[n];

        System.out.println("\nEnter Elements: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("1dArray: \n");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }

}
