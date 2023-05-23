package Class_and_Objects.Encapsulation;

//Encapsulation -> Binding the data(variables or data members) with methods
/*
Use of encapsulation is to make sure the data is safe 
*/
class EncapA {

    //Variables should be private to do encapsulation
    // to Access Private variables getter setter methods are used
    private int rollno;
    private String name;
    public int count =0;// used to get record of how many times set method used
    public void setRollno(int r) {
        rollno = r;
        count++;
        
    }
    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   
    public void getCount(){
        System.out.println("Count: "+count);
    }
}

public class Getter_Setter {

    public static void main(String[] args) {
        EncapA obj = new EncapA();
        //obj.rollno;-> private inaccessible error
        obj.setRollno(20);
        obj.setName("Yuvaraj");
        System.out.println("Name: " + obj.getName() + " Roll no: " + obj.getRollno());
        obj.setRollno(21);
        obj.getCount();
    }

}
