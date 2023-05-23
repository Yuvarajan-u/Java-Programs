
package Z_Assignments.Assignment2.FacultyPackage;

import java.util.HashMap;

class StudentMarks{
    HashMap<Integer,Integer> hm=new HashMap<>();
   protected void InsertMarks(){
       hm.put(30, 45);
       hm.put(31, 78);
       hm.put(32, 95);
   }
    
}
public class FacultyClass extends StudentMarks{
    private int roll=32;


    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
    
    public void getStudentMarks(int rollno){
        if(rollno==getRoll())
        {
            InsertMarks();
            System.out.println("Marks of roll no "+getRoll()+" is: "+hm.get(rollno));
        }
    }
}
