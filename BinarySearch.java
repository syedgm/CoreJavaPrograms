package binarysearch;
import java.util.*;
/**
 *
 * @author MITSOFTWARE
 */
public class BinarySearch {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        
        System.out.print("Enter Size: ");
        int size=ob.nextInt();
        
        int num[]=new int[size];
        for(int i=0; i<size; i++){
        
            num[i]=ob.nextInt();
        }
        
        System.out.print("Which item you want to Search: ");
        int item=ob.nextInt();
        
        int start=0;
        int end=size;
        int midLoc;
        boolean b=true;
        
        for(int j=start; j<end; j++){
            midLoc=(start+end)/2;
            if(num[midLoc]==item){
                System.out.println("Location: "+midLoc);
                b=false;
                break;
            }
            else if(item>num[midLoc]){
                start=midLoc;
            }else
                end=midLoc;
        }
        if(b)
            System.out.println("This Item Is Not In Array..");
        
    }
}
