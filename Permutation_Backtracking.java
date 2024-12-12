//Question: given an array nums of distinct integers , return all the possible permutations. You can return the answer in any order.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution{
    public void backtrack(List<List<Integer>> result,List<Integer> store,int nums[]){
        if(store.size()==nums.length){
            result.add(new ArrayList<>(store));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(store.contains(nums[i]))
                continue;
            store.add(nums[i]);
            backtrack(result, store, nums);
            store.remove(store.size()-1);
        }
    }
    public List<List<Integer>> permute(int nums[]){
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }
}

public class Permutation_Backtracking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Please enter values in the array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        Solution solution=new Solution();
        List<List<Integer>> list=solution.permute(ar);
        System.out.println("Total number of Permutation = "+list.size()+"\n"+list);
        sc.close();
    }
}