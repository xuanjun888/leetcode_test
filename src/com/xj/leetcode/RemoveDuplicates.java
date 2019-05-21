package com.xj.leetcode;

public class RemoveDuplicates {
	public int removeDuplicates(int[] nums) throws Exception {
        if(nums.length>0){
            int flag = 0;
            for(int i=1;i<nums.length;i++){
                if(nums[i]!=nums[flag]){
                    flag++;
                    nums[flag] = nums[i];
                }
            }
            return flag+1;
        }else{
        	throw new Exception("nums length less 0");
        }
        
    }
	
	public int removeDuplicates1(int[] nums) {
		if (nums.length == 0) return 0;
	    int i = 0;
	    for (int j = 1; j < nums.length; j++) {
	        if (nums[j] != nums[i]) {
	            i++;
	            nums[i] = nums[j];
	        }
	    }
	    return i + 1;
	}
	
	public int removeDuplicates2(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int i = 0;
        int flag = 1;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                nums[++i] = nums[j];
            }else{
                if(++flag>2){
                    flag = 1;
                }else{
                    nums[++i] = nums[j];
                }
            }
        }
        return i+1;
    }
	
	public int removeDuplicates3(int[] nums) {
        if(nums.length <= 2){
            return nums.length;
        }
        int flag = 2;
        for(int i=2;i<nums.length;i++){
        	if(nums[i]!=nums[i-2]){
        		nums[flag++] = nums[i];
        	}
        }
        return flag;
    }
	
	public static void main(String[] args) {
		int nums[]  = new int[]{1,1,1,2,2,3};
		try {
			int removeDuplicates = new RemoveDuplicates().removeDuplicates3(nums);
			System.out.println(removeDuplicates);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
