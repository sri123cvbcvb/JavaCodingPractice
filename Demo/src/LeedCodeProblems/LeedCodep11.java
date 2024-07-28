package LeedCodeProblems;

import java.util.Arrays;

/*
 * 2695. Array Wrapper
Easy
Companies
Create a class ArrayWrapper that accepts an array of integers in its constructor. This class should have two features:

When two instances of this class are added together with the + operator, the resulting value is the sum of all the elements in both arrays.
When the String() function is called on the instance, it will return a comma separated string surrounded by brackets. For example, [1,2,3].
 

Example 1:

Input: nums = [[1,2],[3,4]], operation = "Add"
Output: 10
Explanation:
const obj1 = new ArrayWrapper([1,2]);
const obj2 = new ArrayWrapper([3,4]);
obj1 + obj2; // 10
 * 
 * 
 * 
 */
//add array values:

/*public class LeedCodep11 {
	
	static int sum(int[] num){
		
		int sum = Arrays.stream(num).sum();
		return sum;
		
	}

	public static void main(String[] args) {
		
		int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        
        int sum1= sum(nums1);
        int sum2= sum(nums2);
        
        int res = sum1+sum2;
        System.out.println(res);
	}

}*/


//convert array into string:



public class LeedCodep11 {
	
	static String append(int[] num){
		
		StringBuilder sb= new StringBuilder();
		
		sb.append("[");
		
		for(int i = 0; i<num.length; i++){
			sb.append(num[i]);
			if(i < num.length-1){
			sb.append(",");
			}
		}
		sb.append("]");
		return sb.toString();
		
	}

	public static void main(String[] args) {
		
		int[] nums1 = {23, 98, 42, 70};
        
        String res = append(nums1);
        
        System.out.println(res);
	}

}















