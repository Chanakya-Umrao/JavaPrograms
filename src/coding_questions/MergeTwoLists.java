package coding_questions;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoLists {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(10);
		list2.add(11);
		
		List<Integer> mergedList = new ArrayList<>(list1);
		mergedList.addAll(list2);
		
		System.out.println(mergedList);
	}

}
