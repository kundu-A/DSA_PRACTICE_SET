import java.util.HashMap;
import java.util.Map;

public class HashMapFunctions {
    public static void main(String[] args) {
        
        //HashMap Object creation.
        HashMap<Integer,String> haspMap=new HashMap<>();

        //Functionality of the put() function.
        haspMap.put(1, "Arpan");
        haspMap.put(2, "Sudipta");
        haspMap.put(3, "Surojit");
        haspMap.put(4, "Goutam");
        haspMap.put(5, "Manojit");

        System.out.println("The HaspMap is: "+haspMap);

        //Functionality of the get() function.
        String result=haspMap.get(1);
        System.out.println("At "+1+" position , the value is "+result);

        //Functionality of the containsKey() function.
        System.out.println(haspMap.containsKey(7));
        System.out.println(haspMap.containsKey(2));

        //Functionality of the remove() function.
        haspMap.remove(5);
        System.out.println("Updated HaspMap is "+haspMap);

        //Functionality of the entrySet() function.
        for(Map.Entry<Integer,String> e: haspMap.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
