package tutorials;

public class HelloWorld {
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		short __ = 12;
		int $$ = 10;
		float _X = 22f;
		long $x = 34;
		
		System.out.println(__+$$+_X+$x);
		
		boolean flag = true;
		
		int octal = 0144; //0star for octal
		int hex = 0x64; //0X for hexadecimal
		System.out.println(octal +"--"+ hex);
		
		String name = "\"deva\\tshish\"\t\'nigam\'"; // \escape sequence
		
		System.out.println(name);
		
		// Java Operator precedence
		
		float val = 3+6/2*3; //if operators are at same level then left to right else the operator precedence || division-->multiply-->add
		System.out.println(val);
		
	}
}
