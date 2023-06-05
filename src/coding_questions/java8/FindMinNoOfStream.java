package coding_questions.java8;

import java.util.Comparator;
import java.util.stream.Stream;

public class FindMinNoOfStream {
	public static void main(String[] args) {
		Integer min = Stream.of(1,2,3,5,7).min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Minimum Number: " + min);
	}
}
