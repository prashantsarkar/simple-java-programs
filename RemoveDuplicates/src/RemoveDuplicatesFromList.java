import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 4, 5, 5, null);
		System.out.println(list.toString());
		
		/* Approach One */
		List<Integer> distinctList = new ArrayList<>(new HashSet<>(list));
		System.out.println(distinctList.toString());
		
		/* Approach Two --- Java >= 1.8 */
		System.out.println(list.stream().distinct().collect(Collectors.toList()).toString());
	}
}
