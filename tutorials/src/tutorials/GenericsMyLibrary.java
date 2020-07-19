package tutorials;

import java.util.ArrayList;
import java.util.List;

public class GenericsMyLibrary <T>{

	public List<T> reverse(List<T> arr){
		int i;
		List tmp = new ArrayList<T>();
		
		for (i=arr.size()-1; i>=0; i--) {
			tmp.add(arr.toArray()[i]);
		}
		return tmp;
		
	}
	
	
	public static void main(String[] args) {
		
		List arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(20);
		arr.add(19);
		arr.add(1, -1);
		GenericsMyLibrary<Integer> ll = new GenericsMyLibrary<Integer>();
		List<Integer> tmp = ll.reverse(arr);
		System.out.println(tmp.toString());;
	}
}
