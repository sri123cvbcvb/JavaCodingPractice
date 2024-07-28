package geekForgeeksProblems;

import java.util.Arrays;

public class CheckEqualArrays {
	static boolean sol(int[] arr1, int[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		boolean flag = true;
		if (arr1.length != arr2.length) {
			return false;
		} else {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					flag = false;
				}
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 5, 4, 0 };
		int[] arr2 = { 2, 4, 5, 0, 1 };

		boolean res = sol(arr1, arr2);
		System.out.println(res);
	}

}
