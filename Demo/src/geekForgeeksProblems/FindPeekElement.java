package geekForgeeksProblems;

public class FindPeekElement {
	static int sol(int[] arr) {
		if (arr.length == 0) {
			return arr[0];
		}
		if (arr[0] > arr[1]) {
			return arr[0];
		}
		if (arr[arr.length - 1] > arr[arr.length - 2]) {
			return arr[arr.length - 1];
		}

		for (int i = 1; i <= arr.length - 2; i++) {
			if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
				return arr[i];
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {1, 1, 1, 2,3, 1, 1, 1,5};

		int res = sol(arr);
		System.out.println(res);
	}

}
