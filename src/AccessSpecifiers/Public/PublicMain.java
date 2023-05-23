
package AccessSpecifiers.Public;

public class PublicMain {

    public static void main(String[] args) {
        Student obj = new Student();
        
        //this j belongs to same package this is default access specifier which is
        // package private
        
        obj.j=10;   //default but with same package
        obj.i=10;   //public
      
        
        
        //private
        
       /*
        obj.name="yuvarajan"; 
        it will not work because it is private even in same package it will not work
        
        */           

        //Protected
        
        /*
        StudentProtected obj1 = new StudentProtected(); 
        obj1.name="rajan";

        This will not work here because public main class is in package public
        protected items only accessible within its package.
        */
    }
    
}
