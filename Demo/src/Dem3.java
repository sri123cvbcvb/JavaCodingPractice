//{ Driver Code Starts
// Initial Template for Java

/*public class Dem3{
	
	
	public static void main(String[] args) {
		
	}
}*/



import java.io.*;


import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import javax.sound.sampled.Line;
// User function Template for Java
/*public class Dem3 {
    
    // Note that the size of the array is n-1
    static int missingNumber(int n, int arr[]) {
        int next_val = 1;
        for(int i =0; i<=arr.length-1; i++){
        	if (arr[i] == next_val){
        		next_val++;
        	}
        	else{
        		return next_val;
        	}
      
        }
        return -1;
    }
    
    public static void main (String[] args){
        int n = 5;
        int[] arr = {1,2,3,5,6,7};
        int result = Dem3.missingNumber(n,arr);
        System.out.println(result);
    }
    
}


*/

//find duplicates:
/*public class Dem3 {
    public static List<Integer> duplicates(int[] arr) {
    	
    	 Arrays.sort(arr);
    	 List<Integer> dum = new ArrayList<>();
    	 
    	for(int res : arr){
    		dum.add(res);
    	}
    	
    	List<Integer> result = dum.stream().filter(x -> Collections.frequency(dum, x)>1).collect(Collectors.toList());
     if(result.isEmpty()){
    	 List<Integer> res = Arrays.asList(-1);
    	 return res;
     }
     else{
		return  result;
     }
    }
    
    public static void main (String[] args){
        int n=4;
        int[] arr = {0,3,1,2,2,3};
        List<Integer> r = Dem3.duplicates(arr);
        Set<Integer> result = new HashSet<>(r);
        System.out.println(result);
    }
}*/





import java.util.stream.IntStream;

/*public class Dem3 {

  public static void findLeaders(int[] arr) {
    int currentMax = arr[arr.length - 1];  // Initialize with rightmost element (always a leader)
    System.out.print(currentMax + " ");

    for (int i = arr.length - 2; i >= 0; i--) {
      if (arr[i] >= currentMax) {
        currentMax = arr[i];
        System.out.print(currentMax + " ");
      }
    }
  }

  public static void main(String[] args) {
    int[] arr = {16,17,4,3,5,2};
    System.out.println("Leaders in the array are:");
    findLeaders(arr);
  }
}*/

/*public class Dem3{
	 static void findSecondLarEle(int n , int[] arr){
		 
		 Optional<Integer> result = Arrays.stream(arr).boxed().sorted((a,b) -> b-a).skip(1).findFirst();
		 System.out.println(result.get());
		 List<Integer> res = Arrays.stream(arr).boxed().sorted((a,b) -> a-b).distinct().collect(Collectors.toList());
		 System.out.println(res);
	 }
	
	public static void main(String[] args) {
		int n= 6;
		int[] arr = {-1, -32, 0 , 5, 5};
		Dem3.findSecondLarEle(n, arr);
	}
}
*/

/*public class Dem3{
	
	static void findSecondLarEle(int n ,int k,  int[] arr){

		
		int sta = 1;

		int count1 = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = sta; j <= arr.length - 1; j++) {
				if (k == (arr[i] + arr[j])) {
					count1++;
				}
			}
			sta++;
		}
		int sta2 = arr.length-2;

		int count2 = 0;
		for (int i = arr.length-1; i >=0; i--) {   
			for (int j = sta2; j >=0; j--) {
				if (k == (arr[i] + arr[j])) {
					count2++;
				}
			}
			sta2--;
		}
		System.out.println(count1+count2);	
	 }	
	
	public static void main(String[] args) {
		int n= 6;
		int k =3;
		int[] arr = {12, 1,2,1,2};
		Dem3.findSecondLarEle(n,k, arr);
	}
}
*/


//Write a Java program for generating the nth Fibonacci Number using loop and O(1) space:
//output like: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55

/*
public class Dem3{
	
	static void FindFibonacci(int n){
		List<Integer> result = new ArrayList<Integer>();
		for(int i = 0; i<=n; i++){
			if(result.isEmpty()){
				result.add(i);
			}
			else if(i==1){
				result.add(i);
			}
			else{
				
				int rr = result.get(result.size()-1)+ result.get(result.size()-2);
				result.add(rr);
			}
		}
		System.out.println(result);
	}
	
	public static void main(String[] args) {
	
		int n =10;
		Dem3.FindFibonacci(n);
		
	}
}
*/
//2) Write a Java program for counting the digits present in a number.
//output: If we take a number 5647, we find that the number consists of 4 digits that are 5, 6, 4, and 7.

/*public class Dem3{
	
	static void FindDigitsInNumber(int num){
		
		Long res = String.valueOf(num).chars().filter(x -> Character.isDigit(x)).count();
		System.out.println(res);
	}
	
	public static void main(String[] args) {
		int num = -980;
		Dem3.FindDigitsInNumber(num);
	}
}*/


//3) Calculate how many times a digit D occurs in the number N. One has to ask the user to give the values of N and D.

/*public class Dem3{
	
	static void FindCount(long n, int d){
		
		char d1 = Character.forDigit(d, 10);
		System.out.println(d1);
		System.out.println(n);
		
		long result = String.valueOf(n).chars().filter(x -> x == d1).count();
		System.out.println(result);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		long n = sc.nextLong();
		System.out.println("enter the digit to count:");
		int d = sc.nextInt();
		Dem3.FindCount(n,d);	
	}
}*/

//5) A string is given. Our task is to write a Java program to toggle the characters of the given string. For example, for the string "jaVaTpoiNt", the string after the toggle will be "JAvAtPOInT".


/*public class Dem3{
	static void ConvertLowerToUpAndUpToLower(String a){
		
		String result = a.chars().mapToObj(c -> (char)c).map(c -> {
			if(Character.isUpperCase(c)){
				return Character.toLowerCase(c);
			}
			else if(Character.isLowerCase(c)){
				return Character.toUpperCase(c);
			}
			else{
				return c;
			}
		}).map(c -> String.valueOf(c)).collect(Collectors.joining());
		
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		String a = "jaVaT poiNt";
		Dem3.ConvertLowerToUpAndUpToLower(a);
		
	}
}*/


/*Write a Java program for printing all of the unique characters present in a String. 
 * For instance, for the string "pppdaf", print characters 'd', 'a', and 'f' since they are unique. 
 * The character 'p' is coming thrice in the program. Hence, it is not printed. It is given only small letters are present in the input string.
 */


