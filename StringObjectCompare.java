import java.util.*;
/*
 * 
 */

/**
 *
 * @author Administrator
 */
public class StringObjectCompare {

    public static void main(String arg[]){
    
        Scanner ob=new Scanner(System.in);
        String s1=ob.next();
        String s2="Hello";
        String s3="Hello";
        String s4=new String("Hello");
        String s5=new String("Hello");
        
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s3=="Hello");
        System.out.println(s4==s5);
        System.out.println(s4=="Hello");
    }
}
