import java.util.*;
public class TwoSumProblem_HashMap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Enter elements in the array: ");
        for(int i=0;i<size;i++){
            ar[i]=sc.nextInt();
        }
        System.out.println("Enter the target element: ");
        int target=sc.nextInt();

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<size;i++){
            map.put(ar[i],i);
        }
        int res[]=new int[2];
        for(int i=0;i<size;i++){
            if(ar[i]==target && map.containsKey(0)){
                res[0]=i;
                res[1]=map.get(0);
                break;
            }
            else if(map.containsKey(target-ar[i])){
                if(map.get(target-ar[i])>i){
                    res[0]=i;
                    res[1]=map.get(target-ar[i]);
                    break;
                }
            }
            else{
                res[0]=-1;
                res[1]=-1;
            }
        }
        System.out.println(res[0]+" "+res[1]);
        sc.close();
    }
}
