package AA_Run_WhenEver_You_Want;
class Programming{
    String p="";
    public Programming() {
        System.out.println("I like Programming Languages");
    }
    public Programming(String program) {
        System.out.println(program);
    }
    
}
public class Program2 {

    public static void main(String[] args) {
        Programming p1=new Programming();
        Programming p2=new Programming("C Sharp");
    }
    
}
