package Z_Assignments.Assignment1;
import java.util.*;

abstract class DessertItem{
    abstract void getCost(int n);
    void addItems(int n){
        
    }
}
class Candy extends DessertItem{
    int candycount=10;
    int value=60;
    @Override
    void getCost(int n){
        int total=n*value;
        System.out.println("Cost of Candies: "+total);
    }
    void addItems(int c){
        candycount+=c;
        System.out.println("Available candies count: "+candycount);
    }
}
class Cookie extends DessertItem{
    int cookiecount=10;
    int value=70;
    @Override
    void getCost(int n){
        int total=n*value;
        System.out.println("Cost of Cookies: "+total);
    }
    void addItems(int c){
        cookiecount+=c;
        System.out.println("Avaiable cookies count: "+cookiecount);
    }
}
class Icecream extends DessertItem{
    int icecreamcount=10;
    int value=1;
    @Override
    void getCost(int n){
        int total=n*value;
        System.out.println("Cost of Icecreams: "+total);
    }
    void addItems(int c){
        icecreamcount+=c;
        System.out.println("Available icecream count: "+icecreamcount);
    }
}

public class Assignment1_Question13 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
       lp: while(true){
           System.out.println("Choose your role: \n1.Owner\n2.Customer\n3.exit");
        int role=sc.nextInt();
        sc.nextLine();
        int n;
            switch(role){
                case 1:
                    int k;
                    System.out.println("Which item you need to add: \n1.Candy\n2.Cookie\n3.Icecream");
                    k=sc.nextInt();sc.nextLine();
                    switch(k){
                        case 1:
                            DessertItem obj1=new Candy();
                            System.out.println("Enter number of Candies to add");
                            n=sc.nextInt();sc.nextLine();
                            obj1.addItems(n);
                            break;
                        case 2:
                            DessertItem obj2=new Cookie();
                            System.out.println("Enter number of Cookies to add");
                            n=sc.nextInt();sc.nextLine();
                            obj2.addItems(n);
                            break;
                        case 3:
                            DessertItem obj3=new Icecream();
                            System.out.println("Enter number of Icecreams to add");
                            n=sc.nextInt();sc.nextLine();
                            obj3.addItems(n);
                            break;
                    }
                    break;
                case 2:
                    DessertItem obj1=new Candy();
                    System.out.println("Enter number of Candies to purchase");
                    n=sc.nextInt();sc.nextLine();
                    obj1.getCost(n);
                    DessertItem obj2=new Cookie();
                    System.out.println("Enter number of Cookies to purchase");
                    n=sc.nextInt();sc.nextLine();
                    obj2.getCost(n);
                    DessertItem obj3=new Icecream();
                    System.out.println("Enter number of Icecreams to purchase");
                    n=sc.nextInt();sc.nextLine();
                    obj3.getCost(n);
                    break;
                case 3:
                   break lp;   
            }
        }
    } 
}
