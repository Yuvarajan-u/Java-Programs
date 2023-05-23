package AA_Run_WhenEver_You_Want;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/*

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int len =s.length();
       List<String> l = new ArrayList<>();
               for(int i=0;i<len-k+1;i++){
            l.add(s.substring(i,i+k));
        }
        Collections.sort(l);
       
        smallest=l.get(0);
        largest=l.get(l.size()-1);
        
        
        return smallest + "\n" + largest;
    }
public static void main(String[] args) {
        String s;
        int k;
        try (Scanner scan = new Scanner(System.in)) {
            s = scan.next();
            k = scan.nextInt();
        }
      
        System.out.println(getSmallestAndLargest(s, k));
    }

 public void Check(){
    int [] arr={2,5,1,4,1,6,1,5,1,5};
    
    
    int w=arr.length-1;
    
    int r=arr.length-1;
    
    while(r>=0){
    if(arr[r]!=1){
    arr[w]=arr[r];
    w--;
    }
    r--;
    }
    while(w>=0){
    arr[w]=1;
    w--;
    }
        System.out.println(Arrays.toString(arr));
    }
*/
public class CanWeSkipToTheGoodPart {
    
   
    public static void main(String[] args) {
   /* int i,j;
       int limit=1;
       for(i=1;i<=4;i++){
           if(i%2==0){
               for(j=limit+3;j>=limit;j--){
               System.out.print(j+"\t");
               }
               limit=j+5;
               System.out.println();
           }
           else{
               for(j=limit;j<=limit+3;j++){
                   System.out.print(j+"\t");
               }
               limit=j;
               System.out.println();
           } 
       }
*/
   int n1,n2;
   
   Scanner sc=new Scanner(System.in);
   n1=sc.nextInt();
   n2=sc.nextInt();
   sc.nextLine();
   
   StringBuilder sb1=new StringBuilder(String.valueOf(n1)); //123 "123"
   sb1.reverse(); //"321"
   
   StringBuilder sb2=new StringBuilder(String.valueOf(n2));
   sb2.reverse(); //"654"
   
   int sum=Integer.valueOf(sb1.toString())+Integer.valueOf(sb2.toString()); //321+654
   StringBuilder sb3=new StringBuilder(String.valueOf(sum));
   sb3.reverse();
   
   
   System.out.println(n1+"\n"+n2+"\n"+sb1+"\n"+sb2+"\n"+sum+"\n"+sb3);
   
   
   
    }
    
}
