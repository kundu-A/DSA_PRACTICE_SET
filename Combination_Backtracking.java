//Question: Given two integers n and k, return all possible combinations of k numbers chosen from the range [1,n].

import java.util.ArrayList;
import java.util.List;
import java.util.*;
class Solution{
    public void backtrack(List<List<Integer>> result, List<Integer> store, int start, int n, int k) {
        if(store.size()==k){
            result.add(new ArrayList<>(store));
            return;
        }
        for(int i=start;i<=n;i++){
            store.add(i);
            backtrack(result, store, i+1, n, k);
            store.remove(store.size()-1);
        }
    }
    public List<List<Integer>> combine(int n,int k){
        List<List<Integer>> result=new ArrayList<>();
        backtrack(result,new ArrayList<>(),1,n,k);
        return result;
    }
}
public class Combination_Backtracking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the range: ");
        int n=sc.nextInt();
        System.out.println("please enter the size of the combination: ");
        int k=sc.nextInt();
        Solution solution=new Solution();
        List<List<Integer>> list=solution.combine(n, k);
        System.out.println("Total number of combination from 1 to "+n+" = "+list.size()+"\n"+list);
        sc.close();
    }
}
