/*
 * Time Complexity: O(n), where n=length of an array.
 * Space Complexity: O(1)
 */
import java.util.Scanner;
public class LinearSearchAlgo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Enter elements in the arrya:" );
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        System.out.println("Enter an element for searching: ");
        int target=sc.nextInt();
        int index=-1;
        for(int i=0;i<size;i++){
            if(ar[i]==target)
            {
                index=i;
                break;
            }
        }
        if(index==-1)
            System.out.println("Element is not found.");
        else
            System.out.println("Element is found at: "+(index+1));
        sc.close();
    }
}
/*
 * ADVANTAGES: 
 *      1.We can search an element in any kind of array.
 *      2.Easy to understand.
 * DISADVANTAGES:
 *      1.When size of an arrya is too much then it will take huge time to search that element.
 */