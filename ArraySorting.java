import java.util.*;
/**
 *
 * @author Administrator
 */
public class ArraySorting {
        
        public static void main(String arg[]){
        
        Scanner ob=new Scanner(System.in);
    
        System.out.print("Enter Array size: ");
        int size =ob.nextInt();

        int num[]=new int[size];
        for(int i=0; i<size; i++){
            System.out.print("["+(i+1)+"] ");
            num[i]=ob.nextInt();
        }
        
        while(true){
            System.out.print("******MENU**** ");
           System.out.print("1.Assending Order\n2.Disassending Order\n3.Traversing\n4.Exit\n\nEnter Selection: ");
           int selection=ob.nextInt();
           
           switch(selection){
               case 1:
                  System.out.print("******Assending Order**** ");
                  for(int j=1; j<size; j++){
		
                        for(int b=0; b<size-j; b++){
			
                            if(num[b]>num[b+1]){
				int temp=num[b];
				num[b]=num[b+1];
				num[b+1]=temp;
                            }
                        }
                  }
                  System.out.println("\n\nAssending Order Done:");
                  break;
                  
               case 2:
                  System.out.print("******Disassending Order**** ");
                  for(int j=1; j<size; j++){
		
                        for(int b=0; b<size-j; b++){
			
                            if(num[b]<num[b+1]){
				int temp=num[b];
				num[b]=num[b+1];
				num[b+1]=temp;
                            }
                        }
                  }
               
                  System.out.println("\n\nDisassending Order Done:");
                  break;
               case 3:
                   
                   System.out.println("********Traversing*******");

                   for(int c=0; c<size; c++){
                        System.out.println("["+(c+1)+"] "+num[c]);
                   }
                   break;
               case 4:
                   System.exit(0);
               default:
                    System.out.println("\nInvalid Selesction");
        
          }//switch
        
        }//while
    
        
        }
}
