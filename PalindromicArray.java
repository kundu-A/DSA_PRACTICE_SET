class WorstCase{
    /*Here Time complexity = O(n):-Because we use a loop with n length.
     * Space complexity = O(n):Because we use a extra array to store the reverse digits of the main array.
     */
    public void palindrome(){
        int ar[]={1,2,3,2,1};
        int arr[]=new int[ar.length];
        int flag=0;
        for(int i=0;i<ar.length;i++)
        {
            arr[i]=ar[ar.length-i-1];
        }
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]!=arr[i])
            {
                System.out.println("This array is not Palindromic array.");
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("This is an Palindromic array.");
    }
}
class Bestcase{
    /*Here Time complexity = O(n):-Because we use a loop with n length.
     * Space complexity = O(1):Because we do not use any extra array to store the reverse digits of the main array.
     */
    public void palindrome()
    {
        int ar[]={1,2,3,2,1};
        int flag=0;
        for(int i=0;i<=ar.length/2;i++)
        {
            if(ar[i]!=ar[ar.length-i-1])
            {
                flag=1;
                System.out.println("This is not a Plaindromic array.");
                break;
            }
        }
        if(flag==0)
            System.out.println("Tihs is a Palindromic array.");
    }
}

public class PalindromicArray {
    public static void main(String[] args) {
        System.out.println("With Time complexity = O(n) and Space complexity = O(n)");
        new WorstCase().palindrome();
        System.out.println("With Time complexity = O(n) and Space complexity = O(1)");
        new Bestcase().palindrome();
    }
    
}