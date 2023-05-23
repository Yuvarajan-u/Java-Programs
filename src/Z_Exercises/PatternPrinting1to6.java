package Z_Exercises;
public class PatternPrinting1to6 {
    public static void main(String[] args) {
        int row = 6;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
}
