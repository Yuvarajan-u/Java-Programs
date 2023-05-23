package AccessSpecifiers.Protected;
/*
protected access level is within package
*/
public class ProtectedMain {

    public static void main(String[] args) {
       StudentProtected obj = new StudentProtected();
       
       //StudentProtected is a class which is in the same package named protected so
       //variable name is accessible..
       obj.name="rajan";
    }
    
}
