package Basics.Operators;

/*

and table & 
only it is 1 and 1 will be 1 anything else will be 0.

or table |
only if 0 and 0 it will be 0 anything else will be 1.

xor table ^ caret symbol
when it is 0 and 0 , 1 and 1 will be 0 anything else will be 1.


 */
public class Bitwise_Operators {

    public static void main(String[] args) {
                         //16 8 4 2 1
        int x = 25;  //25-> 1 1 0 0 1
        int y = 15; //15-> 0 1 1 1 1
                    //-> 0 1 0 0 1 -> gives 9
        System.out.println("AND: 25 & 15 = " + (x & y));

        //or 
        //25-> 1 1 0 0 1
        //15-> 0 1 1 1 1
        //-> 1 1 1 1 1 -> gives 31
        System.out.println("OR: 25 | 15 = " + (x | y));

        //to find odd or even using bitwise
        if ((x ^ 1) == x + 1) {
            //xor
            //6 -> 0 0 1 1 0
            //1 -> 0 0 0 0 1
            // -> 0 0 1 1 1 -> 4+2+1 =7 and 6+1 =7 so it prints it is even
            System.out.println("even" + (x ^ 1) + " " + (x + 1));
        } else {
            System.out.println("odd" + (x ^ 1) + " " + (x + 1));
        }
    }

}
