//Assignment Solution
import java.util.*;
public class HaspMapKeyValuePairProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nuhmber of the key value pair: ");
        int size=sc.nextInt();
        Map<Integer,String> hashmap=new TreeMap<>();
        System.out.println("Enter values in key value pair: ");
        for(int i=0;i<size;i++){
            int key=sc.nextInt();
            String value=sc.next();
            hashmap.put(key,value);
        }
        System.out.println(hashmap);
        sc.close();
    }
}