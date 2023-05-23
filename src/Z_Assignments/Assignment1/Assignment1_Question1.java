package Z_Assignments.Assignment1;
import java.util.Scanner;

class Date{
    int day1;int month1;int year1;
    int day2;int month2;int year2;
    String date1="";String date2="";

    Scanner sc=new Scanner(System.in);
    Date(){
       System.out.println("Enter Day, month1, year1: ");
       day1=Integer.parseInt(sc.nextLine());
       month1=Integer.parseInt(sc.nextLine());
       year1=Integer.parseInt(sc.nextLine());  
    }
    
    Date(int d,int m,int y){
        day1=d;
        month1=m;
        year1=y;
    }

    public int getDay() {return day1;}
    public void setDay(int day1) {this.day1 = day1;}
    public int getMonth() {return month1;}
    public void setMonth(int month1) {this.month1 = month1;}
    public int getYear() {return year1;}
    public void setYear(int year1) {this.year1 = year1;}
    
    public String Print(){
        
        
        date1=String.valueOf(getDay())+"-"+String.valueOf(getMonth())+"-"+String.valueOf(getYear());
        
       return date1; 
    }
    public void GetDate2(){
       System.out.println("Enter Day, month and year for swapping ");
       day2=Integer.parseInt(sc.nextLine());
       month2=Integer.parseInt(sc.nextLine());
       year2=Integer.parseInt(sc.nextLine()); 
      
       date2=String.valueOf(day2)+"-"+String.valueOf(month2)+"-"+String.valueOf(year2); 
    } 
    public void swap(){
         
       System.out.println("Date 1: "+date1);
       System.out.println("Date 2: "+date2);
       
       String temp=date1;
       date1=date2;
       date2=temp;
       
       System.out.println("After Swapping\nDate 1: "+date1);
       System.out.println("Date 2: "+date2);     
    }  
}
public class Assignment1_Question1 {

    public static void main(String[] args) {
       
       //Default Constructor Object Creation
       
       //Date obj = new Date();
       
       //Parameterized Constructor Object Creation
       
       Date obj=new Date(12,02,2012);
        String result1 = obj.Print();
        System.out.println("Today's Date is "+result1);
        obj.GetDate2();
        obj.swap();
    }   
}
