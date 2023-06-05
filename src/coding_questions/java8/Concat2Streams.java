package coding_questions.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Concat2Streams {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		List<Integer> list2 = Arrays.asList(6,7,8);
		Stream<Integer> concatStream = Stream.concat(list1.stream(), list2.stream());
		concatStream.forEach(System.out::println);
	}
}
