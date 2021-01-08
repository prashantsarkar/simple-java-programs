
public class ReverseString {
	public static void main(String[] args) {

		String str = "dlrow olleH";

		// StringBuilder
		System.out.println(new StringBuilder(str).reverse().toString());

		// StringBuffer
		System.out.println(new StringBuffer(str).reverse().toString());

		System.out.println(reverseStringEfficient(str));
		
		System.out.println(reverseStringNotEfficient(str));
	}

	// Manually and efficient
	private static String reverseStringEfficient(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
	
	// Manually and NOT efficient as every time new string literals created when you append a string
	private static String reverseStringNotEfficient(String str) {
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		return reverse;
	}
}
