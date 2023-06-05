package coding_questions.java8;

import java.util.Arrays;
import java.util.List;

public class Sort {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,4,61,12,21,73,1);
		list.stream().sorted().forEach(System.out::println);
	}

}
