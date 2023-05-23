package Multi_Threading;

/*
    If we use anonymous class inside an interface like in object creation we dont need a 
separate class to use it for single use it will reduce no of lines of code.

This is type when we are going to have a one time use single method
 */
public class Anonymous_Class {

    public static void main(String[] args) {
        
        Runnable ob1 = new Runnable() 
        {
            //Anonymous Class
            public void run() {

                for (int i = 1; i <= 5; i++) {
                    System.out.println(i + " Hi");
                    try {Thread.sleep(500);} catch (Exception e) {System.out.println("Error: " + e);}
                }
            }
        };

/*
        This Runnable is a FunctionalInterface so we can use Lambda Expression
        Runnable ob2 = new Runnable() {
        public void run<- up to this code removed and added -> after this() { 
*/
        Runnable ob2 = ()-> 
        {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i + " Hello");
                try {Thread.sleep(500);} catch (Exception e) {System.out.println("Error: " + e);}
            }
        };

        Thread t1 = new Thread(ob1);
        t1.start();
        try {Thread.sleep(100);} catch (InterruptedException e) {System.out.println("Error: " + e);}

        Thread t2 = new Thread(ob2);
        t2.start();
        
        
        //we can directly implement the run method inside the place of Thread constructor
        Thread t3=new Thread(()-> 
        {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i + " how are you?");
                try {Thread.sleep(500);} catch (Exception e) {System.out.println("Error: " + e);}
            }
        });
         try {Thread.sleep(100);} catch (InterruptedException e) {System.out.println("Error: " + e);}
         t3.start();
    }

}
