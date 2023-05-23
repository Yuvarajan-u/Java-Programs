package AccessSpecifiers.Private;

public class StudentPrivate {
    //private variable -> is not accessible to anyone
    private String name="yuva";
    
   
    public void set(String Name){
        Name = name;
    }
    public String get(){
        return name;
    }
}
