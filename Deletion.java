import java.util.*;
/**
 *
 * @author Syed GM Shah
 */
public class Deletion {
    
       public static void main(String[] arg){
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int size=ob.nextInt();
        
        int num[]=new int[size];
        
        for(int i=0; i<size; i++){
            System.out.print("["+i+"] ");
            num[i]=ob.nextInt();
        }
        
        System.out.println("\nEnter location for delete That Item: ");
        int loc=ob.nextInt();
        
        for(int j=loc; j<size-1; j++){
                num[j]=num[j+1];
        }
        for(int c=0; c<size-1; c++){
            System.out.println("["+c+"] "+num[c]);
        }
        
      }
}
