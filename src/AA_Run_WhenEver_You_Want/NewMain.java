/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AA_Run_WhenEver_You_Want;
import java.util.*;
/**
 *
 * @author yuvar
 */
public class NewMain {
    
    public static boolean primeChecker(int i){
    if(i==1||i==0)
        return false;
    for(int j=2;j<i;j++){
        if(i%j==0)
            return false;
    }
    return true;
    }
    public static List<Integer> checkPrimeNumber(int n){
   
        List<Integer>answer=new ArrayList<>();
    
       for(int i=1;i<=n;i++){
           if(primeChecker(i)){
               answer.add(i);
           }
       }    
        return answer;
    }
    public static LinkedHashSet<Integer> removeDuplicates(int [] arr){
        LinkedHashSet<Integer> hs=new LinkedHashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        return hs;
    }
    public static void main(String[] args) {
        List<Integer> answer=checkPrimeNumber(11);
        for(int s:answer){
            System.out.print(s+" ");
        }
        System.out.println();
        
        Scanner sc=new Scanner(System.in);
        
        int n;
        n=Integer.parseInt(sc.nextLine());
        int [] arr=new int [n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        LinkedHashSet<Integer>hs=removeDuplicates(arr);
        for(int s:hs){
            System.out.print(s+" ");
        }
        System.out.println();
    }
    
}