/*public class Dem3{
	static void FindUniqueChar(String a){
		ArrayList<Character> res = a.chars().mapToObj(c -> (char) c).collect(Collectors.toCollection(()-> new ArrayList<>()));
		
		Map<Character, Long> res1 = res.stream().filter(x -> Collections.frequency(res, x)<=1).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		System.out.println(res1.keySet());
	}
	
	public static void main(String[] args) {
		String a = "pppdaf";
		Dem3.FindUniqueChar(a);
	}
}
*/


//string related program:

/*public class Dem3{
	
	
	public static void main(String[] args) {
		String str1 = "dadi";  
		// assigning the reference of string str1 to string str2   
		String str2 = str1; 
		System.out.println("str2:"+ str2);
		System.out.println("str1:"+ str1);
		str1 = str1 + "Gulzar";  
		  System.out.println(str1);
		  System.out.println(str2);
		if(str1 == str2)  
		{  
		System.out.println("Strings are not immutable.");  
		}  
		else  
		{  
		// if the control reaches here, then it means == operator   
		// has returned a false value.  
		System.out.println("Strings are immutable.");      
		}  
	}
}*/

//Write a java program to reverse a string?

/*public class Dem3{
	 static void ReverseAString(String a) {
		//using stringbuffer inbuild method:
		StringBuffer sb = new StringBuffer(a);
		System.out.println("using stringbuffer inbuild method:"+sb.reverse());
		
		//using iterative method:
		char[] ch = a.toCharArray();
		String s = "";
		for(int i = ch.length-1; i>=0; i--){
			s =s+ch[i];
			
		}
		System.out.print("using iterative method:"+ s);
	}
	
	public static void main(String[] args) {
		String a = "sriram";
		Dem3.ReverseAString(a);
	}	
}*/



//Write a java program to reverse a string using recursiveMethodCall?
/*public class Dem3 {
    static String recursiveMethodCall(String a) {
        if ((a == null) || (a.length() <= 1)) {
            return a;
        }
        return recursiveMethodCall(a.substring(1)) + a.charAt(0);
    }

    public static void main(String[] args) {
        String a = "hello";
        System.out.print(recursiveMethodCall(a));
    }
}*/

//Remove spaces from the string: 

/*public class Dem3{
	static void RemoveSpaces(String a){
		
		 String res = a.chars().mapToObj(c -> (char)c).filter(x -> x != '_').map(x -> String.valueOf(x)).collect(Collectors.joining());
		
		System.out.println(res);
	}
	public static void main(String[] args) {
		String a = "hai_da_sriram    ";
		Dem3.RemoveSpaces(a);
		//System.out.println(a.replaceAll("\\s+", ""));
	}
}*/


//How To Find Duplicate Characters In A String In Java?
//Write a java program to find duplicate characters and their count in a given string? For example, in a string “Better Butter”, duplicate characters and their count is t : 4, e : 3, r : 2 and B : 2.


/*public class Dem3{
	static void FindDuplicateChar(String a){
		ArrayList<Character> rs = a.chars().mapToObj(x -> (char)x).collect(Collectors.toCollection(() -> new ArrayList<>()));
		 Map<Character, Long> res = rs.stream().filter(x -> x != ' ').filter(x -> Collections.frequency(rs, x)>1).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		 System.out.println(res);
	}
	
	public static void main(String[] args) {
		String a = "Better Butter";
		Dem3.FindDuplicateChar(a);
	}
}*/

//How To Check The Equality Of Two Arrays In Java?
/* Two arrays are said to be equal if the arrays have equal number of elements 
and all corresponding pairs of elements in two arrays are equal. 
In the other words, two arrays are said to be equal if both the arrays have same elements in the same order. 
You are very often need to compare two arrays for equality while developing the applications. 
This is also one of the important  java interview question for 1 or 2 years experienced java professionals. */

/*public class Dem3{
	static void FindEqualityOfArrayByInBuildMethod(int[] a, int[] b){
		boolean res = Arrays.equals(a, b);
		System.out.println(res);
	}
	
	static boolean FindEqualityOfIntArrayByStreams(int[] a, int[] b){
		if(a == null || b == null){
			return false;
		}
		else if(a.length != b.length){
			return false;
		}
     return IntStream.range(0, a.length).allMatch(i -> a[i] == b[i]);
	}
	
	static boolean FindEqualityOfStringArrayByStreams(String[] a, String[] b){
		if(a == null || b == null){
			return false;
		}
		else if(a.length != b.length){
			return false;
		}
     return IntStream.range(0, a.length).allMatch(i -> a[i].equals(b[i]));
	}
	
	public static void main(String[] args) {
		int[] arrayOne = {2, 5, 1, 7, 4};
        
        int[] arrayTwo = {2, 5, 1, 7, 4};
		Dem3.FindEqualityOfArrayByInBuildMethod(arrayOne, arrayTwo);
		boolean res = Dem3.FindEqualityOfIntArrayByStreams(arrayOne, arrayTwo);
		System.out.println("FindEqualityOfIntArrayByStreams:"+res);
		String[] array1 = {"one", "two", "three"};
		String[] array2 = {"one", "two", "three"};
		boolean res1 = Dem3.FindEqualityOfStringArrayByStreams(array1, array2);
		System.out.println("FindEqualityOfStringArrayByStreams:"+ res1);
	}
}*/

//Write Java Program To Check Whether Two Strings Are Anagram Or Not?

/*public class Dem3{
	 static boolean isAnagram(String a, String b) {
		 
		ArrayList<Character> a1 = a.chars().mapToObj(x -> (char) x).filter(x -> x != ' ').map(x -> Character.toLowerCase(x)).sorted().collect(Collectors.toCollection(() -> new ArrayList<>()));
		ArrayList<Character> a2 = b.chars().mapToObj(x -> (char) x).filter(x -> x != ' ').map(x -> Character.toLowerCase(x)).sorted().collect(Collectors.toCollection(() -> new ArrayList<>()));
		System.out.println(a1);
		System.out.println(a2);
		
		return IntStream.range(0, a1.size()).allMatch(i -> a1.get(i).equals(a2.get(i)));
	}
	
	public static void main(String[] args) {
		boolean res  = isAnagram("Mother In Law", "Hitler Woman");
		System.out.println(res);
	}

	
}*/

