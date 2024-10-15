import java.util.*;
public class FirstNonRepeatingCharacter_HashMap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str=sc.next();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }
            else{
                map.put(str.charAt(i), 1);
            }
        }
        int flag=-1;
        for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i))==1){
                System.out.println("First non-repeating character is present in "+i+" index, which is "+
                str.charAt(i));
                flag=1;
                break;
            }
        }
        if (flag==-1) {
            System.out.println("No non-repeating character is present in the string.");
        }
        sc.close();
    }
}
