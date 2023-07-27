package hashmap.leetcode;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer> twoSumMap=new HashMap<>();
        int[] res=new int[2];
        for(int i=0;i<n;i++){
            if(twoSumMap.containsKey(nums[i])){
                res[0]=twoSumMap.get(nums[i]);
                res[1]=i;
            }
            else{

            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[]={4,5,6,7,8};

       int ans[]= twoSum(arr,9);
       for(int a :ans)
       {
           System.out.println(a);
       }
    }
}