//How To Find An Armstrong Number In Java?
//A number is called an Armstrong number if it is equal to sum of its digits each raised to the power of number of digits in it. 
//For example: 153, 371, 407, 9474, 54748 are some Armstrong numbers.
/*153 = 13 + 53 + 33 = 1 + 125 + 27 = 153

371 = 33 + 73 + 13 = 27 + 343 + 1 = 371

407 = 43 + 03 + 73 = 64 + 0 + 343 = 407

9474 = 94 + 44 + 74 + 44 = 6561 + 256 + 2401 + 256 = 9474 */

/*public class Dem3{
	 static void FindArmstrong(int a) {
		 String a1 = String.valueOf(a);
		 
		 int result = IntStream.range(0, a1.length()).map(i -> Integer.parseInt(String.valueOf(a1.charAt(i)))).map(x -> (int) Math.pow(x, a1.length())).sum();
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		int a = 153;
		Dem3.FindArmstrong(a);
	}
}*/



//How To Find Duplicates In Array In Java?

/*public class Dem3{
	 static void FindDuplicatesInArray(int[] a) {
		 
		 Set<Integer> uniqueele = new HashSet<>();
		 
		    Set<Integer> dupicates = Arrays.stream(a).filter(x -> !uniqueele.add(x)).boxed().collect(Collectors.toSet());
		    System.out.println("uniqueele:"+ uniqueele);
		    System.out.println("dupicates:"+ dupicates);
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,1,2};
		Dem3.FindDuplicatesInArray(a);
	}
}*/

//How To Find Sum Of All Digits Of A Number In Java?
//	Write a java program to find the sum of all digits of a number? For example, if 7456 is the given number, then sum of all digits in 7456 = 7+4+5+6 = 22.

/*public class Dem3{
	 static void FindSumOfAllDigitsOfANumber(int a) {
		String a1 = String.valueOf(a);
		
		int result = IntStream.range(0, a1.length()).map(i -> Integer.parseInt(String.valueOf(a1.charAt(i)))).sum();
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		int a = 5555;
		Dem3.FindSumOfAllDigitsOfANumber(a);
	}
}*/


//How To Find Second Largest Number In An Integer Array?


/*public class Dem3{
	 static void FindSecondLargestNumberInAnIntegerArray(int[] a) {
		
	  Optional<Integer> res =  Arrays.stream(a).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
       
	 if(res.isPresent()){
		 System.out.println(res.get()); 
	 }
	 else{
		 System.out.println("there is no second largest value");
	 }
	}
	
	public static void main(String[] args) {
		int[] a = {12,23,55,67,34,12};
		Dem3.FindSecondLargestNumberInAnIntegerArray(a);
	}
}*/

//create a 2d array by user input:

/*public class Dem3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num of rows:");
		int rows = sc.nextInt();
		System.out.println("enter the num of columns:");
		int cols = sc.nextInt();
		
		int[][] matrix = new int[rows][cols];
		System.out.println("enter the data:");
		for(int i = 0; i< rows; i++){
			for(int j = 0; j<cols; j++){
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("matric datas:");
		for(int i=0; i<rows; i++){
			for(int j=0; j<cols; j++){
				System.out.print(matrix[i][j]+"   ");
			}
			System.out.println();	
		}
	}
}*/


//How To Count Occurrences Of Each Character In String In Java?
/*Problem :
Given a string , you have to count the number of occurrences of each character in it.
For example, If “Java J2EE Java JSP J2EE” is the given string then occurrences of each character in this string is E=4, 2=2, v=2,  =4, P=1, S=1, a=4, J=5. */

/*public class Dem3{
	   static void CountOccurrencesOfEachCharacterInString(String a){
		   
		   ArrayList<Character> re = a.chars().mapToObj(x -> (char) x).filter(x -> x != ' ').collect(Collectors.toCollection(() -> new ArrayList<>()));
		   
		   Map<Character, Long> res = re.stream().filter(x -> Collections.frequency(re, x)>0).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		   System.out.println(res);
	   }
	
	public static void main(String[] args) {
		String a = "Java J2EE Java JSP J2EE";
		Dem3.CountOccurrencesOfEachCharacterInString(a);
	}
}*/

//How To Find Largest Number Less Than Given Number And Without Given Digit?

/*Question :
Write a java program to find the largest number ‘L’ less than a given number ‘N’ which should not contain a given digit ‘D’. 
For example, If 145 is the given number and 4 is the given digit, then you should find the largest number less than 145 such that it should not contain 4 in it. 
In this case, 139 will be the answer. */


/*public class Dem3{
	   static void FindLargestNumLessThanGivenNumAndWithoutGivenDigit(int givenNum, int givenDig){
		   int temp = 0;
		   String temp2 =null;
		   while(true){
			   System.out.println("hai");
			         temp =  givenNum-1;  //Decrement givenNum by 1 and assign to temp.
			
				    temp2 = String.valueOf(temp);              //converting the temp int represent into string of temp2
				    String digtemp = String.valueOf(givenDig); //converting the givenDig int represent into string of digtemp
				   if(!temp2.contains(digtemp)){               // this condition is for check the givendig is present in the temp2 or not
					   System.out.println("not con");
					   System.out.println(temp2);
					   break;
				   }  
			   givenNum--;   //decrement the givenNum for next iterations
			   
		   }
		  
	   }
	   
	   //find using java 8 streams:
	   
	   static void FindLargestNumLessThanGivenNumAndWithoutGivenDigitUsingStreams(int givenNum, int givenDig){
		   
		  OptionalInt res =  IntStream.iterate(givenNum-1, i -> i-1).filter( i -> !checkDigitInNum(i, givenDig)).findFirst();
		  if(res.isPresent()){
		  System.out.println(res.getAsInt());
		  }
		  else{
			  System.out.println("not present");
		  }
	   }
	
	 static boolean checkDigitInNum(int givenNum, int givenDig) {
		
		 String givNum = String.valueOf(givenNum);
		 char givDig = Character.forDigit(givenDig, 10);
		 if(givNum.indexOf(givDig) >=0){
			 return true;
		 }
		 else{
			 return false;
		 }
		
	}

	public static void main(String[] args) {
		int givenNum = 145;
		int givenDig = 4;
		
		Dem3.FindLargestNumLessThanGivenNumAndWithoutGivenDigit(givenNum, givenDig);
		Dem3.FindLargestNumLessThanGivenNumAndWithoutGivenDigitUsingStreams(givenNum, givenDig);
	}
}*/


// find max number from the user input:
/*public class Dem3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		
		int max = a;
		if(b > max){
			max =b;
		}
		if(c > max){
			max =c;
		}
		System.out.println(max);
		
		
		//using Math class:
		int a1 = 100;
		int b1 = 200;
		int c1 = 300;
		
		int res = Math.max(a1, b1);
		int res1 = Math.max(res, c1);
		System.out.println(res1);
	}
}*/

