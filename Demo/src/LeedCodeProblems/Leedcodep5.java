package LeedCodeProblems;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * 169. Majority Element
 * Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 * 
 * 
 * 
 */
class Solution5 {
    public int majorityElement(int[] nums) {
    	int n = nums.length/2;
    	Integer a = Arrays.stream(nums).boxed().collect(Collectors.toList())
    	      .stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
    	      .entrySet().stream().max(Map.Entry.comparingByValue()).filter(x -> x.getValue()>n).map(Map.Entry:: getKey).orElse(0);
    	
    	System.out.println(a);
		return a;
        
    }
}
public class Leedcodep5 {

	public static void main(String[] args) {
		
      int[] nums = {2,2,1,1,1,2,2};
      
      Solution5 s5 = new Solution5();
      s5.majorityElement(nums);
	}

}

















