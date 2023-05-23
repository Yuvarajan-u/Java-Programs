package String_Operations.String_VS_StringBuffer;

public class TimeTest {

    static String concatS() {

        String t = "Hello";
        for (int i = 0; i < 10000; i++) {
            t = t + "World";
        }
        return t;

    }

    static String concatSBuffer() {

        StringBuffer t = new StringBuffer("Hello");
        for (int i = 0; i < 10000; i++) {
            t.append("World");
        }
        return t.toString();

    }

    public static void main(String[] args) {
        long stime = System.currentTimeMillis();
        concatS();
        
        System.out.println("Time taken in String " + (System.currentTimeMillis() - stime) + "ms");
        long sbtime = System.currentTimeMillis();
        concatSBuffer();
        System.out.println("Time taken in StringBuffer " + (System.currentTimeMillis() - sbtime) + "ms");
    }

}
