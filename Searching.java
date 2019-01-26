package arrays;
import java.util.*;

/**
 *
 * @author GM Shah
 */
public class Searching {

    public static void main(String[] args) {

        Scanner ob=new Scanner(System.in);
        
        System.out.println("Enter Array Sizre: ");
        
        int size=ob.nextInt();
        
        int num[]=new int[size];   
        System.out.println("Enter "+num.length+" Elemnts: ");
        
        for(int i=0; i<size; i++){
            
            num[i]=ob.nextInt();
        }
        
        System.out.println("Enter Number Witch You want To Search....???");
        
        int item=ob.nextInt();
        
        boolean a=false;
        
        for(int j=0; j<size; j++){
            
            if(item==num[j]){
                System.out.println("The Location of "+item+" is:"+j);
                a=true;
            }
        }
        
        if(a!=true){
            System.out.println("The Number "+item+" is Not in Array");
        }
    }
}
