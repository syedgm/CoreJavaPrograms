import java.util.*;
/*
 * This is a Programe Which diasplay The Largest Element of Array 
 * and Its Location And Also Smallest Element of Array and its Location.
 */

/**
 *
 * @author Syed GM Shah
 */
public class ComparingValues {
    
        public static void main(String[] arg){
        
        Scanner ob=new Scanner(System.in);
        
        System.out.println("Enter Array Sizre: ");
        
        int size=ob.nextInt();
        
        int num[]=new int[size];   
        System.out.println("Enter "+num.length+" Elemnts: ");
     
       int max=0;
       int maxloc=0;
       int small=0;
       int minloc=0;
       
    
        for(int i=0; i<size; i++){
            
            System.out.print("["+i+"] ");
            num[i]=ob.nextInt();
            
            if(i==0){
                max=num[i];
                small=num[i];
            }
            
             if(num[i]>max){
               max=num[i];
               maxloc=i;
             }
             
             if(num[i]<small){
               small=num[i];
               minloc=i;
             }
        }
        
       System.out.println("\nLargest Number is: "+max);
       System.out.println("And It's Location is: "+maxloc);
        
       System.out.println("\nSmallest Number is: "+small);
       System.out.println("And It's Location is: "+minloc);
        
      }
}
