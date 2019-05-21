package com.xj.leetcode;

public class ReverseInteger {
    public int reverse(int x) {
    	String str = Integer.toString(x);
        char chr[] = str.toCharArray();
        for(int i=0;i<chr.length/2;i++){
            int flag = chr.length-1-i;
            if(flag != i){
                char tmp = chr[i];
                chr[i] = chr[flag];
                chr[flag] = tmp;
            }
        }
        return Integer.parseInt(String.valueOf(chr));
    }
}
