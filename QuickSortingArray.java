import java.util.*;
/**
 *
 * @author Syed GM Shah
 */
public class QuickSortingArray {
    
      public static void main(String arg[]){
        
        Scanner ob=new Scanner(System.in);
        
        System.out.print("Enter Array size: ");
        int size =ob.nextInt();
        
        int num[]=new int[size];
        for(int i=0; i<size; i++){
            System.out.print("["+(i+1)+"] ");
            num[i]=ob.nextInt();
        }
        int half=size/2;
        int counter=0;
        for(int j=1; j<=half; j++){
            
                        for(int b=size-j,c=j-1; b>=j; b--,c++){
			
                            if(num[b]<num[b-1]){
				int temp=num[b];
				num[b]=num[b-1];
				num[b-1]=temp;
                             }
                            if(num[c]>num[c+1]){
                                int temp=num[c];
                                num[c]=num[c+1];
                                num[c+1]=temp;
                            }
                         counter++;
                        }
        }
        System.out.println("*********AFTER SORTING***********");
        
        for(int c=0; c<size; c++){
	 System.out.println("["+(c+1)+"] "+num[c]);
        }
        System.out.println("Total Repeatations in Buble Sort: "+counter);
        
      }
}