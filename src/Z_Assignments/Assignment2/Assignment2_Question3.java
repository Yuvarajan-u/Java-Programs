package Z_Assignments.Assignment2;

import java.util.Arrays;

class ShallowCopyArray{
    private int[] date_of_birth;

    public ShallowCopyArray(int[] values) {
        date_of_birth = values;
    }
  
    public void showData() {
        System.out.println( Arrays.toString(date_of_birth) );
    }    
}
class DeepCopyArray implements Cloneable{
    private int[] date_of_birth;

    public DeepCopyArray(int[] values) {
        date_of_birth = new int[values.length];
        for (int i = 0; i < date_of_birth.length; i++) {
            date_of_birth[i] = values[i];
        }
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public void showData() {
        System.out.println(Arrays.toString(date_of_birth));
    }
}

public class Assignment2_Question3 {

    public static void main(String[] args) throws CloneNotSupportedException {
        int [] values={1,3,5};
        System.out.println("Shallow Copy: ");
        ShallowCopyArray obj = new ShallowCopyArray(values);
        obj.showData();
        values[1]=8;
        obj.showData();
        System.out.println("\nDeep Copy: ");
       DeepCopyArray obj1 =new DeepCopyArray(values);
       DeepCopyArray obj2=(DeepCopyArray)obj1.clone();
       
       obj2.showData();
       values[2]=74;
       obj2.showData();
        
    }    
}
