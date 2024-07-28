package Binary_Search;
/*Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 

Example 1:

Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.

*/

public class FindSquareRootValue {
	static int FindSqRoot(int x) {
		if (x < 2) {
			return x;
		}
		int start = 2;
		int end = x / 2;
		while (start <= end) {
			int mid = (start + end) / 2;
			long num = (long) mid * mid;
			if (x == num) {
				return mid;
			} else if (x < num) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return end;
	}

	public static void main(String[] args) {
		int x = 15;

		int res = FindSqRoot(x);
		System.out.println(res);
	}

}
