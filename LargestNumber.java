
import java.util.*;
/**
 *
 * @author Syed GM Shah
 */
public class LargestNumber {

    public static void main(String[] args) {

         Scanner ob=new Scanner(System.in);
        
        System.out.println("Enter Array Sizre: ");
        
        int size=ob.nextInt();
        
        int num[]=new int[size];   
        System.out.println("Enter "+num.length+" Elemnts: ");
        
        for(int i=0; i<size; i++){
            System.out.print("["+i+"] ");
            num[i]=ob.nextInt();
        }
       int max=0;
       int loc=0;
        
       for(int j=0; j<size; j++){
           
           if(num[j]>max){
               max=num[j];
               loc=j;
           }  
       }
       System.out.println("Larger Number is: "+max);
       System.out.println("And Location is: "+loc);
        
    }
}

