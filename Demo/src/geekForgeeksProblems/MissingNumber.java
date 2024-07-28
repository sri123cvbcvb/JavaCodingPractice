package geekForgeeksProblems;

public class MissingNumber {
	static int FindMiss(int[] arr, int n){
		int totalSum = n * (n + 1) / 2;
        System.out.println("total:"+ totalSum);
        // Calculate the sum of elements in the array
        int arraySum = 0;
        for (int num : arr) {
            arraySum += num;
        }
        
        // The missing number is the difference between totalSum and arraySum
        return totalSum - arraySum;
		}
	public static void main(String[] args) {
		int[] arr = {1};
		int n = 2;
		int res = FindMiss(arr, n);
		System.out.println(res);
		
// through looping technique:
		
		/*for(int i=0; i<=n; i++){
			//System.out.println(arr[i]);
		   int nexVal = i+1;
		   if(arr[i] != nexVal){
			   System.out.println(nexVal);
			   break;
		   }
		
		}*/
		
	}

}
