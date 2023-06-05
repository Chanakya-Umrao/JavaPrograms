package coding_questions;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfChar {

	public static void main(String[] args) {
		String str = "ChanakyaUmrao";
		char[] chars = str.toCharArray();
		
		Map<Character,Integer> freq = new HashMap<>();
		
		for(char c: chars)
		{
			if(freq.containsKey(c))
			{
				
				freq.put(c, freq.get(c) + 1);
			}
			else
			{
				freq.put(c, 1);
			}
		}
		
		System.out.println(freq);
	}
	
}
