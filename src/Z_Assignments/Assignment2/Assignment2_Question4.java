package Z_Assignments.Assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Person implements Comparator<Person>, Comparable<Person> {

    String name;
    int age;
    int height;
    int weight;

    Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + '}';
    }

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.weight > o2.weight) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public int compareTo(Person o) {
        if (this.height > o.height) {
            return 1;
        } else {
            return -1;
        }
    }

}

public class Assignment2_Question4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Person> persons = new ArrayList<>();
        String name;
        int age;
        int height;
        int weight;

        for (int i = 0; i < 2; i++) {
            name = sc.nextLine();
            age = Integer.parseInt(sc.nextLine());
            height = Integer.parseInt(sc.nextLine());
            weight = Integer.parseInt(sc.nextLine());
            persons.add(new Person(name, age, height, weight));
        }
        Comparator<Person> c1 = new Person();
        Collections.sort(persons, c1);
        System.out.println("\nUsing Comparator Interface for sorting Weight Wise");
        for (Person obj : persons) {
            System.out.println(obj.toString());
        }
        
        Collections.sort(persons);
        System.out.println("\nUsing Comparable Interface for sorting Height Wise");
        for (Person obj : persons) {
            System.out.println(obj.toString());
        }
    }
}
