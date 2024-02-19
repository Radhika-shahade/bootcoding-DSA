package blind75.twosum;

import java.util.HashMap;
import java.util.Map;

//best approach
public class TwoSum2 {
    public static int[] findSum(int arr[], int target)
    {
        Map<Integer, Integer>map= new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int diff =target-arr[i];
            if(map.containsKey(diff))
            {
                return new int[]{map.get(diff),i};
            }
            map.put(arr[i],i);
        }
        return null;
    }
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=9;
       int ans[]= findSum(arr,target);
       for(int res:ans){
           System.out.println(res);
       }
    }
}
