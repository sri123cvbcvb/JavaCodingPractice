import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class D1 {

	
	//1.Detect Duplicate Elements in an Array
	//A = [2,4,6,2,7,6,1,8,9]
	public static void main(String[] args) {
		
		
	List<Integer> l1 = Arrays.asList(2,4,6,2,7,6,1,8);
	
	        Map<Integer, Long> result = l1.stream().filter(x -> Collections.frequency(l1, x)>1).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	        System.out.println(result);
          Set<Integer> ss = result.keySet();
          for(int r : ss){
        	  System.out.println(r);
          }
          Collection<Long> v = result.values();
          System.out.println(v);
          
          
	}

}
