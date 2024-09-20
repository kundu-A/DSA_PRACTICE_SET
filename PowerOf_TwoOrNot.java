import java.util.*;
public class PowerOf_TwoOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check that is power of two or not: ");
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
        if(c==1)
            System.out.println("This number is power of 2.");
        else
            System.out.println("This number is not a power of 2.");
        sc.close();
    }
}
