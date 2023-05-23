package Z_Assignments.Assignment3;

import java.util.*;

class Parked_CarOwner_Details{
    String ownerName; String carModel;int carNO;
    int ownerMobileNo; String ownerAddress;
    int floor;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCarNO() {
        return carNO;
    }

    public void setCarNO(int carNO) {
        this.carNO = carNO;
    }

    public int getOwnerMobileNo() {
        return ownerMobileNo;
    }

    public void setOwnerMobileNo(int ownerMobileNo) {
        this.ownerMobileNo = ownerMobileNo;
    }

    public String getOwnerAddress() {
        return ownerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
    
    public Parked_CarOwner_Details(String ownerName, String carModel, int carNO, int ownerMobileNo, String ownerAddress, int floor) {
        this.ownerName = ownerName;
        this.carModel = carModel;
        this.carNO = carNO;
        this.ownerMobileNo = ownerMobileNo;
        this.ownerAddress = ownerAddress;
        this.floor = floor;
    }  

    @Override
    public String toString() {
        return "Parked_CarOwner_Details{" + "ownerName=" + ownerName + ", carModel=" + carModel + ", carNO=" + carNO + ", ownerMobileNo=" + ownerMobileNo + ", ownerAddress=" + ownerAddress + ", floor=" + floor + '}';
    }
    
}

class Parked_CarOwnerList{
    public Parked_CarOwnerList(){}
     
    List<Parked_CarOwner_Details> ls=new ArrayList<>();

   
    public void add_new_car(Parked_CarOwner_Details p){
        ls.add(p);
    }
    public void remove(int carNo){
        int count=0;
        for(int i=0;i<ls.size();i++){
            if(ls.get(i).getCarNO()==carNo){
                ls.remove(ls.get(i));
                count++;
                System.out.println("Car Details removed successfully");
            }
        }
        if(count==0){
            System.out.println("no cars found!");
        }
    }
    public void getParkedLocation(int carNo){
        int count=0;
        for(int i=0;i<ls.size();i++){
            if(ls.get(i).getCarNO()==carNo){
                
                count++;
                System.out.println("OwnerName: "+ls.get(i).getOwnerName()+" Parked floor:"+ls.get(i).getFloor());
            }
        }
        if(count==0){
            System.out.println("no cars found!");
        }
    }
    public void printAll(){
        for(int i=0;i<ls.size();i++){
            System.out.println(ls.get(i).toString());
            }
        }
}
public class Assignment3_Question7 {
    public static int getFloor(){
         int min=1;
    int max=3;
        int floor=(int)Math.floor((Math.random() * (max - min)) + min);
        return floor;
    }
    public static void main(String[] args) {
  
   
  
    Parked_CarOwnerList obj=new Parked_CarOwnerList();
    obj.add_new_car(new Parked_CarOwner_Details("aaa","honda",19201,938278,"vellore",getFloor()));
     obj.add_new_car(new Parked_CarOwner_Details("bbb","audi",28191,982192,"vellore",getFloor()));
      obj.add_new_car(new Parked_CarOwner_Details("ccc","benz",21381,936271,"vellore",getFloor()));
      obj.printAll();
      obj.remove(21381);
      obj.getParkedLocation(19201);
      obj.printAll();  
    }
}
