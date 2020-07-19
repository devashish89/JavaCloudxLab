package tutorials;

import java.awt.List;

public class StringAndStringBuilderOperations 
{
	
	public static void main(String[] args) 
	{
		//strings are immutable datatype
		char[] arr = {'h', 'e', 'l', 'l', 'o'};
		
		String s = new String(arr);
		System.out.println(s);
		
		s = s.replace('h', 'H');
		s = s.replaceAll("[aeiou]","_"); //regex
		System.out.println(s);
		char val = s.charAt(1); //char at index
		System.out.println("Character @ index 1: "+val);
	
		char[] temp = new char[s.length()]; 
		
		//reverse
		int j=0;
		for (int i = s.length()-1; i>=0; i--)
		{
			temp[j] = s.charAt(i);
			j++;
		}
		System.out.println(new String(temp));
		
		s = s.toLowerCase();
		System.out.println("Index of \'_\' in string: "+s.indexOf('_')); //first occurrence of character
		
		System.out.println(s);
		
		String s1 = s.substring(0,3);
		System.out.println(s1);
		
		System.out.println("*********************************************");
		//StringBuilder in case you want mutable strings
		StringBuilder sb = new StringBuilder("hello");
		sb.append("Devashish");
		sb.insert(5, "! ");
		System.out.println(sb);
		
		sb.delete(1, 3);
		System.out.println(sb);
		
	}
	

}