// find nth finonacci number:
/*public class Dem3{
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a = 0;
		int b =1;
		int start = 2;
		while(start <=n){
			int temp = b;
			b = b+a;
			a = temp;
			start++;
		}
		 System.out.println(b);
	}
}
*/
// Find the frequency of the particular number:
/*public class Dem3{
	
	//using java8 streams:
	static void FindRepetedNumFrequency(long a, int b){
		String a1 = Long.toString(a);
		char c = Character.forDigit(b, 10);
		long res = a1.chars().filter(x -> x==c).count();
		System.out.println(res);
		
	}
	
	//using loops:
	static void FindRepetedNumFrequency(long a){
		int b =5;
		
		int count =0;
		while(a > 0){
			long rem = a%10;    // givenIntVal%10 will give remainder that is nothing but last element of the given Int.
			if(rem == b){
				count++;	
			}
			a = a/10;           // givenIntVal/10 will neglect the last element of the given int.
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		long a = 13857578579l;
		Dem3.FindRepetedNumFrequency(a,b);
		Dem3.FindRepetedNumFrequency(a);
	}
}
*/

// Reverse the given interger number:

/*public class Dem3{
	public static void main(String[] args) {
		//using StringBuffer and inbuild method:
		int a = 23597;
		String b = Integer.toString(a);
		StringBuffer sb =new StringBuffer(b);
		System.out.println(Integer.parseInt(sb.reverse().toString()));
		
		// using for loop: 
		int c =23597;
		String d = String.valueOf(c);
		char[] e =d.toCharArray();
		for(int i = e.length-1 ; i>=0; i--){
			System.out.print(e[i]);
		}
		System.out.println();
		
		//using while loop:
		int f =23597;
		
		int res = 0;
		while(f >0 ){
			int rem = f%10;
			f = f/10;
			
			res = res*10+rem;
		}
		System.out.println(res);
		
	}
}*/

// calculator program:

 /*  public class Dem3{
	   public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		while(true){
		System.out.println("Welcome!!!!!!!!!!!!");
		System.out.println("Enter the operator:");
		char c = sc.next().trim().charAt(0);
		if(c == '+' || c== '-' || c == '*' || c == '/' || c == '%' ){
			System.out.println("Please enter the numbers:");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			if(c == '+'){
				ans = num1+num2;
			}
			else if(c == '-'){
				ans = num1-num2;
			}
			else if(c == '*'){
				ans = num1*num2;
			}
			else if(c == '/'){
				ans = num1/num2;
			}
			else if(c == '%'){
				ans = num1%num2;
			}
			
		}
		else if(c == 'X' || c == 'x'){
			System.out.println("exit");
			break;
		}
		else{
			System.out.println("invalid operator");
		}
		System.out.println("Answer:"+ ans);
		}
		}
   }

*/

//Bubble sort :

/*public class Dem3{
	public static void main(String[] args) {
		int[] arr = {-1, -32, 0 , 5, 5};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void bubbleSort(int[] arr) {
		boolean swapped;
		
		for(int i = 0; i< arr.length; i++){
			swapped = false;
			
			for(int j=1; j< arr.length-i; j++ ){
				
				if(arr[j] < arr[j-1]){
					int temp = arr[j]; //3
					arr[j] = arr[j-1]; // 3 - 5
					arr[j-1]= temp; // 5 -3 
					swapped = true;
				}
			}
			// if did not swapped for value of i means , the given array is already sorted.
			if(swapped == false){
				break;
			}
		}
		
	}
	
	
}
*/

// Selection sort:


/*public class Dem3{
	public static void main(String[] args) {
		int[] arr = {-1, -32, 0 , 5, 6};
		SelectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void SelectionSort(int[] arr) {
		
		for(int i = 0 ; i< arr.length; i++){
			int lastIndex = arr.length-i-1;
			int maxIndex = GetMaxIndex(arr, 0, lastIndex);
			swap(arr, maxIndex,lastIndex);
		}
		
	}
	
	static void swap(int[] arr, int max, int last){
		int temp = arr[max];
		arr[max]= arr[last];
		arr[last] = temp;
	}

	static int GetMaxIndex(int[] arr, int i, int lastIndex) {
		int max = i;
		for(int j =0; j<= lastIndex; j++){
			if(arr[max]<arr[j]){
				max = j;
			}
		}
		return max;
	}
}
*/
// string handson:
/*public class Dem3{
	public static void main(String[] args) {
		float a = 123.1278f;
		System.out.printf("%.2f", a);
		System.out.println();
		System.out.printf("%.3f",Math.PI);
		System.out.println();
		System.out.println(Math.E);
		System.out.printf("hello my name is %s and i am %s", "sriram", "cool");
	}
}*/


//1. pattern programs:


/*public class Dem3{
	public static void main(String[] args) {
		
		for(int i =1; i<=5; i++){
			for(int j =1; j<=5; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}*/

// 2) pattern :

/*public class Dem3{
	public static void main(String[] args) {
		
		for(int i =1; i<=5; i++){
			for(int j =1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
*/
//3) pattern: 

/*public class Dem3{
	public static void main(String[] args) {
		int n =5;
		for(int i =1; i<=5; i++){
			for(int j =1; j<=n; j++){
				System.out.print("*");
			}
			System.out.println();
			n--;
		}
	}
}*/

//4) pattern:

/*public class Dem3{
	public static void main(String[] args) {
		
		for(int i =1; i<=5; i++){
			for(int j =1; j<=i; j++){
				System.out.print(j+ " ");
			}
			System.out.println();
			
		}
	}
}
*/


//5) pattern:

/*public class Dem3{
	public static void main(String[] args) {
		
		for(int i =1; i<=5; i++){
			for(int j =1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
			
		}
		int n =5;
		for(int i =1; i<=5; i++){
			for(int j =1; j<=n-1; j++){
				System.out.print("*");
			}
			System.out.println();
			n--;
		}
	}
}*/

//6) pattern

/*public class Dem3{
	public static void main(String[] args) {
		int n =5;
		for(int i =1; i<=5; i++){
			for(int j =1; j<=n; j++){
				System.out.print(i +" ");
			}
			System.out.println();
			
		}
	}
}*/

//7) pattern

