package Z_Assignments.Assignment2;

import java.util.*;
import java.sql.*;

class Information{
    Map<Integer,String>hm=new HashMap<>();
    Scanner sc=new Scanner(System.in);
   
    class Cache{
        private List<Timestamp> ls =new ArrayList<>();
        void getInput(){
        Timestamp ts1 = Timestamp.valueOf("2018-09-01 09:01:15");  
        hm.put(1,"amazon data");
        ls.add(ts1);
        hm.put(2, "Apple data");
        Timestamp ts2 = Timestamp.valueOf("2019-07-31 12:11:45");
        ls.add(ts2);
    }    
        void print(){
            for(int i=0;i<hm.size();i++){
                System.out.println("key: "+(i+1)+", value: "+hm.get(i+1)+", private timeStamp "+ls.get(i));
                
            }
        }   
    }
}
public class Assignment2_Question13 {

    public static void main(String[] args) {
        Information obj1=new Information();
        Information.Cache obj2= obj1.new Cache();
        obj2.getInput();
        obj2.print();     
    }  
}
