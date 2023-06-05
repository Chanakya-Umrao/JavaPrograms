package coding_questions;

public class PalindromeString {

	public static void main(String[] args) {
		System.out.println(checkPalindromeString("Hello"));
		System.out.println(checkPalindromeString("CAC"));
	}
	
	public static boolean checkPalindromeString(String str)
	{
		boolean result = true;
		int length = str.length();
		
		for(int i = 0;i<length/2;i++)
		{
			if(str.charAt(i) != str.charAt(length-i-1))
			{
				result = false;
				break;
			}
		}
		return result;
	}

}