/*public class Dem3{
	public static void main(String[] args) {
		int n =5;
		for(int i =0; i<5; i++){
			for(int j =0; j<n; j++){
				System.out.print(j+1 +" ");
			}
			System.out.println();
			
		}
	}
}
*/
// 8) pattern
/*public class Dem3{
	public static void main(String[] args) {
		int n =5;
		for(int i =1; i<5; i++){
			for(int j =1; j<n; j++){
				if(i==1 || i==4 || j ==1 || j ==4){
					System.out.print("*");	
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
	}
}*/

// 9) pattern:

/*public class Dem3{
	public static void main(String[] args) {
		
		int i ;
		int j;
		int k;
		int n = 8;
		
		for(i=1; i<=n; i++){
			for(k=1; k<=n-i; k++){
				System.out.print(" ");
			}
			for(j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}*/

//10) pattern:

/*public class Dem3{
	public static void main(String[] args) {
		
		int i ;
		int j;
		int k;
		int n = 8;
		
		for(i=1; i<=n; i++){
			for(k=1; k<=n-i; k++){
				System.out.print(" ");
			}
			for(j=1; j<=i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}*/

//11) pattern:

/*public class Dem3{
	public static void main(String[] args) {
		int ini =1;
		for(int i = 1; i<=5; i++){
			for(int j = 1; j<=5; j++){
				if(i ==1){
					if(ini <10){
						System.out.print("0");
					}
				System.out.print(ini++ +" ");
				}
				else{
					ini = ini+i;
					if(ini <10){
						System.out.print("0");
					}
					System.out.print(ini + " ");
				}
			}
			ini = 0;
			System.out.println();
		}
	}
}*/


//13 How to find largest number less than a given number and without a given digit?

/*public class Dem3{
	public static void main(String[] args) {
		int a =145;
		int b = 4;
		
		char b1 = Character.forDigit(b, 10);
		while(true){
			if(String.valueOf(a).chars().boxed().anyMatch(x -> x ==b1)){
				a--;
			}
			else{
				System.out.println(a);
				break;
			}
		}
	}
}
*/


/*How to find all pairs of elements in an array whose sum is equal to given number?

Write a Java program to find all pairs of elements in the given array whose sum is equal to a given number. 
For example, if {4, 5, 7, 11, 9, 13, 8, 12} is an array and 20 is the given number, 
then you have to find all pairs of elements in this array whose sum must be 20. 
In this example, (9, 11), (7, 13) and (8, 12) are such pairs whose sum is 20. */


/*public class Dem3{
	public static void main(String[] args) {
		int[] a = {4, 5, 7, 11, 9, 13, 8, 12};
		int given_num = 20;
		
		Map<Integer, Integer> res = new HashMap<>();
		
		List<int[]> res1 = new ArrayList<int[]>();
		
		for(int i =0; i<a.length; i++){
			//System.out.println(i);
			for(int j =i+1; j<a.length; j++){
				if(a[i] + a[j] == given_num){
					res.put(a[i], a[j]);
					res1.add(new int[]{a[i], a[j]});
				}
			}
		}
		System.out.println("result based on map:"+ res);
		System.out.println("result baset on list: ");
		
		for(int[] p: res1){
			System.out.println(p[0]+" "+p[1]);
		}
	}
}*/

	//How to find continuous sub array whose sum is equal to given number?
	/*
	Write a Java program to find continuous sub array of the given array whose sum is equal to a given number. 
	For example, If {12, 5, 31, 9, 21, 8} is the given array and 45 is the given number, 
	then you have to find continuous sub array in this array such that whose elements add up to 45. 
	In this case, {5, 31, 9} is such sub array whose elements add up to 45. */
/*public class Dem3{
	public static void main(String[] args) {
		int[] a = {3,2,2,3,3,1};
		int given_num = 7;
		
		Map<Integer, Integer> res = new HashMap<>();
		
		List<int[]> res1 = new ArrayList<int[]>();
		
		for(int i =0; i<a.length; i++){
			//System.out.println(i);
			for(int j =i+1; j<a.length; j++){
				
				for(int k =i+2; k<a.length; k++){
					if(a[i] + a[j] + a[k] == given_num){
						//res.put(a[i], a[j]);
						res1.add(new int[]{a[i], a[j],a[k]});
					}	
				}
				
			}
		}
		//System.out.println("result based on map:"+ res);
		System.out.println("result baset on list: ");
		
		for(int[] p: res1){
			System.out.println(p[0]+" "+p[1] +" "+ p[2]);
		}
		
	}
}*/

//sliding window problem find high value of subarray:
/*public class Dem3{
	public static void main(String[] args) {
		int[] a = {3,2,2,3,3,1};
		int given_num = 3;
		
		int wsum = 0;
		int msum = Integer.MIN_VALUE;
		
		for(int i = 0; i<given_num; i++){
			wsum = wsum + a[i];
		}
		//System.out.println(wsum);
		
		for(int k = given_num; k<a.length; k++ ){
			wsum = wsum- a[k-given_num] + a[k];
			msum = Math.max(msum, wsum);
		}
		
		System.out.println(msum);
	}
}*/

//find second largest element:

/*public class Dem3{
	public static void main(String[] args) {
		int[] a = {3,4,2,1,6,2};
		
		int res =Arrays.stream(a).boxed().sorted((x,y) -> y-x).skip(1).findFirst().get();
		System.out.println(res);
	}
}
*/

// find three element sub array to sum to given number:

/*public class Dem3
{
    static void findSubArray(int[] inputArray, int inputNumber)
    {
        //Initializing 'sum' to 0
 
        int sum = 0;
 
        //Iterating through 'inputArray'
 
        for (int i = 0; i < inputArray.length; i++)
        {
            //Assigning inputArray[i] to 'sum'
 
            sum = inputArray[i];
 
            for (int j = i+1; j < inputArray.length; j++)
            {
                //Adding inputArray[j] to 'sum'
 
                sum = sum + inputArray[j];
 
                //If 'sum' is equal to 'inputNumber' then printing the sub array
 
                if(sum == inputNumber)
                {
                    System.out.println("Continuous sub array of "+Arrays.toString(inputArray)+" whose sum is "+inputNumber+" is ");
 
                    for (int k = i; k <= j; k++)
                    {
                        System.out.print(inputArray[k]+" ");
                    }
 
                    System.out.println();
                }
 
                //if 'sum' is smaller than 'inputNumber', continue the loop
 
                else if (sum < inputNumber)
                {
                    continue;
                }
 
                //if 'sum' is greater than 'inputNumber', then break the loop
 
                else if (sum > inputNumber)
                {
                    break;
                }
            }
        }
    }
 
    public static void main(String[] args)
    {
        findSubArray(new int[]{42, 15, 12, 8, 6, 32}, 26);
 
        findSubArray(new int[]{12, 5, 31, 13, 21, 8}, 49);
 
        findSubArray(new int[]{15, 51, 7, 81, 5, 11, 25}, 41);
    }
}*/

