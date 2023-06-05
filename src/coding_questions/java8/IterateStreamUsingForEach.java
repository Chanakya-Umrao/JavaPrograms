package coding_questions.java8;

import java.util.Arrays;
import java.util.List;

public class IterateStreamUsingForEach {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,4,6,7,23,5);
		list.stream().forEach(System.out::println);
	}

}
