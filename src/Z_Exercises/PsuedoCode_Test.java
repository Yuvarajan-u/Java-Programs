
package Z_Exercises;

public class PsuedoCode_Test {
    
    static int fun(int a,int b,int c){
        //in pseudo code exam it will be like
        //for(each c from 5 to 7)
        for(c=5;c<=7;c++){
            
            if((c^b^a)<(b+a+c))
                b=(b+a)^c;
            b=(b+11)&a;
            a=(a+b)+c;
                
            
        }
        
        return a+b;
    }
    public static void main(String[] args) {
        
       System.out.println(PsuedoCode_Test.fun(2,4,4));
       
        /*int p,q,r;
       p=0;
       q=4;
       r=8;
       r=(3+1)+q;
       p=(5+4)+q;
      if((q+3)<(3-q)){
          if((q^5^6)>(p^7)){
              q=11+q;
              q=5+r;
          }
          p=9+q;
          r=r+q;
      }
      q=(9&11)^r;
       

        System.out.println(p+q+r);
      */ 
    }
    
}