//How to remove duplicate elements from ArrayList in Java?
/*
Write a Java program to remove duplicate elements from already constructed ArrayList. 
This program is one of the collection interview programs in Java.
*/

/*public class Dem3{
	public static void main(String[] args) {
		
		ArrayList<Integer> a1 =  new ArrayList<Integer>(Arrays.asList(1,2,3,1,2,3));
		System.out.println(a1);
		
		Set<Integer> s1 = new HashSet<>(a1);
		System.out.println(s1);
		
		
		
	}
}*/


//Logic Used To Find Out Whether The Given Number Is Binary Or Not :
/*
We check each and every digit of a given number. If any digit is greater than 1, then the given number is not a binary number. 
In this program, we use two simple operators – % and /, to extract the digits from the given number. 
You may know that, if we divide any number by 10 i.e number/10, it will remove last digit from the given number and 
if you use remainder operator like number%10, it will give last digit of the given number. 
For example, if 456 is the number, then 456/10 will result 45 and 456%10 will give 6. 
We use these two techniques to extract the digits from the given number one by one and we will check whether this extracted digit is greater than 1. 
If the extracted digit is greater than 1, then we will conclude that the given number is not a binary number. */

/*public class Dem3{
	public static void main(String[] args) {
		int a = 111111;
		boolean res = CheckBinaryOrNot(a);
		System.out.println(res);
	}

	 static boolean CheckBinaryOrNot(int a) {
		int copynum = a;
		boolean res = true;
		
		while(copynum != 0){
			int temp = copynum%10;
			if(temp > 	 1){
				res = false;
				break;
			}
			else{
				copynum= copynum/10;
			}
		}
		
		
		return res;
	}
}
*/

//Check Whether One String Is Rotation Of Another?


/*public class Dem3{
	public static void main(String[] args) {
		String s1 = "JavaJ2eeStrutsHibernate";
		 
        String s2 = "J2eeStrutsHibernateJava";
        
        if(s1.length() != s1.length()){
        	System.out.println("not rotated version");
        }
        else{
        	String s3 = s1 + s1;
        	if(s3.contains(s2)){
        		System.out.println("rotated version");
        	}
        	else{
        		System.out.println("not rotated version");
        	}
        }
	}
}*/


/*Write a java program to find common elements between two arrays?
OR
Write a java program to find intersection of two arrays?*/

/*public class Dem3{
	public static void main(String[] args) {
		String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
		 
        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
        
        Set<String> res = new HashSet<>();
        
        for(int i = 0; i<s1.length; i++){
        	for(int j = 0; j< s2.length; j++){
        		if(s1[i].equals(s2[j])){
        			res.add(s1[i]);
        		}
        	}
        }
        System.out.println(res);
	}
}*/

//Java Program To Check Whether User Input Is Number Or Not

/*public class Dem3{
	public static void main(String[] args) {
		String a = "123";
		//String a = "sri";    // it might throw an exception
		try{
			int a1 = Integer.parseInt(a);
			System.out.println("the given value is an number format:"+ a1);
		}
		catch (Exception e) {
			System.out.println("the given value is not in integer type");
		}
	}
}*/

// How to reverse each word of a string in Java?
/*
Write a Java program to reverse each word of a given string. 
For example, If “Java Concept Of The Day” is input string then output should be “avaJ tpecnoC fO ehT yaD”.*/

/*public class Dem3{
	public static void main(String[] args) {
		String a ="Java Concept Of The Day";
		
		//List<Character> a1 = a.chars().mapToObj(x -> (char)x).collect(Collectors.toList());
		String[] rr = a.split(" ");
		 for(String a1 : rr){
			 System.out.println(a1);
		 }
		
		 
		for(int i = 0; i<rr.length; i++){
			for(int j =rr[i].length()-1; j>=0; j--){
				System.out.print(rr[i].charAt(j));
				
			}
			System.out.print(" ");
		}
	}
}*/


/*How to separate zeros from non-zeros in an array?

Write a Java program to separate zeros from non-zeros in the given array. 
You have to move zeros either to end of the array or bring them to beginning of the array. 
For example, if {14, 0, 5, 2, 0, 3, 0} is the given array, 
then moving zeros to end of the array will result {14, 5, 2, 3, 0, 0, 0} and bringing zeros to front will result {0, 0, 0, 14, 5, 2, 3}.*/


/*public class Dem3{
	
	public static void main(String[] args) {
		int[] a = {14, 0, 5, 2, 0, 3, 0};
		
		ArrayList<Integer> non_zero =  Arrays.stream(a).boxed().filter(x -> x !=0).collect(Collectors.toCollection(() -> new ArrayList<>()));
		ArrayList<Integer> zero =  Arrays.stream(a).boxed().filter(x -> x ==0).collect(Collectors.toCollection(() -> new ArrayList<>()));
		
		non_zero.addAll(zero);
		System.out.println(non_zero);
		
	}
}*/


// Decimal To Binary, Decimal To Octal And Decimal To HexaDecimal In Java
/*
Write a Java program to convert decimal to binary, decimal to octal and decimal to hexadecimal. 
Number conversion programs are very common Java interview programming questions for freshers. */

// Decimal To Binary:

/*public class Dem3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		
		int num = sc.nextInt();
		
		int copynum= num;
		
		int rem =0;
		String binary= "";
		
		while(num > 0){
			
			rem = num%2;
			binary = rem + binary;
			num = num/2;
		}
		System.out.println("binary equivalent of "+copynum+" is"+" "+  binary);
	}
}
*/

//Decimal To Octal


/*public class Dem3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number:");
		
		int num = sc.nextInt();
		
		int copynum = num;
		
		int rem = 0;
		
		String octal = "";
		
		while(num > 0){
			rem = num%8;
			octal = rem + octal;
			num = num/8;
			
		}
		System.out.println("octal equivalent of" + copynum+" "+" is"+" "+octal);
	}
}*/

//Decimal To HexaDecimal:

/*public class Dem3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" enter the number:");
		
		int num = sc.nextInt();
		int copynum = num;
		
		int rem =0;
		String hexad="";
		
		char[] val = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		
		while(num >0){
			rem = num%16;
			hexad = val[rem] + hexad;
			num = num/16;
		}
		System.out.println("hexadecimal equivalent of"+copynum+" "+"s"+" "+hexad);
	}
}*/

