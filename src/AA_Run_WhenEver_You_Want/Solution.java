package AA_Run_WhenEver_You_Want;

import java.io.*;

import java.util.*;


class Result {

    public static void bonAppetit(List<Integer> bill, int k, int b) {
    
    int sum=0;
    for(int i=0;i<bill.size();i++){
        if(!Objects.equals(bill.get(i), bill.get(k))){
            sum+=bill.get(i);
        }
        
    }
    int half=(int)sum/2;
    
    if(half==b){
        System.out.println("Bon Appetit");
    }
    else{
        int res=b-half;
        System.out.println(res);
    }

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            
            int n = Integer.parseInt(firstMultipleInput[0]);
            
            int k = Integer.parseInt(firstMultipleInput[1]);
            
            String[] billTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            
            List<Integer> bill = new ArrayList<>();
            
            for (int i = 0; i < n; i++) {
                int billItem = Integer.parseInt(billTemp[i]);
                bill.add(billItem);
            }
            
            int b = Integer.parseInt(bufferedReader.readLine().trim());
            
            Result.bonAppetit(bill, k, b);
        }
    }
}
