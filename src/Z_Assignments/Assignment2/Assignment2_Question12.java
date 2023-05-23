package Z_Assignments.Assignment2;
import java.util.*;
enum Status{
    NEW("NEW"), REJECTED("REJECTED"), ACCEPTED("ACCEPTED"), COMPLETED("COMPLETED");
    String name;
  
    Status(String value){
        name=value;

    }
}
class Order{
    int orderid;
    String name;
    int quantity;
    double price;
    int status;

    public Order() {
    }

    public Order(int orderid, String name, int quantity, double price,int status) {
        this.orderid = orderid;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.status=status;
    }
public String getStatus()
{
    Status[] ss=Status.values();
    for(Status st:ss){
        if(status==(st.ordinal()+1)){
            return "Order{" + "orderid=" + orderid + ", name=" + name 
                    + ", quantity=" + quantity 
                    + ", price=" + price 
                    + ", status=" + st.name + '}';
        }
    }
        return null;
}    
}
public class Assignment2_Question12 {

    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
 
   Order obj=new Order(100,"aaa",2,424.5,3);
        System.out.println(obj.getStatus());
   
   }
    
}
