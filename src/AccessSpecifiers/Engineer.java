package AccessSpecifiers;

import AccessSpecifiers.Public.Student;

public class Engineer extends Student {
    public void show(){
        //Marks is protected it can be accessed by sub classes
        
        /*
        It will get from student class and prints directly after printing
        values modifed.
        */
        System.out.println(name+marks);
        
        name="rajan";
        marks=77;
       // age=21; ->it will not work that is the difference between protected and default
       run();
       /*
       This is a private method of same class from other classes 
       we cannot access it but by using it in a public method of same class and
       acessing that method in different package or class can have those items
       */
    }
    private void run(){
        System.out.println("private method"+8);
    }
    
    protected void walk(){
        System.out.println("protected method"+8);
    }
    
}
