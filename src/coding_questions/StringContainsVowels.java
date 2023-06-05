package coding_questions;

public class StringContainsVowels {

	public static void main(String[] args) {
		System.out.println(stringContainsVowels("Chanakya"));
		System.out.println(stringContainsVowels("TV"));
	}
	
	public static boolean stringContainsVowels(String str)
	{
		//regex
		return str.toLowerCase().matches(".*[aeiou].*");
	}

}
