package tutorials;

import java.util.Arrays;

public class Swap {
	
	public static void swap(int x, int y) {
		int tmp = x;
		x=y;
		y=tmp;
		
		System.out.println("x:"+x+"--"+"y:"+y);
	}
	
	public static void swap(int[] arr) {
		int tmp=arr[0];
		arr[0] = arr[1];
		arr[1] = tmp;
		
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		
		swap(10,20);
		swap(new int[]{20,30});
		
	}

}
