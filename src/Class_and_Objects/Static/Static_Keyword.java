package Class_and_Objects.Static;

class Employee{
    int eid;
    double salary;
    String ename;
    /*
    Static variable is used because it does not need object to invoke it
    If we are having two employees both are working under one ceo but if ceo changes
    we have to update for all separately. in this case we can use Static so if one time 
    is has been updated it will be reflected to all the objects.
    
    Static will not go into heap memory it will be in class loader memory
    */
    static String ceo;

    public void display(){
        
        System.out.println(eid+" : "+ename+" : "+salary+" : "+ceo);
    }
    
}
public class Static_Keyword {

    public static void main(String[] args) {
        Employee obj = new Employee();
        System.out.println("eid : ename : salary : ceo");
        
        obj.eid=1;
        obj.ename="Ramesh";
        obj.salary=34560.0;
        
        Employee obj2= new Employee();
        obj2.eid=2;
        obj2.ename="Ravi";
        obj2.salary=25000.0;
        
        //Static variable ceo will be shared among all objects
        //No need to use object we can use class name because it is static
        Employee.ceo="Nirmal";
        
        obj.display();
        obj2.display();
    }
    
}
