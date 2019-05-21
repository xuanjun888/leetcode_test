package com.xj.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TowSum {
	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
	public int[] twoSum1(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++){
			map.put(nums[i], i);
		}
		for(int i=0;i<nums.length;i++){
			int tmp = target - nums[i];
			if(map.containsKey(tmp) && map.get(tmp)!=i){
				return new int[]{i, map.get(tmp)};
			}
		}
		throw new IllegalArgumentException("No two sum solution");
    }
}
