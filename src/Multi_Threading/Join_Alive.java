package Multi_Threading;

/*
Join:
    however many threading we are creating by default we have a main thread.
    If anything have to be done by main thread it will does it work at the sleep 
time between t1 and t2. To solve this we need to ask main thread just wait to complete
their job then do your job.
To do this we are using threadobject.join();

        t1 main t2
        |    |   | 
        |____|___|
        |        |
        |________|
       job   |   job   
       done  |   done 
             |
    main thread will execute

Join also may need to throw an exception specifically checked exception called interupted exception
so throw it with main method.

    isAlive() method:
        
        This is the method used to check whether the thread is in running state or not
is we are trying to print this it will return boolean value

    threadobject.isAlive();
*/

class Hi1 extends Thread {

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

class Hello1 extends Thread {

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

public class Join_Alive {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("\nStart\n");
        
        Hi1 ob1 = new Hi1();
        Hello1 ob2 = new Hello1();
        
        ob1.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Error: " + e);
        }
        ob2.start();
        
        System.out.println("Thread 1 is Alive: "+ob1.isAlive()+"\nThread 2 is Alive "+ob2.isAlive());
        
        ob1.join();
        ob2.join();
        
        //This is give false because at this point t1 and t2 will complete their work
        System.out.println("Thread 1 is Alive: "+ob1.isAlive()+"\nThread 2 is Alive "+ob2.isAlive());
        //Bacause of join() Bye prints atlast
        System.out.println("\nEnd\n");
    }
    
}
