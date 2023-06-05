package coding_questions.java8;

import java.util.Random;

public class Print10RandomnoUsingForEach {
	public static void main(String[] args) {    
	    Random random = new Random();
	    random.ints().limit(10).forEach(System.out::println);
	  }    
}
