package Multi_Threading;
/*

Thread name:
        To set Thread name we can do like

        Thread t1 = new Thread(Runnable object,"ThreadName");
*/
public class Thread_Methods {

    public static void main(String[] args) throws Exception{
        
        Thread t1=new Thread(()-> 
        {
            for (int i = 1; i <= 5; i++) {   //current thread refers to current thread works like obj name
                System.out.println(i + " Hello! "+Thread.currentThread().getPriority());
                
                try {Thread.sleep(500);} catch (Exception e) {System.out.println("Error: " + e);}
            }
        });
        try {Thread.sleep(100);} catch (InterruptedException e) {System.out.println("Error: " + e);}
 
        
        
       System.out.println("SetMethod: \n");
       
       t1.setName("Hello Thread");
       t1.setPriority(1); // or t1.setPriority(Thread.MIN_PRIORITY); //1 is least
       System.out.println("Priority: "+t1.getPriority());
       t1.setPriority(5); // or t1.setPriority(Thread.NORM_PRIORITY);
       System.out.println("Priority: "+t1.getPriority());
       t1.setPriority(10); // or t1.setPriority(Thread.MAX_PRIORITY); //10 is highest
       
        
        System.out.println("GetMethod: \n");
         
        System.out.println("ID: "+t1.getId());
        System.out.println("Name: "+t1.getName());
        System.out.println("Class: "+t1.getClass());
        System.out.println("Priority: "+t1.getPriority());
        System.out.println("State: "+t1.getState());
        System.out.println("StackTrace: "+t1.getStackTrace());
        System.out.println("ThreadGroup: "+t1.getThreadGroup());
        System.out.println("ClassLoader: "+t1.getContextClassLoader());
         
        t1.start();
        
        System.out.println("IsAlive: "+t1.isAlive());
        System.out.println("State: "+t1.getState());
        
        try {Thread.sleep(100);} catch (InterruptedException e) {System.out.println("Error: " + e);}
        
        System.out.println("State: "+t1.getState());
         
        t1.join();
         
        /*
        t1.stop(); is the method used to stop thread but it is not required in java
        because in java thread will be stopped automatically..
        */
        
        System.out.println("State: "+t1.getState());
        System.out.println("IsAlive: "+t1.isAlive());
         
    }
    
}
