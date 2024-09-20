import java.util.*;
public class No_Of_1s_Count {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number to count the set bits(1's): ");
    int input=sc.nextInt();
    String res=null;
        if(input==0)
            System.out.println(0);
        else{
            while (input>0) {
                int rem=input%2;
                res=res+rem;
                input=input/2;
            }
        }
        int c=0;
        for(int i=0;i<res.length();i++){
            if(res.charAt(i)=='1')
                c++;
        }
        System.out.println("Total number of set bits are: "+c);
        sc.close();
   } 
}
