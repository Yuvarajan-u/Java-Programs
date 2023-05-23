package Collections_API.Generic;

/*

    This program is used in the scenario like we may have to use any kind of datatypes or 
    pass values to a method. To do this we have to create a method with generic collection 
    <user-defined> name with it by this we can pass any kind of data type through it
    it is more like a common, general datatype we can do work with all datatypes.

*/
class AllDataTypes {

    public <Adt> void printArray(Adt[] inputArray) {
// Display array elements
        for (Adt element : inputArray) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public <cnt> int count(cnt[] array, cnt item) {
        int count = 0;
        for (cnt element : array) {
            System.out.print(element + " ");
            if (item.equals(element)) {
                count++;
            }
        }
        System.out.println("\n");
        return count;

    }
}

public class Generic_AllTypes {

    public static void main(String[] args) {
        AllDataTypes obj = new AllDataTypes();

        String[] s = {"yuva", "rajan", "yuvarajan", "yuvarajan", "yuva"};
        Integer[] i = {1, 2, 3, 4, 5, 9, 8, 6, 78, 3, 5, 4, 2, 3, 3, 5, 6, 7};
        Double[] d = {1.1, 2.2, 3.3, 4.4, 11.1, 1.1, 2.2};
        Character[] c = {'H', 'E', 'L', 'L', 'O', 'H', 'L'};

        System.out.println("Array integerArray contains:");
        obj.printArray(i);

        System.out.println("\nArray doubleArray contains:");
        obj.printArray(d);

        System.out.println("\nArray characterArray contains:");
        obj.printArray(c);

        System.out.println("\nArray StringArray contains:");
        obj.printArray(s);

        System.out.println("\n\nExisting counts: ");

        String s1 = "yuva";

        int count1 = obj.count(s, s1);
        System.out.println("#occurrences of " + s1 + "- " + count1);

        int s2 = 3;

        int count2 = obj.count(i, s2);
        System.out.println("#occurrences of " + s2 + "- " + count2);

        double s3 = 2.2;

        int count3 = obj.count(d, s3);
        System.out.println("#occurrences of " + s3 + "- " + count3);

        char s4 = 'H';

        int count4 = obj.count(c, s4);
        System.out.println("#occurrences of " + s4 + "- " + count4);

    }

}
