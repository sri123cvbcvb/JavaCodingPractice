package LeedCodeProblems;


/*
 * An array is monotonic if it is either monotone increasing or monotone decreasing.

An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. 
An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].

Given an integer array nums, return true if the given array is monotonic, or false otherwise.
Example 1:

Input: nums = [1,2,2,3]
Output: true

Example 2:

Input: nums = [6,5,4,4]
Output: true
Example 3:

Input: nums = [1,3,2]
Output: false
 * 
 * 
 */
public class LeedCodep9 {
    static void sol(int[] nums){
    	
    	boolean desc = true;
    	boolean asc = true;
    	
    	for(int i=0; i<nums.length-1; i++){
    		if(nums[i] < nums[i+1]){
    			desc = false;
    		}
    		if(nums[i] > nums[i+1]){
    			asc = false;
    		}
    	}
    	if(desc ==false && asc == true){
			System.out.println("array is monotone increasing");
		}
		else if(desc == true && asc == false){
			System.out.println("array is monotone decreasing");   			
		}
		else{
			System.out.println("array is not monotone");
		}
    }
	public static void main(String[] args) {
		
     int[] nums = {1,3,2};
     sol(nums);
	}

}