//How to find all the leaders in an integer array in Java?
/*
Write a Java program to find all the leaders in an integer array. 
An element is said to be a leader if all the elements on it’s right side are smaller than it. 
Rightmost element is always a leader. For example, if {14, 9, 11, 7, 8, 5, 3} is the given array then {14, 11, 8, 5, 3} are the leaders in this array.
*/


/*public class Dem3{
	public static void main(String[] args) {
		int[] arr = {14, 9, 11, 7, 8, 5, 3};
		List<Integer> res = new ArrayList<Integer>();
		
		for(int i = 0; i<arr.length; i++){
			boolean isLeader =true;
			for(int j =i+1; j<arr.length; j++){
				
				if(arr[i] < arr[j]){
					isLeader = false;
					break;
				}
			}
			if(isLeader){
				res.add(arr[i]);
			}
		}
		System.out.println(res);
		
	}
}
*/


/*
Take number from the user, reverse it and add it to itself. 
If the sum is not a palindrome then repeat the procedure until you get a palindrome.

For example, If 7325 is input number, then

7325 (Input Number) + 5237 (Reverse Of Input Number) = 12562

12562 + 26521 = 39083


39083 + 38093 = 77176

77176 + 67177 = 144353

144353 + 353441 = 497794 (Palindrome)

In this particular case, we got a palindrome (497794) after 5th addition. 
This method gives palindrome in few steps for almost all of the integers.


*/



/*public class Dem3{
	public static void main(String[] args) {
		int a = 1234;
		int reverse = Reverse(a);
		int count = 0;
		while(true){
			count++;
			int temp = a + Reverse(a);
			a = temp;
			int reverseTemp = Reverse(temp);
			if(temp == reverseTemp){
				System.out.println("we got a palindrome at addition of"+" "+count+"th"+ " "+temp);
				break;
			}
		}
	}
	
	static int Reverse(int a){
		 StringBuffer sb = new StringBuffer(String.valueOf(a).chars().mapToObj(x -> String.valueOf((char)x)).collect(Collectors.joining()));
	      
	      return Integer.parseInt(String.valueOf(sb.reverse()));
	}
	
}*/



/*
 How To Reverse The String With Preserving The Position Of Spaces?
 
 	Problem :
Write a java program to reverse a string with preserving the position of spaces. 
For example, if “I Am Not String” is the given string then the reverse of this string with preserving the position of spaces is “g ni rtS toNmAI”. 
Notice that the position of spaces in the original string are maintained in the reversed string also. 
That means, if the given string has a space at index 3, then there should be also a space in the reversed string at index 3.

 */


/*public class Dem3{
	public static void main(String[] args) {
		String a = "I Am Not String";
		
		char[] a1 = a.toCharArray();
		List<Character> a11 =a.chars().mapToObj(x -> (char)x).collect(Collectors.toList());
		List<Character> a2 =a.chars().mapToObj(x -> (char)x).filter(x -> x != ' ').collect(Collectors.toList());
		System.out.println(a1);
		System.out.println(a2);
		List<Integer> l1= new ArrayList<Integer>();
		for(int i =0; i<a11.size(); i++){
			if(a11.get(i) == ' '){
				l1.add(i);
			}
		}
		System.out.println(l1);
		System.out.println(a11.size());
		List<Character> res = new ArrayList<Character>();
		for(int i=a2.size()-1; i>=0; i--)
		{
		System.out.print(res.add(a2.get(i)));
			
		}
		System.out.println();
		System.out.println(res);
		for (int spaceIndex : l1) {
            res.add(spaceIndex, ' ');
        }
		
		System.out.println(res);
		String ans = res.stream().map(x -> String.valueOf(x)).collect(Collectors.joining());
		System.out.println("final result:"+ ans);
	}
	
	
}
*/


/*
 
  How To Find Percentage Of Uppercase Letters, Lowercase Letters, Digits And Special Characters In String?
  Write a java program to find the percentage of uppercase letters, lowercase letters, digits and other special characters(including space) in the given string. 
  For example, In “Tiger Runs @ The Speed Of 100 km/hour.”,
  Number of uppercase letters is 5. So percentage is 13.16%
Number of lowercase letters is 20. So percentage is 52.63%
Number of digits is 3. So percentage is 7.89%
Number of other characters is 10. So percentage is 26.32%
  
 */

/*public class Dem3{
	public static void main(String[] args) {
		String inp = "Tiger Runs @ The Speed Of 100 km/hour.";
		
		int totalChar = inp.length();
		
		int upCase = 0;
		int lowCase =0;
		int digits =0;
		int otherChar =0;
		
		for(int i =0; i<inp.length(); i++){
			char ch = inp.charAt(i);
			
			if(Character.isUpperCase(ch)){
				upCase++;
			}
			else if(Character.isLowerCase(ch)){
				lowCase++;
			}
			else if(Character.isDigit(ch)){
				digits++;
			}
			else{
				otherChar++;
			}
		}
		
		double upPercent = (upCase*100.0)/totalChar;
		double lowPercent = (lowCase*100.0)/totalChar;
		double digPercent = (digits*100.0)/totalChar;
		double otherPercent = (otherChar*100.0)/totalChar;
		
		DecimalFormat format = new DecimalFormat("##.##");
		
		System.out.println(format.format(upPercent)+"%");
		System.out.println(format.format(lowPercent)+"%");
		System.out.println(format.format(digPercent)+"%");
		System.out.println(format.format(otherPercent)+"%");
	}
}
*/


/*
 How To Launch External Applications Through Java Program
 For every java application, there is a one and only one java.lang.Runtime object associated with it. 
 This Runtime objcet is used to interact with the environment in which application is running. Application itself can’t create an instance of Runtime. 
 But, You can retrieve Runtime object associated with the appliaction using getRuntime() method of java.lang.Runtime class. 
 
 */


/*public class Dem3{
	public static void main(String[] args) {
		
		Runtime rn = Runtime.getRuntime();
		String[] s = new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe", "https://javaconceptoftheday.com/"};
		try {
			rn.exec(s);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
*/


/*
 Find missing number in an array

If ‘n‘ is the positive number and ‘a‘ is an array of integers of length ‘n-1’ containing elements from 1 to n. 
Then find the missing number in ‘a’ in the range from 1 to n. Occurrence of each element is only once. 
For example, If n = 8, then array ‘a’ will have 7 elements in the range from 1 to 8. For example {1, 4, 5, 3, 7, 8, 6}. 
One number will be missing in ‘a’ (2 in this case). You have to find out that missing number. 
 
 */

