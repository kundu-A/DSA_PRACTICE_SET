import java.util.*;

public class HashMapTypes {
    public static void main(String[] args) {

        //HaspMap uses when we want unordered data as output.
        HashMap<Integer,String> haspMap=new HashMap<>();
        haspMap.put(3, "Arpan kundu");
        haspMap.put(2, "Subh");
        haspMap.put(4, "Anjali");
        haspMap.put(1, "Nirmal");

        System.out.println("HaspMap Looks like : "+haspMap);

        //LinkedHaspMap uses when we want order of insertion is preserved in data as output.
        LinkedHashMap<Integer,String> linkedHaspMap=new LinkedHashMap<>();
        linkedHaspMap.put(3, "Arpan kundu");
        linkedHaspMap.put(2, "Subh");
        linkedHaspMap.put(4, "Anjali");
        linkedHaspMap.put(1, "Nirmal");

        System.out.println("LinkedHaspMap Looks like : "+linkedHaspMap);
        
    }
}
