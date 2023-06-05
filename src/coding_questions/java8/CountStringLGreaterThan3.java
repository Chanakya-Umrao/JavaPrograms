package coding_questions.java8;

import java.util.Arrays;
import java.util.List;

public class CountStringLGreaterThan3 {

	public static void main(String[] args) {
		List<String> stringList = Arrays.asList("Chanakya", "Umrao", "Rohan", "Umrao","of");
		long count = stringList.stream().filter(str -> str.length()>3).count();
		System.out.println("Strings with length greater than 3: " + count);
	}

}
