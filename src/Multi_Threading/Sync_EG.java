package Multi_Threading;

public class Sync_EG extends Thread {

    static Object ob = new Object();
    int n = 1;
    int m = 11;

    @Override
    public void run() {

        for (int i = 1; i <= 3; i++) {
            synchronized (ob) {//Synchronized Block

                System.out.println(n);
                n++;
            }
        }

    }

    public static void main(String[] args) {

        Thread ob2 = new Sync_EG();
        ob2.start();
        Thread ob3 = new Sync_EG();
        ob3.start();
    }

}
