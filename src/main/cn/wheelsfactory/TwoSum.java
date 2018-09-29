package cn.wheelsfactory;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        int temp = 0;
        for(int i=0;i<nums.length;i++){
            temp = target - nums[i];
            if(map.containsKey(temp) && map.get(temp) != i){
                result[0] = i;
                result[1] = map.get(temp);
                break;
            }
        }
		return result;
    }
}
