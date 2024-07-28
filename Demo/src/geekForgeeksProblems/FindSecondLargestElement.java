package geekForgeeksProblems;

import java.util.Arrays;
import java.util.List;

public class FindSecondLargestElement {
	public static int print2largest(List<Integer> arr) {
        int a1 = arr.stream().sorted((a,b) -> b-a).distinct().skip(1).findFirst().get();
        return a1;
    }
	public static void main(String[] args) {
		
		List<Integer> arr = Arrays.asList(12, 35, 1, 10, 34, 1);
		
		
   System.out.println(print2largest(arr));
	}

}