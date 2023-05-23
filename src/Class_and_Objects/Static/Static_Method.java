package Class_and_Objects.Static;

class StaticMethod{
    
    int eid;
    double salary;
    String ename;
    static String ceo="Ravi";
    
    static void change(){
        ceo="Nirmalrajan";
    }
    //Constructor
    StaticMethod(int e,double s,String en){
        System.out.println("Default Constructor");
        eid=e;
        salary=s;
        ename=en;
    }
    
    //Method
    public  void Display(){
       System.out.println(eid+" : "+ename+" : "+salary+" : "+ceo);
    }
}
public class Static_Method {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Calling Static Method with class name
        StaticMethod.change();
        
        StaticMethod obj = new StaticMethod(1,250.00,"Rajan");
        obj.Display();
    }
    
}
