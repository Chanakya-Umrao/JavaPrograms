package coding_questions.java8;

import java.util.StringJoiner;

public class AddPreSufToString {

	public static void main(String[] args) {
		StringJoiner stringJoiner = new StringJoiner(",","#","#");
		stringJoiner.add("Chanakya");
		stringJoiner.add("Umrao");
		System.out.println("After adding # prefix and suffix");
		System.out.println(stringJoiner);
	}

}
