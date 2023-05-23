package Z_TCS_IPA_Complex_Codes;

import java.util.*;


class Hotel {

    private int hotelId;
    private String hotelName;
    private String dateOfJoin;
    private double billAmount;

    public Hotel(int hotelId, String hotelName, String dateOfJoin, double billAmount) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.dateOfJoin = dateOfJoin;
        this.billAmount = billAmount;
    }

    public int getHotelId() {
        return hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getDateOfJoin() {
        return dateOfJoin;
    }

    public double getBillAmount() {
        return billAmount;
    }
}

public class Solution_Hotel {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = 3;
        Hotel arr[] = new Hotel[size];
        for (int i = 0; i < size; i++) {
         
            int hotelId = Integer.parseInt(sc.nextLine());
         
            String hotelName = sc.nextLine();
         

            String dateOfJoin = sc.nextLine();

            
            double billAmount = Double.parseDouble(sc.nextLine());

            arr[i] = new Hotel(hotelId, hotelName, dateOfJoin, billAmount);

        }
        int answer = getSecondLargestBillAmount(arr);

        System.out.println("Hotel ID of Second Largest Bill Amount: " + answer);

        int month = Integer.parseInt(sc.nextLine());
//String month = sc.nextLine();
        int counts = getNoOfCustomers(arr, month);
        if (counts == 0) {
            System.out.println("NA");
        } else {
            System.out.println("No of customers on month: " + month + " is " + counts);
        }
    }

    private static int getSecondLargestBillAmount(Hotel[] s) {
        int id = 0;
        double first = s[0].getBillAmount();
        double second = 0;
        for (Hotel item : s) {
            //to find second largest mark
            if (item.getBillAmount() > first) {
                second = first;
                first = item.getBillAmount();
            } else if (item.getBillAmount() > second && item.getBillAmount() != first) {
                second = item.getBillAmount();
            }
        }
        //to get rollno of second largest
        for (int i = 0; i < s.length; i++) {
            if (s[i].getBillAmount() == second) {
                id = i;
            }
        }
        id = s[id].getHotelId();

        return id;
    }

    private static int getNoOfCustomers(Hotel[] s, int month) {
        int count = 0;
        int size = 3;
        for (int i = 0; i < size; i++) {

            String check1 = s[i].getDateOfJoin();
            String[]  dateParts=check1.split("/");
            String m=dateParts[1];
          
            if (month==Integer.valueOf(m)) {
                count++;

            } else {
               continue;
            }

        }
        return count;

    }
    
    /*
private static int getNoOfCustomers(Hotel[] s, String month) {
        int count = 0;
        int size = 3;
        for (int i = 0; i < size; i++) {

            String check1 = s[i].getDateOfJoin();
            String[]  dateParts=check1.split("/");
            String m=dateParts[1];
          
            if (month.equals(m)) {
                count++;

            } else {
               continue;
            }

        }
        return count;

    }
*/
    
/* Sample input in month (int)
1
1
01/09/2020
111
2
2
09/09/2020
242
3
3
09/08/2020
134
*/

/* Sample input in month (String)
1
1
01/SEP/2020
111
2
2
09/SEP/2020
242
3
3
09/SEP/2020
134
*/
}
