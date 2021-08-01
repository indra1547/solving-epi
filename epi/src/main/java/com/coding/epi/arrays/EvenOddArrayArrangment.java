package com.coding.epi.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * TimeComplexity - O(n)
 * Space complexity - O(1)
 * */

public class EvenOddArrayArrangment {
	
	public static List<Integer> evenOddArrayArrange(List<Integer> nums){
		
		int evenStart = 0;
		int oddEnd = nums.size()-1;
		while(evenStart <= oddEnd) {
			if(nums.get(evenStart)%2 == 0) {
				evenStart++;
			}else {
				Collections.swap(nums, evenStart, oddEnd--);
			}
		}
		return nums;
	}

	public static void main(String[] args) {
		System.out.println(EvenOddArrayArrangment.evenOddArrayArrange(Arrays.asList(1,2,3,4,5,6,7,8,9,10)));
	}

}
