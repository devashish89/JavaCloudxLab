package tutorials;

import java.util.Arrays;
import java.util.List;

public class ArrayList {
	
	public static void main(String[] args) {
		java.util.ArrayList<String> al = new java.util.ArrayList<String>();
		System.out.println("Initial Size:"+al.size());
		al.add("help1");
		al.add("hello2");
		al.add(1, "hello");
		al.add("100");
		al.add("200");
		
		System.out.println("Final size:"+al.size());
		al.remove("100");
		al.remove(1);
		System.out.println(al);
	}
}