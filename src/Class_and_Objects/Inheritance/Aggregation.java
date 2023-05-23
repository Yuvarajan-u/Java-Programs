package Class_and_Objects.Inheritance;
/*

Aggregation -> HAS-A relationship type
Consider a situation, Employee object contains many informations such 
as id, name. It contains one more object named address, which contains 
its own informations such as city, state, country, zipcode. as given below.
In such case, Employee has an entity reference address, 
so relationship is Employee HAS-A address.

*/

class Address {

    String city, state, country;
    int pincode;

    public Address(String city, String state, String country, int pincode) {
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }
}

class Worker {

    int id;
    String name;
    Address address;

    public Worker(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println(
                "id: " + id
                + "\nName: " + name
                + "\nAddress: " + address.city
                + ", " + address.state
                + ", " + address.country
                + ", " + address.pincode+".");
    }
}

public class Aggregation {

    public static void main(String[] args) {
        Address a1 = new Address("Vellore", "Tamil Nadu", "India", 632001);
        Worker e1 = new Worker(20, "Yuvarajan", a1);
        e1.display();
    }

}
