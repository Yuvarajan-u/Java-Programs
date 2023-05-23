
package Arrays;
/*
What is Jagged Array?
    It is type of 2d array in this no of cols will differ in each rows.
*/
public class Jagged_Array {

    public static void main(String[] args) {
        
       int arr2d[][]={
                        {1,2,3},//{0,0}=1,{0,1}=2,{0,3}=3
                        {2,4,6,8},
                        {1,3,5,7,9}
                        };// this type of array is called jagged array
        
        System.out.println("To print this: ");
        
        //number of rows are fixed
        for(int i=0;i<arr2d.length;i++)
        {   
            /*
            if no. of. cols are not same we can get length of row using
            When it takes the row number using "i" it can get length 
            with that we can print accordingly or else it will print 
            upto limit what we specified.. 
            
            array name[row number].length; -> to find number of cols present in that row
            */
            for(int j=0;j<arr2d[i].length;j++)
            {
                System.out.print(arr2d[i][j]);
            }
            System.out.println();
        }
    }
    
}
