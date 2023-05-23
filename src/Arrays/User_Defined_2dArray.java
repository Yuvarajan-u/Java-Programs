package Arrays;

import java.util.Scanner;

public class User_Defined_2dArray {

    public static void main(String[] args) {
        int n, m;

        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter no of rows: ");
        n = Integer.parseInt(sc.nextLine());
        System.out.print("Enter no of cols: ");
        m = Integer.parseInt(sc.nextLine());
        int arr2d[][] = new int[n][m];

        System.out.println("\nEnter Elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr2d[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println("Printing 2d Array: \n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr2d[i][j]);
            }
            System.out.println();
        }

    }

}
