package tutorials;
import java.util.ArrayList;
import java.util.Arrays;

public class ArraysOperations 
{

	public static void main(String[] args)
	{
		int[] arr = {10,32,12,45,1};
		
		Arrays.sort(arr); //sort array
		
		//print array
		System.out.println(Arrays.toString(arr));
		
		//binary search to work array must be sorted
		int ind = Arrays.binarySearch(arr, 32); //return index of 32
		System.out.println(ind);
		
		int idx = Arrays.binarySearch(arr, 9); //9 does not exist in array
		System.out.println(idx);  // -2 because 9 doesn't exist; location of insert (abs(output)-1) = 2-1 = 1
		
		int idx1 = Arrays.binarySearch(arr, 40); //40 not there in array, so output would be -5 becoz (abs(-5) -1) = 4 (insert location for 40)
		System.out.println(idx1);
		
		 Arrays.fill(arr, 2);
		System.out.println(Arrays.toString(arr));
		
		int[] arr12 = Arrays.copyOf(arr, 10);
		System.out.println(Arrays.toString(arr12));
		
		// Array of Class Objects
		
		Dogs[] arr1 = {new Dogs("Tommy", "Indian"), new Dogs("Sunny", "German Shepherd")};
		
		for (Dogs d : arr1) 
		{
			d.bark();
		}
		
		//ArrayList of class objects
		ArrayList<Dogs> arr2 = new ArrayList<Dogs>();
		arr2.add(new Dogs("Mona", "B1"));
		arr2.add(new Dogs("Sona", "B2"));
		
		for (Dogs d1: arr2) 
		{
			d1.bark();
		}
	}
}
