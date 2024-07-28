package geekForgeeksProblems;

public class EquilibriumPoint {

	public static void main(String[] args) {
		int[] arr = {1,2,0,3};
		
		//find total sum of the array:
		
		int totalSum = 0;
		for(int a: arr){
			totalSum += a;
		}
		//System.out.println(totalSum);
		
		int leftSum = 0;
		
		for(int i= 0; i<arr.length; i++){
			totalSum -= arr[i];
			
			if(leftSum == totalSum){
				System.out.println(i+1);
			}
			
			leftSum += arr[i];
		}
		System.out.println(-1);
		
		
		
		
		
		
		
		
		
		
		
		
		/*int left =0;
		int right = 0;
		int ans =0;
		for(int i = 0; i<arr.length; i++){
			left += arr[i];
			System.out.println("left:"+ left);
			for(int j = arr.length-1; j>(arr.length-1)-1; j--){
				right += arr[j];
				System.out.println("right:"+ right);
				
			}
			if(left == right){
				ans = i+1;
				break;
			}
		}
		System.out.println(ans);*/

	}

}