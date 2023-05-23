package Z_Assignments.Assignment2;

interface BloodPressureListener{
    void Alert(int r);
}
class A {
    BloodPressureListener bpsl;
     int random;
    int min=60;
    int max=200;
    
    public void registerListener(BloodPressureListener bpsl){
        this.bpsl=bpsl;
    }
    
    public void startListener(){
  
        random=(int)Math.floor(Math.random()*(max-min+1)+min);
        if(this.bpsl!=null){
            
            bpsl.Alert(random);
        }
    }
}
class Hospital implements BloodPressureListener{

    @Override
    public void Alert(int r) {
        if(r>140){
             System.out.println("Alert! Blood Pressure is High: "+r);
        }
        else{
            System.out.println("Blood Pressure is Normal! "+r);
        }     
    }   
}

public class Assignment2_Question14 {

    public static void main(String[] args) {
        A obj =new A();
        BloodPressureListener obj1=new Hospital();
        obj.registerListener(obj1);
        obj.startListener();
    }  
}
