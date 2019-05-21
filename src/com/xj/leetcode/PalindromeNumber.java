package com.xj.leetcode;

public class PalindromeNumber {
	public boolean isPalindrome(int x) {
		String str = Integer.toString(x); 	
		char[] chr = str.toCharArray();
		for(int i=0;i<chr.length/2;i++){
			if(chr[i]!=chr[chr.length-1-i]){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(new PalindromeNumber().isPalindrome(1000021));
	}
}
