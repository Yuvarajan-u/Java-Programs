package Multi_Threading;

/*
    By default we have one thread which is main thread from main method

    Thread t1 = new Thread(); it is a object of thread. 

    If one method is executing in one core. we can execute another parallely
    To execute parallely we need to extend it with Thread and starting the
    thread in main method.

    whenever using start() internally it executes a method run() or it calls run
    so if we use run() in the classes we need thread.

    Initially it will not be in order because we are starting both thread at same time
    when it goes for execution it will print but sometime both threads reaching cpu
    at the same time it reaches the scheduler which selects randomly and that executed
    first and remaining executes.

    to avoid this we can use synchonization or make a gap from start itself 
    using sleep in between 2 thread which will make a time different 
    and it will not clash. which is used in line 39. Remove that try catch and
    see difference.

 */

class Hi extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " Hi");
            try {
                Thread.sleep(500);// this is a checked exception we need to handle
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }
}

class Hello extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " Hello");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }
}

public class Thread_Main {

    public static void main(String[] args) {
        Hi ob1 = new Hi();
        Hello ob2 = new Hello();
        
        ob1.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Error: " + e);
        }
        ob2.start();

    }

}

