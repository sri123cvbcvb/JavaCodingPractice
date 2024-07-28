package selection_Sort;

import java.util.Arrays;

public class SelectionSort {
	static void selection_sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min_index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min_index]) {
					min_index = j;
				}
			}
			// swap:
			int temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 3, 2, 4 };
		selection_sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
