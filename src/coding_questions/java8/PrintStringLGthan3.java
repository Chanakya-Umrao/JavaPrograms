package coding_questions.java8;

import java.util.Arrays;
import java.util.List;

public class PrintStringLGthan3 {

	public static void main(String[] args) {
		List<String> stringList = Arrays.asList("Chanakya", "Umrao", "Rohan", "Umrao","of");
		stringList.stream().filter(s -> s.length() > 3).forEach(System.out::println);
	}
}
