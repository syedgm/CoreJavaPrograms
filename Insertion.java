import java.util.*;
/**
 *
 * @author Syed GM Shah
 */
public class Insertion {
    public static void main(String[] arg){
        
        Scanner ob=new Scanner(System.in); 
        System.out.print("Enter Array Size: ");
        int size=ob.nextInt();
        
        int num[]=new int[size];
        
        for(int i=0; i<size; i++){
            System.out.print("["+i+"] ");
            num[i]=ob.nextInt();
        }
        
        System.out.println("\nEnter Any extra Number in Array: ");
        int number=ob.nextInt();
        
        System.out.println("\nEnter location: ");
        int loc=ob.nextInt();
        int num2[]=new int[size+1];
        for(int j=0; j<size; j++){
            num2[j]=num[j];
        }
        for(int a=size; a>loc; a--){
	   num2[a]=num2[a-1];	     
        }
        
        num2[loc]=number;
        for(int b=0; b<=size; b++){
            System.out.println("["+b+"] "+num2[b]);
        }
        
    }
}
