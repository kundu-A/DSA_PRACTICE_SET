import java.util.*;
public class FindLengthOfString {
    public static int count(String s,int sum){
        if(s.length()==0)
            return sum;
        else
            return count(s.substring(0, s.length()-1), (sum+1));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String s=sc.nextLine();
        int sum=0;
        System.out.println(count(s,sum));
        sc.close();
    }
}
