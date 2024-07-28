package geekForgeeksProblems;

public class BinarySearch {
	static int sol(int[] arr, int k) {
		int start = 0;
		int end = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			int mid = (start + end) / 2;
			if (arr[mid] == k) {
				return mid;
			} else if (k < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int k = 4;

		int res = sol(arr, k);
		System.out.println(res);

	}

}
