package Binary_Search;
//basic searching problem using binary search technique:
public class BasicSearching {

	public static int binarySearch(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;
			if (target == arr[mid]) {
				return mid;
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int target = 7;
		int res = binarySearch(arr, target);
		System.out.println(res);
	}

}
