import java.util.*;
 
/** Note: The value of String is Also an object
 * 
 * @author Syed GM Shah
 */
public class StringInArray {
        
        public static void main(String arg[]){
        
            String s1="Hello";
            
            int code1=s1.hashCode();
            int code2="Hello".hashCode();
            
            System.out.println(code1);
            System.out.println(code2);
            
            int length1="Hello".length();
            int length2=s1.length();
            
            System.out.println(length1);
            System.out.println(length2);
     
        }
}
