/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Z_Exercises;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author yuvar
 */

class Runner1{
    Scanner sc = new Scanner(System.in);
    int n;int ans;
    int a,b,c;
    public void getInput(){
        n = Integer.parseInt(sc.nextLine());
        
        for(int i=0;i<n;i++){
            a = Integer.parseInt(sc.nextLine());
            b = Integer.parseInt(sc.nextLine());
            c = Integer.parseInt(sc.nextLine());
            
            /*ans=0;
            int x = c%a;
            int y=(c-b)%a;
            
            if(x>b){
                ans=c-(x-b);
            }
            else{
                ans=c-y;
            }
            System.out.println(ans+"\n");*/
            
            if(a<=c){
                ans=c/a;
                 
            }
        }

    
    }
    
    
}
public class ques1 {
 
    public static void main(String [] args){
       /*Runner1 o = new Runner1();
        o.getInput();
        */
       Date d=new Date("01-DEC-2020");
		System.out.println("Month of the year is  : "+d.getMonth()+1);
        
        
    }
}


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
