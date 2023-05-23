package Class_and_Objects.Inheritance.Super;

class VarA{
    int empid,age;
    String name,address;
    double salary;
    String ceo="Ravi";
    String desig;
    
    VarA(int e, int a, String n, String add, double s){
        empid=e;
        age=a;
        name=n;
        address=add;
        salary=s;
    }
    
  
}

class VarB extends VarA{
    //super Variable
    String desig1 = super.desig;
    String ceo1 = super.ceo;
    
    public VarB(int e, int a, String n, String add, double s) {
        /* it will be used if VarA doesnt have param constructor
        empid=e;
        age=a;
        name=n;
        address=add;
        salary=s;
        */
        super(e,a,n,add,s);
        
    }
    void setDesignation(){
        
        if(salary>=50000){
            desig1= "Dev";
        }
        else{
            desig1="Tester";
        }
    }
    void display(){
        
        System.out.println("\nName: "+name+"\nEmpid: "+empid+"\nAge: "
                +age+"\nAddress:"+address+"\nDesignation: "+desig1+"\n\nCEO: "+ceo1);
    }
    
    
}
public class SuperVariable {

    public static void main(String[] args) {
        VarB obj = new VarB(1,21,"yuva","Vellore",51000.0);
        obj.setDesignation();
        obj.display();
    }
    
}
