package AccessSpecifiers;

import AccessSpecifiers.Public.Student;
//Actually in JAVA we dont have access specifiers we have access modifiers..

//Final, Abstract, Public, Private, Protected and Default

//We cannot have private or protected class but in inner class we can use private

class AE extends Engineer{
    
    public void show1(){
        //Engineer class : show method
        
        show();
        /*
        name and mark are protected variables of students and student is
        extends by engineer now im extending engineer here
        in engineer class i overrided name & marks so it gives values presented in 
        engineer class for second time
        */
        System.out.println(name+marks);
        walk();
    }
    
}
public class Access_Main {

    public static void main(String[] args) {
        Student obj = new Student();
        obj.i=8;
        //obj j=10; it is not public so it cannot be accessible
        
        AE a = new AE();
        a.show1();
    }
    
}
