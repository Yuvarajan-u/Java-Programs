package Z_Assignments.Assignment3;

import java.util.*;
class ChangeBehaviour extends HashMap{
    @Override
    public boolean equals(Object anObject) {
        return true;
    }
    
    
    public int hashCode() {
    
    return 12345;
    }
    
    
    void DoThings(){
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1,"aaa");
        hm.put(2, "bbb");
       
        System.out.println();
        hm.hashCode();
            
        }
}
public class Assignment3_Question5 {

    public static void main(String[] args) {
       ChangeBehaviour obj =new ChangeBehaviour();
       obj.DoThings();
    }
    
}
