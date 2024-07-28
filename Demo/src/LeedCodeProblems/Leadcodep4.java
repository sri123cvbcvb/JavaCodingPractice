package LeedCodeProblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 80. Remove Duplicates from Sorted Array II
 * Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice. 
 * The relative order of the elements should be kept the same.
 * 
 * Example 1:

  Input: nums = [1,1,1,2,2,3]
Output: 5, nums = [1,1,2,2,3,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
 * 
 * 
 */
class Solution4 {
    public int removeDuplicates(int[] nums) {
    	
    List<Integer> result = Arrays.stream(nums).boxed().collect(Collectors.toList())
    	      .stream().collect(Collectors.groupingBy(e -> e)).values()
    	      .stream().flatMap(x-> x.stream().limit(2)).collect(Collectors.toList());
    int k = result.size();
    	System.out.println(result.size());
		return k;
        
    }
}
public class Leadcodep4 {

	public static void main(String[] args) {
		 int[] nums = {0,0,1,1,1,1,2,3,3};
		 
		 Solution4 s4 = new Solution4();
		 s4.removeDuplicates(nums);

	}

}

















