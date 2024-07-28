package LeedCodeProblems;


/*
 * Given an array of integers arr, return true if and only if it is a valid mountain array.

Recall that arr is a mountain array if and only if:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 * Example 1:

Input: arr = [2,1]
Output: false
Example 2:

Input: arr = [3,5,5]
Output: false
Example 3:

Input: arr = [0,3,2,1]
Output: true
 * 
 */

public class LeedCodep12 {

	static void isValidMountain(int[] arr){
		
		if(arr.length >= 3){
		//find peak element:
	int peak = 0 ;
	for(int i =1; i<arr.length; i++){
		if(arr[i] > arr[i-1]){
			peak = i;
		}
	}
	System.out.println("peak element INDEX is: "+peak);
	
	/*if(peak == arr.length-1){
		break;
	}*/
	
	boolean isInc = true;
	boolean isdec = true;
	
	for(int i = 1; i< peak; i++){
		if(arr[i] <= arr[i-1] ){
			isInc = false;
		}
	}
	System.out.println(isInc);
	
	for(int i = arr.length-1; i>peak; i--){
		if(arr[i] >= arr[i-1] ){
			isdec = false;
		}
	}
	System.out.println(isdec);
	
	if(isInc == true && isdec == true){
		System.out.println("the given array is valid mountain");
	}
	else{
		System.out.println("the given array is NOT valid mountain");
	}
		}
		else{
			System.out.println("the given array is NOT valid mountain");
		}
	
	}
	
	public static void main(String[] args) {
		
		int[] arr ={0, 1, 2, 3, 4, 5, 6, 7, 8, 7};
		
		isValidMountain(arr);
	}

}

















