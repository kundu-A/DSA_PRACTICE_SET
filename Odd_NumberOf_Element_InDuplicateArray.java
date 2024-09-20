import java.util.*;
public class Odd_NumberOf_Element_InDuplicateArray {
    public static void main(String[] args) {  
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the number of elements you want to store: ");    
        int size=sc.nextInt();  
        int[] ar = new int[size];  
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<ar.length; i++)     
            ar[i]=sc.nextInt();  
        int xor=0;
        for (int i : ar)
            xor=xor^i;
        System.out.println("The element which is appearing in odd number is: "+xor);
     sc.close();
	}
}
