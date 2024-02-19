package blind75.twosum;
//brute force
public class TwoSum {
    public static int[] findIndex(int[]arr, int target){
        for(int i=0;i<arr.length;i++)
        {
           int diff = target-arr[i];
           for(int j=i+1;j<arr.length;j++)
           {
               if(diff==arr[j])
               {
                   return new int[]{i,j} ;
               }
           }
        }
       return null;
    }

    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=9;
        int ans[]=findIndex(arr, target);
        for(int res :ans)
        {
            System.out.println(res);
        }
    }


}
