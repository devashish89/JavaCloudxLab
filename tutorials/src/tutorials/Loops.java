package tutorials;

public class Loops {

private int j; //instance variable not accessible inside static
public void myloop() {
	j=0;
	while(j<=5) {
		System.out.println(j);
		j++;
	}
}

public static void myStaticMethod() {
	System.out.println("hi! my static method");
}


public static void main(String[] args) {
	
	myStaticMethod(); //staticmethod();
	Loops.myStaticMethod(); //classame.staticmethod();
	new Loops().myStaticMethod(); //obj.staticmethod

	int y=2; //local variable
	int val = ++y*2;
	y=2; //reset the value to initial
	int val1 = y++*2;
	
	int z=1;
	int val2 = ++z;
	z=1; //reset the value to initial
	int val3 = z++;
	
	
	System.out.println("Preincrement:"+val);
	System.out.println("Postincrement:"+val1);
	

	System.out.println("Preincrement:"+val2);
	System.out.println("Postincrement:"+val3);
	
	System.out.println("************************************************************");
	
	//while loop
	int x=10;
	while(x<=20) {
		x++;
		System.out.println(x);
		
	}
	
	System.out.println("************************************************************");
	
	//do while
	x=10;
	
	do {
		System.out.println(x);
		++x;
		
	}while(x<=20);
	
	
	// calling function
	System.out.println("************************************************************");
	
	new Loops().myloop();
	
	//for loop 
	System.out.println("************************************************************");
	
	for (int i=1; i<=5; i++) {
		System.out.println(i);
		
	}
	
	//foreach 
	
	int[] arr = {10,20,30,40};
	String[] names = {"Deva", "Ram", "Shyam"};
	
	for(int num : arr) {
		System.out.print(num);
	}
	
	
	for(String name : names) {
		System.out.println(name);
	}
	
	System.out.println("************************************************************");
	
	//break - break out of the immediate loop
	
	for(int i: new int[]{1,2}) {
		System.out.println(i);
		for (int j: new int[] {10,20,30,40}) {
			System.out.println(j);
			if (j==30) {
				break;
			}
		}
		
		System.out.println("************************************************************");
		//continue = brings to the beginning of the flow
		
		for (int num : new int[] {1,2,3,4,5}) {
			if (num==3) {
				continue; //print of 3 will be skipped as it will take control to for loop and nothing below it will be executed
			}
			
			System.out.println(num);
		}
	}
}
}
