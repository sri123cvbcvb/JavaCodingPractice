package geekForgeeksProblems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayDupicates {
 static List<Integer> duplicates(int[] arr){
	 
	List<Integer> ini =  Arrays.stream(arr).boxed().collect(Collectors.toList());
	    
	    List<Integer> res =  ini
	     .stream()
	    .sorted()
	    .filter(x -> Collections.frequency(ini, x)>1)
	    .distinct()
	    .collect(Collectors.toList());
	    
	   
	    if(res.isEmpty()){
	    	 List<Integer> finalres = Arrays.asList(-1);
	    	 return finalres;
	    }
	    
	return res;
	 
 }
	public static void main(String[] args) {
		int n=4;
        int[] arr = {0,3,1,2,2,3};
        List<Integer> r = duplicates(arr);
        System.out.println(r);

	}

}
