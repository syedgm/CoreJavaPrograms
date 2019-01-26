/*
 *Note: Relational Oprator compare refrence of two objects in place of Contents. 
 *
 */

/**
 *
 * @author Syed GM Shah
 */
public class StringCompare {
    
    public static void main(String arg[]){
    
        String s1="Ali"; 
        String s2="Zahid"; 
        
        int num=s1.compareTo(s2);
        if(num==0)
        System.out.println("Both Are equal");
        
        if(num>0)
        System.out.println("1st String is Greater");
        
        if(num<0)
        System.out.println("2nd String id Greater");
        
    
    }
}
