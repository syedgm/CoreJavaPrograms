import java.util.*;
/**
 *
 * @author Syed GM Shah
 */
public class StringArraySorting {
        
      public static void main(String arg[]){
            
        Scanner ob=new Scanner(System.in);
    
        System.out.print("Enter Array size: ");
        int size =ob.nextInt();

        String num[]=new String[size];
        for(int a=0; a<size; a++){
            System.out.print("["+(a+1)+"] ");
               num[a]=ob.next();
         }
        
        System.out.println("\nAfter Sorting: ");
        
        for(int j=1; j<num.length; j++){
            
                for(int i=0; i<num.length-j; i++){
                
                    if((num[i].compareTo(num[i+1])>0)){
                		String temp=num[i];
				num[i]=num[i+1];
				num[i+1]=temp;
                    }
                }
        }
        
        for(int c=0; c<num.length; c++){
              System.out.println("["+(c+1)+"] "+num[c]);
        }
                  
      }
    
}
