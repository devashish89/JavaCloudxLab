package tutorials;

import java.lang.management.PlatformManagedObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cat extends Object implements Comparable<Cat>{
	
	private int ht;
	private String name;
	
	Cat(String name,int ht) {
		this.name = name;
		this.ht = ht;
	
	}

	@Override
	public int compareTo(Cat o) {
		// TODO Auto-generated method stub
		return this.ht - o.ht;
	}
	
	public String toString() {
		return this.name;
	}
	
	
	public static void main(String[] args) {
		Cat c1 = new Cat("Ram", 20);
		Cat c2 = new Cat("Shyam", 12);
		Cat c3 = new Cat("Mohan", 15);
		
		ArrayList<Cat> cl = new ArrayList<Cat>(); //type safe Array List
		cl.add(c1);
		cl.add(c2);
		cl.add(c3);
		
		System.out.println(c1.toString());
		
		Collections.sort(cl); //Sort Collections 
		System.out.println(cl);
		
		Collections.reverse(cl);
		System.out.println(cl);
		
		List lst = new ArrayList(); //generics: class used for diff datatypes and also enforcing type security
		lst.add("hello");
		lst.add(1);
		lst.add(new Cat("Gigg", 10));
		
		System.out.println(lst.toString());
		
	}
	

}
