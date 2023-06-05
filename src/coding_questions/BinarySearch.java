package coding_questions;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {2,5,6,7,7,10,30,204};
		
		int n = arr.length-1;
		int result = binarySearch(arr,0,n,20);
		System.out.println("Element found at index : " + result);
	}
	
	public static int binarySearch(int[] arr, int low, int high, int key)
	{
		//int mid = (low+high)/2;
		int mid = low + (high-low)/2;
		while(low<=high)
		{
			if(arr[mid] == key) return mid;
			else if(arr[mid]>key)
			{
				high = mid - 1;
			}
			else
			{
				low = mid + 1;
			}
			mid = low + (high-low)/2;
		}
		if (low > high) {
			return -1;
		}
		return -1;
	}

}
