package coding_questions;

public class SecondHighest {

	public static void main(String[] args) {
		int[] arr = {2,5,8,4,2,8,1,35,23,52};
		System.out.println(findSecondHighest(arr));
	}
	
	public static int findSecondHighest(int[] arr)
	{
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		
		for(int i: arr)
		{
			if(i>highest)
			{
				secondHighest = highest;
				highest = i;
			}
			else if(i>secondHighest) secondHighest = i;
		}
		return secondHighest;
	}

}
