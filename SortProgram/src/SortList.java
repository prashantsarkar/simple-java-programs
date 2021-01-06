import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 8, 2, 2, 10, 10, 4, 5, null);
		List<Integer> sortedList = list;
		System.out.println(list.toString());
		
		/* Approach One */
		System.out.println(new ArrayList<>(new HashSet<>(list)).toString());
		
		/* Approach Two having NULL at last */
		Collections.sort(sortedList, Comparator.nullsLast(Comparator.naturalOrder()));
		System.out.println(sortedList.toString());
		
		/* Approach Three (DISTINCT + SORTED) --- Java >= 1.8 */
		System.out.println(list.stream().distinct().sorted(Comparator.nullsLast(Comparator.naturalOrder()))
				.collect(Collectors.toList()).toString());
		
		/* 
		 * NOTE: 
		 * 1. If you want NULL at first, replace Comparator.nullsLast() to Comparator.nullsFirst()
		 * 2. If you want to reverse the list, replace Comparator.naturalOrder() to Comparator.reverseOrder() 
		 * 
		 * */
	}
}
