package LeedCodeProblems;

import java.util.ArrayList;
import java.util.List;

/*
 * Given an array arr and a chunk size size, return a chunked array.

A chunked array contains the original elements in arr, but consists of subarrays each of length size. The length of the last subarray may be less than size if arr.length is not evenly divisible by size.

You may assume the array is the output of JSON.parse. In other words, it is valid JSON.

Please solve it without using lodash's _.chunk function.
Example 1:

Input: arr = [1,2,3,4,5], size = 1
Output: [[1],[2],[3],[4],[5]]
Explanation: The arr has been split into subarrays each with 1 element.
 * 
 */
public class LeedCodep10 {
     static void sol(int[] arr){
    	 int k =2;
    	 List<List<Integer>> res = new ArrayList<List<Integer>>();
 
    	 for(int i = 0; i< arr.length; i = i+k){
    		 List<Integer> r = new ArrayList<>();
    		 for(int j =i; j< i+k && j < arr.length; j++){
    			 r.add(arr[j]);
    		 }
    		 res.add(r);
    		 
    		 
    	 }
    	 System.out.println(res);
    	 
    	 
     }
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		
		sol(nums);

	}

}















