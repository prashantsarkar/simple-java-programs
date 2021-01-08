package com.prashant.codingchallenges;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] numbers = new int[] {0, 2, 4, 7, 9};
		int target = 7;
		int[] result = getTwoSum(numbers, target);
		System.out.println(result[0] + " " + result[1]);
	}
	
	public static int[] getTwoSum(int[] numbers, int target) {
		Map<Integer, Integer> visitedNumbers = new HashMap<>();
		
		for(int i = 0; i<numbers.length; i++) {
			int delta = target - numbers[i];
			if(visitedNumbers.containsKey(delta)) {
				return new int [] {visitedNumbers.get(delta), i};
			}
			visitedNumbers.put(numbers[i], i);
		}
		return new int [] {-1, -1};
	}

}
