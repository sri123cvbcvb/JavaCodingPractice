package geekForgeeksProblems;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class ArraySubset {
	static String sol(int[] arr1, int[] arr2) {
		Map<Integer, Long> a1 = Arrays.stream(arr1).boxed()
				.collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		System.out.println(a1);

		for (int num : arr2) {
			if (!a1.containsKey(num) || a1.get(num) == 0) {
				return "NO";
			}
			a1.put(num, a1.get(num) - 1);
		}
		return "YES";
	}

	public static void main(String[] args) {
		int[] arr1 = { 11, 7, 1, 13, 21, 3, 7, 3 };
		int[] arr2 = { 11, 3, 7, 1, 7,7};
		String res = sol(arr1, arr2);
		System.out.println(res);

	}

}