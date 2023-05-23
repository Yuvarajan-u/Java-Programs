package Basics;
public class DataTypes 
{
    public static void main(String[] args) 
    {
        System.out.println("Data Type,  Keyword,    Size(bit),  Size(byte)");
        System.out.println("character,  char,       16(bit),    2(byte)");
        System.out.println("byte,       byte,       8(bit),     1(byte)");
        System.out.println("short,      short,      16(bit),    2(byte)");
        System.out.println("integer,    int,        32(bit),    4(byte)");
        System.out.println("long,       long,       64(bit),    8(byte)");
        System.out.println("float,      float,      32(bit),    4(byte)");
        System.out.println("double,     double,     64(bit),    8(byte)");        
        System.out.println("boolean,    boolean,    NIL(bit),   NIL(byte)");
        
        byte b=1; //-128 to 127
        short s=5; // -32,768 to 32767
        int i=5; // -2,147,483,648 to 2,147,483,647
        long l=5l; // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        
        
        float f=5.5f; //Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        double d=5.6; //Stores fractional numbers. Sufficient for storing 15 decimal digits
        
        boolean bool = true; // Store true or false
        char c ='A'; //Stores a single character/letter or ASCII values
        
        String str ="Hello JAVA";// Stores sequence of Characters
        
        //A-65 to Z-90
        //a-97 to z-122
        //0-48 to 9-57
        
        double i1= 5; // implicit conversion 5 converts to 5.0
        
        int fl=(int)5.6; // type casting decimal to int gives 5 as output
        
        
    }   
}