/*public class Dem3{
	public static void main(String[] args) {
		int[] arr = {1, 4, 5, 3, 7, 8, 6};
		
		List<Integer> l = Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());
		System.out.println(l);
		int nextnum = 0;
		List<Integer> l1 = new ArrayList<Integer>();
		
		for(int i=0; i <l.size(); i++){
			//System.out.println(i);
			 nextnum = nextnum+1;
			  if(l.get(i) == nextnum){
				 continue;
			 }
			 else{
				l1.add(nextnum); 
				nextnum = nextnum+1;
			 }
		}
		System.out.println(l1);
	}
}

*/

//Write a Java program to traverse the elements of a LinkedList in reverse direction?

/*public class Dem3{
	public static void main(String[] args) {
		
		LinkedList<Integer> l1 = new LinkedList<>();
		//ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
	Random r = new Random();
	System.out.println(r.nextInt(100));
	System.out.println(Math.random()*50);
	System.out.println(ThreadLocalRandom.current().nextInt(0, 100));
		Iterator<Integer> it = l1.descendingIterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
	}
}
*/


// file read and write .


/*public class Dem3{
	public static void main(String[] args) throws IOException {
		BufferedReader br =null;
		BufferedWriter bw =null;
		try {
			 br= new BufferedReader(new FileReader("C:\\Users\\srira\\Documents\\new.txt"));
			ArrayList<String> lines = new ArrayList<>();
			String currLine = br.readLine();
			while(currLine != null){
				lines.add(currLine);
				currLine = br.readLine();
			}
			Collections.sort(lines);
			
			 bw = new BufferedWriter(new FileWriter("C:\\Users\\srira\\Documents\\new1.txt"));
			for(String line : lines){
				bw.write(line);
				bw.newLine();
			}
		} catch (FileNotFoundException e) {
			
			System.out.println(e);
		}
		finally {
			br.close(); 
			bw.close();
			
		}
		
	}
}*/

//How do you find longest substring without repeating characters in a string?
/*
Write a Java program or function to find the longest substring without repeating characters in a given string. 
For example, if “javaconceptoftheday” is the input string, then the longest substring without repeating or duplicate characters is “oftheday”.
*/

/*public class Dem3 
{  
    static void longestSubstring(String inputString)
    {
        //Convert inputString to charArray
         
        char[] charArray = inputString.toCharArray();
         
        //Initialization
         
        String longestSubstring = null;
         
        int longestSubstringLength = 0;
         
        //Creating LinkedHashMap with characters as keys and their position as values.
         
        LinkedHashMap<Character, Integer> charPosMap = new LinkedHashMap<Character, Integer>();
         
        //Iterating through charArray
         
        for (int i = 0; i < charArray.length; i++) 
        {
            char ch = charArray[i];
         
            //If ch is not present in charPosMap, adding ch into charPosMap along with its position
             
            if(!charPosMap.containsKey(ch))
            {
                charPosMap.put(ch, i);
            }
             
            //If ch is already present in charPosMap, reposioning the cursor i to the position of ch and clearing the charPosMap
             
            else
            {   
                i = charPosMap.get(ch);
                 
                charPosMap.clear();
            }
             
            //Updating longestSubstring and longestSubstringLength
             
            if(charPosMap.size() > longestSubstringLength)
            {
                longestSubstringLength = charPosMap.size();
                 
                longestSubstring = charPosMap.keySet().toString();
            }
        }
         
        System.out.println("Input String : "+inputString);
         
        System.out.println("The longest substring : "+longestSubstring);
         
        System.out.println("The longest Substring Length : "+longestSubstringLength);
    }
     
    public static void main(String[] args) 
    {   
        longestSubstring("javaconceptoftheday");
         
        System.out.println("==========================");
         
        longestSubstring("thelongestsubstring");
    }   
}
*/

/*Reverse an array.

Write a Java program to reverse an array without using an additional array. 
That means your program should reverse the given array in place. 
For example, if {12, 9, 21, 17, 33, 7} is the input array, then your program should return {7, 33, 17, 21, 9, 12} as output.

*/

/*public class Dem3{
	public static void main(String[] args) {
		int[] arr = {12, 9, 21, 17, 33, 7};
		int temp;
		for(int i = 0; i< arr.length/2; i++){
			temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
*/

/*How To Swap Two String Variables Without Using Third OR Temp Variable In Java?*/

/*public class Dem3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the 1st string:");
		
		String f1 = sc.next();
		
		System.out.println("enter the 2nd string:");
		
		String s1  = sc.next();
		
		System.out.println("string befor swaping:");
		System.out.println("first:"+ f1);
		System.out.println("second:"+ s1);
		
		f1 = f1+s1;
		
		s1 = f1.substring(0, f1.length()-s1.length());
		f1 = f1.substring(s1.length());
		
		System.out.println("after swaping:");
		
		System.out.println("first:"+ f1);
		System.out.println("second:"+ s1);
		
	}
}
*/


//How To Find The Most Repeated Word In Text File In Java?

/*public class Dem3{
	public static void main(String[] args) {
		String txt = "Java JDBC JSP Servlets Struts Hibernate java Web Services Spring JSF JAVA Threads JaVa Concurrent Programming jAvA Hadoop Jdbc jsf spring Jsf jdbc hibernate";
	
	    String[] arr = txt.split(" ");
	    System.out.println(Arrays.toString(arr));
	    
	    List<String> l = Arrays.stream(arr).map(x -> x.toUpperCase()).collect(Collectors.toList());
	    System.out.println(l);
	    
	    Map<String , Long> val = l.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	    System.out.println(val);
	    
	    Map.Entry<String, Long> res = val.entrySet().stream().max(Map.Entry.comparingByValue()).orElse(null);
	    System.out.println(res.getKey());
	    System.out.println(res.getValue());
	}
}*/


//How To Remove Duplicate Elements From An Array In Java?


/*public class Dem3{
	public static void main(String[] args) {
		int[] orgArr = {4, 3, 2, 4, 9, 2};
	    ArrayList<Integer> ar = new ArrayList<>();
	   for(int a : orgArr){
		   ar.add(a);
	   }
		Map<Integer, Long> res = ar.stream()
		                                .filter(x -> Collections.frequency(ar, x)>=1).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	
	System.out.println(res);
	
	                for(Map.Entry<Integer, Long> rr : res.entrySet()){
	                	System.out.print(rr.getKey());
	                }
	}
}
*/
























