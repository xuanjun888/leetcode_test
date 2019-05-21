package com.xj.leetcode;

public class SearchinRotatedSortedArray {
	public int search(int[] nums, int target){
		int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = (left + right)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[left]<=nums[mid]){
                if(target>=nums[left] && target<nums[mid]){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }else{
                if(target>nums[mid] && target<=nums[right]){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
        }
        return -1;
	}
	
	public int search1(int[] A, int target) {
		// write your code here
		int left = 0;
		int right = A.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (A[mid] == target)
				return mid;
			if (A[mid] > A[left] && target <= A[mid]) {
				if (A[mid] > target && target > A[left])
					right = mid - 1;
				else {
					left = mid + 1;
				}
			} else {
				if (A[mid] < target && target <= A[right])
					left = mid + 1;
				else
					right = mid - 1;
			}

		}
		return -1;
	}
	
	public boolean search2(int[] nums, int target){
		 int left = 0;
	        int right = nums.length-1;
	        while(left<=right){
	            int mid = (left+right)/2;
	            if(nums[mid] == target){
	                return true;
	            }
	            if(nums[mid]>nums[left]){
	                if(target>=nums[left] && target<nums[mid]){
	                    right = mid-1;
	                }else{
	                    left = mid+1;
	                }
	            }else if(nums[left]>nums[mid]){
	                if(target>nums[mid] && target<=nums[right]){
	                    left = mid+1;
	                }else{
	                    right = mid-1;
	                }
	            }else{
	                left++;
	            }
	       }
	       return false;
	}
	
	public static void main(String[] args) {
		int nums[] = {3,1,1};
		boolean result = new SearchinRotatedSortedArray().search2(nums, 3);
		System.out.println(result);
	}
}
