package coding_questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraySameElements {

	public static void main(String[] args) {
		
		Integer[] a1 = {1,2,3,2,1};
		Integer[] a2 = {1,2,3};
		Integer[] a3 = {1,2,3,4};
		
		System.out.println(sameElements(a1, a2));
		System.out.println(sameElements(a1, a3));
	}
	
	public static boolean sameElements(Object[] arr1, Object[] arr2)
	{
		Set<Object> uniqueElements1 = new HashSet<>(Arrays.asList(arr1));
		Set<Object> uniqueElements2 = new HashSet<>(Arrays.asList(arr2));
		
		if(uniqueElements1.size() != uniqueElements2.size()) return false;
		
		for(Object obj : uniqueElements1)
		{
			if(!uniqueElements2.contains(obj)) return false;
		}
		return true;
	}

}
