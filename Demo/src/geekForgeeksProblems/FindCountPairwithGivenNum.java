package geekForgeeksProblems;

public class FindCountPairwithGivenNum {
	static int sol(int[] arr, int num) {
		int count =0;
		//first loop for pick one element:
		for(int i =0; i<arr.length; i++){
			//System.out.println(arr[i]);
			
			//second loop to find pair with pick num and check the sum of pair is equal to given num or not.
			// if equal means increase the result count.
			
			for(int j =i+1; j<arr.length; j++){
				
				if(arr[i]+arr[j] == num){
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 12, 5, 4 };
		int num = 2;

		int res = sol(arr, num);
		System.out.println(res);

	}

}
