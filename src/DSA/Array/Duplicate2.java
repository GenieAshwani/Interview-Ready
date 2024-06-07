package DSA.Array;

import java.util.HashMap;
import java.util.Map;

public class Duplicate2 {

    public static void main(String[] args) {

        int arr[]={1,2,3,1,2,3};
        System.out.println(containsNearbyDuplicate(arr,2));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                if(Math.abs(i-map.get(nums[i]))<=k)
                {
                    return true;
                }
                else{
                    map.put(nums[i],i);
                }
            }
            else{
                map.put(nums[i],i);
            }
        }
        return false;
    }
}


