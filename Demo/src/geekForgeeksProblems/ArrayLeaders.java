package geekForgeeksProblems;

import java.util.ArrayList;
import java.util.List;

public class ArrayLeaders {
   static List<Integer> solution(int[] arr){
	   List<Integer> res = new ArrayList<Integer>();
	   res.add(arr[arr.length-1]);
	   int max = arr[arr.length-1];
	   for(int i =arr.length-2; i>=0; i--){
        		 if(arr[i] >= max){
        			 max = arr[i];
        			 res.add(max);
        		 }
	   }
	return res;
	   
   }
	public static void main(String[] args) {
	int[] arr= {10,4,2,4,1};
	List<Integer> res = solution(arr);
	System.out.println(res);
	}

}