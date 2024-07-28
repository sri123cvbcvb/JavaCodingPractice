package Binary_Search;

/*
 * 
 * 
 * 
 */
public class SearchEleInRotatedArray {
	static int SearchEle(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;

			if (target == arr[mid]) {
				return mid;
			} else if (arr[start] <= arr[mid]) {
				if (target >= arr[start] && target < arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (target > arr[mid] && target <= arr[end]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 7, 8, 1, 2 };
		int target = 1;

		int res = SearchEle(arr, target);
		System.out.println(res);
	}

}
