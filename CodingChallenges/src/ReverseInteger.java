
public class ReverseInteger {

	public static void main(String[] args) {
		System.out.println(reverseInteger(123456789));
	}
	
	public static int reverseInteger(int input) {
		int reversed = 0;
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
