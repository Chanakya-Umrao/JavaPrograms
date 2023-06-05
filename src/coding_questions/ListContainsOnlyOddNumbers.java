package coding_questions;

import java.util.Arrays;
import java.util.List;

public class ListContainsOnlyOddNumbers {

	public static void main(String[] args) {
		
		Integer[] arr = {1,3,7,5,9,21,43};
		Arrays.asList(arr);
		
		List<Integer> lst = Arrays.asList(arr);
		System.out.println(onlyOddNumbers(lst));
		System.out.println(onlyOddNumbersPS(lst));
		
	}
	
	public static boolean onlyOddNumbers(List<Integer> list)
	{
		for(int i: list)
		{
			if(i%2 == 0) return false;
		}
		return true;
	}
	
	//If the list is large, you can use parallel stream for faster processing
	
	public static boolean onlyOddNumbersPS(List<Integer> list)
	{
		return list.parallelStream().anyMatch(x -> x%2 !=0);
	}

}
