package coding_questions.java8;

import java.util.Arrays;
import java.util.List;

public class CubeAndFilter {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,4,6,8,3);
		list.stream().map(i -> i*i*i).filter(i -> i>50).forEach(System.out::println);
	}

}
