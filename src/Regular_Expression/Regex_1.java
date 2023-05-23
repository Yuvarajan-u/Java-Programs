
package Regular_Expression;

import java.util.Scanner;
import java.util.regex.*;
public class Regex_1 {

    public static void main(String[] args) {
       int count=0;
       
       Scanner sc= new Scanner(System.in);
       
       String pattern="";
       String sentence="";
        System.out.print("Enter Sentence: ");
       sentence=sc.nextLine();
        System.out.println("Sentence: "+sentence);
        System.out.print("Enter Pattern: ");
       pattern=sc.nextLine();
       
       Pattern p = Pattern.compile(pattern);
       Matcher m = p.matcher(sentence);
       
       while(m.find()){
       count++;
       //start will give starting index, end will give end index+1 and group will give what we are compiling
           System.out.println("Start Index: "+m.start()+" End Index: "+(m.end()-1)+" Searched Pattern: "+m.group());
       }
        System.out.println("total count: "+count);
       
    }
    
}
