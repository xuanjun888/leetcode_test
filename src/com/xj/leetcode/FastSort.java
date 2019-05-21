package com.xj.leetcode;

import java.util.Arrays;

public class FastSort {
	public static void main(String[] args) {
		int[] a = {12,20,5,16,15,1,30,45,23,9};
		System.out.println(Arrays.toString(a));
		sort(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));
	}
	public static void sort(int[] a, int start, int end){
		int key = a[start];
		int low = start;
		int high = end;
		while(low < high){
			while(low<high && a[high] >= key){
				high--;
			}
			if(a[high]<=key){
				int tmp = a[low];
				a[low] = a[high];
				a[high] = tmp;
			}
			while(low<high && a[low]<=key){
				low++;
			}
			if(a[low]>=key){
				int tmp = a[low];
				a[low] = a[high];
				a[high] = tmp;
			}
		}
		if(low>start){
			sort(a, start, low-1);
		}
		if(high<end){
			sort(a, high+1, end);
		}
	}
}
