package coding_questions;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		System.out.println(removeWhiteSpaces("Chanakya Umrao"));
	}
	
	public static String removeWhiteSpaces(String str)
	{
		StringBuilder result = new StringBuilder();
		
		char[] charArr = str.toCharArray();
		
		for(char c: charArr)
		{
			if(!Character.isWhitespace(c)) result.append(c);
		}
		return result.toString();
	}

}
