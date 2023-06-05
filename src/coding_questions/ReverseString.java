package coding_questions;

public class ReverseString {
	
	public static void main(String[] args)
	{
		String str = "Chanakya Umrao";
		System.out.println(reverse(str));
	}
	
	public static String reverse(String str)
	{
		if(str == null) throw new IllegalArgumentException("Null is not valid input");
		
		StringBuilder out = new StringBuilder();
		
		char[] temp = str.toCharArray();
		
		for(int i = temp.length-1;i>=0;i--)
		{
			out.append(temp[i]);
		}
		
		return out.toString();
	}
}
