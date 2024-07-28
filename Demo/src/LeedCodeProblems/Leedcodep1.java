package LeedCodeProblems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
 Merge Sorted Array:
 Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
  
 
 */

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        System.out.println(Arrays.toString(nums1));
        
        int conbinedArrayLength = nums1.length+nums2.length;
        int[] combinedArray = new int[conbinedArrayLength];
        
        System.arraycopy(nums1, 0, combinedArray, 0, nums1.length);
        System.arraycopy(nums2, 0, combinedArray, nums1.length, nums2.length);
        System.out.println(Arrays.toString(combinedArray));
        
       List<Integer> res = Arrays.stream(combinedArray).boxed().sorted().filter(x -> x != 0).collect(Collectors.toList());
       System.out.println(res);
       int[] res1 = new int[res.size()];
       for(int i =0; i<res.size(); i++){
    	   res1[i]= res.get(i);
       }
       System.out.println(Arrays.toString(res1));
    }
}
public class Leedcodep1 {

	public static void main(String[] args) {
	int[] nums1 = {1,2,3,0,0,0};
	int m =3;
	int[] nums2 = {2,5,6};
	int n =3;
	
	Solution s = new Solution();
	s.merge(nums1, m, nums2, n);

	}

}
