package Binary_Search;

/*We are playing the Guess Game. The game is as follows:

I pick a number from 1 to n. You have to guess which number I picked.

Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.

You call a pre-defined API int guess(int num), which returns three possible results:

-1: Your guess is higher than the number I picked (i.e. num > pick).
1: Your guess is lower than the number I picked (i.e. num < pick).
0: your guess is equal to the number I picked (i.e. num == pick).
Return the number that I picked.

Example 1:

Input: n = 10, pick = 6
Output: 6
 * 
 * 
 * 
 */
public class GuessNumHighOrLow {
	static int guessNum(int n, int pick) {
		int start = 1;
		int end = n;

		while (start <= end) {
			int mid = (start + end) / 2;
			int res = guess(mid, pick);

			if (res == 0) {
				return mid;
			} else if (res == -1) {
				end = mid - 1;

			} else {
				start = mid + 1;
			}

		}

		return -1;
	}

	static int guess(int mid, int pick) {
		if (mid > pick) {
			return -1;
		} else if (mid < pick) {
			return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		int n = 1;
		int pick = 1;

		int result = guessNum(n, pick);
		System.out.println(result);
	}

}
