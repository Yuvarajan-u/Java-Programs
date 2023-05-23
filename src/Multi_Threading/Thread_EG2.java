package Multi_Threading;

/*
        2nd way of Creating a Thread is called 'Runnable' interface. 

        it is a functional interface which has only one method and we can use lambda expression
        Advantage of this is we can extends The class which needs a thread with its super
        class since java doesnt support multiple inheritance we can implement Runnable 
        interface for the thread. 
        it also have method called run();

        In Runnable interface we dont have start to create a thread To solve it
        We can create (thread object) Thread obj = new Thread(); and we can start 
        with the object. It will call run method of thread
        not our class run() method so we can link the object of class to thread

        Thread() constructor also asking for object of Runnable.
        Like Thread t = new Thread(object1);
 */
class A {

    int[] arr = {1, 2, 3, 4, 5};
}

class MyThread2 extends A implements Runnable {

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

class MyThread3 extends A implements Runnable {

    @Override
    public void run() {
        
        for (int i = 0; i < 5; i++) {
            arr[i] = arr[i] * 3;
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

public class Thread_EG2 {

    public static void main(String[] args) {

        Runnable ob1 = new MyThread2();
        Thread t1 = new Thread(ob1);
        t1.start();
        try {
            Thread.sleep(100);// this is a checked exception we need to handle
        } catch (InterruptedException e) {
            System.out.println("Error: " + e);
        }

        Runnable ob2 = new MyThread3();
        Thread t2 = new Thread(ob2);
        t2.start();
    }

}
