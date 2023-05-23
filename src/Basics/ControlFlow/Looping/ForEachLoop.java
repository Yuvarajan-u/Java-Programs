package Basics.ControlFlow.Looping;

//For each is specially used for arrays..

public class ForEachLoop {

    public static void main(String[] args) {
        
        int a[]= {1,2,3,4};
        
        System.out.println("\nforLoop:");
        
        //a.length gives size of array
        
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("\nforeach Loop:");
        
        /*
        k will fetch values from a one by one 
        first element of a 1 goes to k and it is printed and loop goes on..
        */
        for(int k : a){
            System.out.println(k);
        }
        
       
        
        //For 2d Array
        
        int arr2d[][]= {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println("\n2d array with foreach Loop:");
        
        for(int [] i: arr2d){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
