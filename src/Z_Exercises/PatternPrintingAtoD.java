package Z_Exercises;
public class PatternPrintingAtoD {
    public static void main(String[] args) {
                int row = 68; // A->65 and D->68
        for (int i = 65; i <= row; i++) {
            for (int j = 65; j <= i; j++) {
                System.out.print((char)j + " ");// converted int to char using (char)
            }
            System.out.println();
        }
    }
    
}
