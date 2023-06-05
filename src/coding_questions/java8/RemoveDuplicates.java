package coding_questions.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,1,2,3);
		list.stream().collect(Collectors.toSet()).forEach(System.out::println);
	}
}
