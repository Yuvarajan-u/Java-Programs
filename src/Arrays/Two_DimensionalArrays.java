package Arrays;

public class Two_DimensionalArrays {

    public static void main(String[] args) {
        
        //1d
        
        
        int a[]={1,2,3,4};
        int b[]={2,4,6,8};
        int c[]={1,3,5,7};
        
        //2d is array which haves multiple array within  single array
        int arr2d[][]={
                        {1,2,3,4},//{0,0}=1,{0,1}=2,{0,2}=3
                        {2,4,6,8},
                        {1,3,5,7}
                        };// this type of array is called jagged array
        
        int arrr2d[][]={a,b,c}; 
        int rows=3;
        int cols=4;
        
        System.out.println("To print this: ");
        
        //number of rows are fixed
        for (int i=0;i<rows;i++)
        {   
            /*
            This array is visible in the code so we can give no.of.rows&cols length.
            In user defined array we should get no of rows and cols from the user and mention it 
            in the for loops.
            */
            for(int j=0;j<cols;j++)
            {
                System.out.print(arrr2d[i][j]);
            }
            System.out.println();
        }
    }
    
}
