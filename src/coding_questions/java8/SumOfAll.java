package coding_questions.java8;

import java.util.Arrays;
import java.util.List;

public class SumOfAll {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,60);
		System.out.println(list.stream().mapToInt(Integer::intValue).sum());
	}

}
