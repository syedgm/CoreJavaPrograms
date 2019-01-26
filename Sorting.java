import java.util.*;
/**
 *
 * @author Syed GM Shah
 */
public class Sorting {
    
        public static void main(String arg[]){
        Scanner ob=new Scanner(System.in);
    
        System.out.print("Enter Array size: ");
        int size =ob.nextInt();

        int num[]=new int[size];
        for(int i=0; i<size; i++){
            System.out.print("["+(i+1)+"] ");
            num[i]=ob.nextInt();
        }
    
        for(int j=size-1; j>0; j--){
		
		//for(int b=0; b<size-j; b++){
			
			if(num[j]<num[j-1]){
				int temp=num[j];
				num[j]=num[j-1];
				num[j-1]=temp;
			}
		//}
        }
        System.out.println("After Sorting:");
        
        for(int c=0; c<size; c++){
	 System.out.println("["+(c+1)+"] "+num[c]);
        }
    
        }
}
