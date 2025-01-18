import java.util.*;
public class ReversePrint {
    public static void reversePrint(String s){
        if(s.length()==1){
            System.out.print(s.charAt(s.length()-1));
            return;
        }
        else{
            System.out.print(s.charAt(s.length()-1));
            reversePrint(s.substring(0, s.length()-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the a string: ");
        String s=sc.nextLine();
        reversePrint(s);
        sc.close();
    }
}
