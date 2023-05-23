package Z_Assignments.Assignment2;

import java.util.Arrays;

interface Sortable{public void sort();   }
class Employee1 implements Sortable{
    int []emparr={5,3,2,6,1,4};
    @Override
    public void sort() {}
}
class Circle1 extends Employee1 implements Sortable{
    int []circlearr={10,15,23,78,35,25};
    @Override
    public void sort() {}
    public void sortAll(){
        int [] newarr=new int[circlearr.length*2];
        int pos=0;
        for(int ele:emparr){
            newarr[pos]=ele;
            pos++;
        }
        for(int ele:circlearr){
            newarr[pos]=ele;
            pos++;
        }
        Arrays.sort(newarr);
        for(int ele:newarr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }  
}
public class Assignment2_Question2 {

    public static void main(String[] args) {
        Circle1 obj2=new Circle1();
        obj2.sortAll();
    }  
}
