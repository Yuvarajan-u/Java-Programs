package Z_Assignments.Assignment3;
/*
aaa
120
80
bbb
98
80
ccc
150
97
*/
import java.util.*;

class Persons{
    String name;
    int height;
    int weight;

    public Persons(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Persons{" + "name=" + getName() + ", height=" + getHeight() + ", weight=" + getWeight() + '}';
    }
}
     
class SortingTreeSet implements Comparator<Persons>{

        @Override
        public int compare(Persons o1, Persons o2) {
            
        if(o1.getWeight()==o2.getWeight()){
            if(o1.getHeight()>o2.getHeight()){
                return 1;
            }
            else{
                return -1;
            }
        }
        else if(o1.getWeight()>o2.getWeight()){
            return 1;
        }
        else{
            return -1;
        }
        }
    
}
public class Assignment3_Question1 {

    public static void main(String[] args) {
       TreeSet<Persons>ts=new TreeSet<>(new SortingTreeSet());
        Scanner sc=new Scanner(System.in);
        String n;int h;int w;
        for(int i=0;i<3;i++){
            n=sc.nextLine();
            h=Integer.parseInt(sc.nextLine());
            w=Integer.parseInt(sc.nextLine());
            ts.add(new Persons(n,h,w));
        }

        for(Persons p:ts){
            System.out.println(p.toString());
        }
    }
    
}
