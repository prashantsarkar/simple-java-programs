package com.prashant.codingchallenges;

public class ReverseInteger {

	public static void main(String[] args) {
		System.out.println(reverseInteger(123456789));
		System.out.println(reverseInteger(Integer.MAX_VALUE));
		System.out.println(reverseInteger(Integer.MIN_VALUE));
	}
	
	public static long reverseInteger(int input) {
		long reversed = 0;
		while(input != 0) {
			reversed = reversed * 10 + input % 10;
			input = input / 10;
			if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
				return 0;
			}
		}
		return reversed;
	}
}
