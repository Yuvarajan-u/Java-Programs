
package AA_Run_WhenEver_You_Want;
class Calculate{
    String s1="a",s2="b",s3="c",s4="d";
    int [] p1 =new int[]{2,4,5,3,1}; //count
    int [] v1=new int []{1,3,4,5,2}; //rate
    
    String [][] arr1 =new String[6][6];
    
    void input(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr1[i][j] = String.valueOf(p1[i]*v1[j]);
               // System.out.println(p1[i]*v1[j]);
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(Integer.valueOf(arr1[i][j])+"\t");
            }
            System.out.print("\n");
        }
      for (int i = 0; i < 5; i++) {
          int sum=0;
            for (int j = 0; j < 5; j++) {
                sum+=Integer.valueOf(arr1[i][j]);
                arr1[i][5] = String.valueOf(sum);
               
            }
            int sum2=0;
            for(int k=0;k<5;k++){
               
                sum2+=Integer.valueOf(arr1[k][i]);
                arr1[5][i] = String.valueOf(sum2);
            }
        }
        System.out.println("\n");
        arr1[5][5]="total";
      for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(arr1[i][j]+"\t");
            }
            System.out.print("\n");
        }

        
}    
}
public class SalesPersons {

    public static void main(String[] args) {
        Calculate obj =new Calculate();
        obj.input();
    }
    
}
