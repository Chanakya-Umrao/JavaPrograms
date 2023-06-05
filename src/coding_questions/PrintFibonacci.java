package coding_questions;

public class PrintFibonacci {

	public static void main(String[] args) {
		printFibonacciSequence(10);
	}
	
	public static void printFibonacciSequence(int n)
	{
		int a = 0, b = 1, c = 1;
	
		for(int i = 1;i<=n;i++)
		{
			System.out.print(a + ", ");
			a = b;
			b = c;
			c = a + b;
		}
		
	}

}
