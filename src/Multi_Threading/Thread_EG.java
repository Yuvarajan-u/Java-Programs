package Multi_Threading;
/*
    Multi threading using Thread Class run() method
    Every thread needs a method called run
    To achieve thread we need to extend it
    
    To call this run we need to call it as start(); 
    
    run() will call a method to call a new thread because main is a 
    thread already there, if we call start(); it will create a new thread
    and it will call run();
    we are having methods like sleep which is mentioned in milli seconds 
    for 2 seconds = 2000 milli secs
    
*/

class MyThread1 extends Thread{
    
    int[] arr = {1, 2, 3, 4, 5};
    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            arr[i] = arr[i] * 2;
        }
        for (int i = 0; i < 5; i++) {
           System.out.println(arr[i]);
           try {
                Thread.sleep(500);// this is a checked exception we need to handle
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
           
        }        
    }
}

class MyThread11 extends Thread{
    
    int[] arr = {1, 2, 3, 4, 5};
    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            arr[i] = arr[i] * 2;
        }
        for (int i = 0; i < 5; i++) {
           System.out.println(arr[i]);
           try {
                Thread.sleep(500);// this is a checked exception we need to handle
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
           
        }        
    }
}

public class Thread_EG {

    public static void main(String[] args) { //by default it is a thread main()
        MyThread1 ob1 = new MyThread1();
        ob1.start();
        try {
                Thread.sleep(50);// this is a checked exception we need to handle
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        
        MyThread11 ob2 = new MyThread11();
        ob2.start();
    }

}
