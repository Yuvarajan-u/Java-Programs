package Z_Exercises;
//Remove duplicate char from array and reverse it..


public class Dec22_2021 {

    public static void main(String[] args) {

        char[] ch = {'A', 'P', 'P', 'L', 'E'};
        char[] newarr = new char[ch.length];
        int i,j,index=0;
        for (i = 0; i < ch.length; i++) {
            
            for ( j = 0; j < i; j++) {
                if (ch[i] == ch[j]) {
                    break;
                }
                
            }
            if(j==i){
                    newarr[index++]=ch[i];
                }

        }
        String rev = "";
        for (i = newarr.length - 1; i >= 0; i--) {
            rev += newarr[i];
        }

        System.out.println(rev);
    }
}
