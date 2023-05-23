package Z_Assignments.Assignment2;

public class Assignment2_Question7 {

    public static void main(String[] args) {
        String s1="A";
        String s2= "A";
        String s3 = new String("A");
        
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s2));
        //false(because s3 refers to instance created in nonpool)
        System.out.println(s1==s3);
        //true (because both refer to same instance) 
        System.out.println(s1==s2);
    }   
}
