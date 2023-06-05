package coding_questions.java8;

import java.util.Comparator;
import java.util.stream.Stream;

public class FindMaxNoOfStream {

	public static void main(String[] args) {
		Integer max = Stream.of(1,2,4,5,6,7,8).max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Maximum Number: " + max);
	}

}
