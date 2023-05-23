package Multi_Threading;

/*
t1  and t2 running in parallel sometimes it takes same value for eg count = 50
both take 50 an increment by 1 to 51 so sometimes we will not get expected result

t1 should run for 100 times t2 should run for 100 times but somewhere above scenario happens
so to solve this

while t1 is executing count t2 should not interfer this as same as for t1 

so we are using a keyword called synchronized in method we are using
so t1 is working then t2 has to wait until it frees count

Without sync multiple threads can access methods in same time it is not thread safe
by using synchronized only one can use and execute
 */
class Counter {

    int count;

    public synchronized void increment() {
        {
            count++;
        }
    }
}

public class Synchronized_Keyword {

    public static void main(String[] args) throws Exception {

        Counter ob = new Counter();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    ob.increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() 
        {
            @Override
            public void run() 
            {
                for (int i = 1; i <= 100; i++) 
                {
                    ob.increment();
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();//We are asking main thread to wait to complete t1 work
        t2.join();
        System.out.println("Count: " + ob.count);
    }

}
