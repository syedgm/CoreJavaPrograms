import java.util.*;

/**
 *
 * @author Syed GM Shah
 */
public class Combination {
        public static void main(String[] arg){
            
         Scanner ob=new Scanner(System.in);
         
         System.out.print("Enter Array Size: ");
         int size=ob.nextInt();
         
         int num[]=new int[size];        
         
         for(int i=0; i<size; i++){
            System.out.print("["+i+"] ");
            num[i]=ob.nextInt();
         }
         
         while(true){
         System.out.print("\n1.Insertation\n2.Deletion\n3.Traversing\n4.Exit\n\nEneter Selection: ");
         int selection=ob.nextInt();
         
         switch(selection){
             
                case 1:
                    System.out.print("*****INSERTION******");
                    
                    System.out.println("\nEnter Any extra Number in Array: ");
                    int number=ob.nextInt();
        
                    System.out.println("\nEnter location: ");
                    int loc=ob.nextInt();

                    for(int a=size-1; a>loc; a--){
                        num[a]=num[a-1];	     
                    }
                    num[loc]=number;
                    break;
                case 2:
                    System.out.print("*****DELETION******");
                    
                    System.out.print("\nEnter location for delete That Item: ");
                    int location=ob.nextInt();
        
                    for(int j=location; j<size-1; j++){
                        num[j]=num[j+1];
                    }
                    num[size-1]=0;
                    break;
                case 3:
                    System.out.println("*****TRAVERSING******");
                    
                    for(int b=0; b<size; b++){
                        System.out.println("["+b+"] "+num[b]);
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nInvalid Selection: ");
                    

         
         }//switch
         }//while
        }
}
