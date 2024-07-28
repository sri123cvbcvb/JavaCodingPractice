import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.lang.*;


public class Dem2{

     public static void main(String[] args){
    
    int[] a = {1, 2, 3, 1, 2, 4};

      List<Integer> a1 = new ArrayList<Integer>();

       for( int rs    :a){
              a1.add(rs);
            }


          Map<Integer, Long> result =  a1.stream().filter(x -> Collections.frequency(a1, x)>1).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
   System.out.println(result);
}

}