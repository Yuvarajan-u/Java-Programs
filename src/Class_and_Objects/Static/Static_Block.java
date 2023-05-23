package Class_and_Objects.Static;

class StaticBlock{
    
    int eid;
    double salary;
    String ename;
    static String ceo;
    
    //Constructor
    StaticBlock(){
        System.out.println("Default Constructor");
        eid=1;
        salary=25000.50;
        ename="Rajan";
    }
    //Method
    public  void Display(){
       System.out.println(eid+" : "+ename+" : "+salary+" : "+ceo);
    }
    
    
    
    //Static Block -> it will be executed only once and static block will get executed first
    //if there are many static blocks in same program then it will follow sequence
    
    static{
        System.out.println("Static Block");
        ceo="Nirmal";
    }

}
public class Static_Block {
    //Static variables can be used inside main method 
    static int io;
    
    public static void main(String[] args) {
        io=10;
        
       StaticBlock obj =new StaticBlock();
       System.out.println("eid : ename : salary : ceo"+io);
       obj.Display();
       obj.Display();
       
    }
    
}
