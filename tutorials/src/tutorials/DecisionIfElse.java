package tutorials;

public class DecisionIfElse 
{
public static void main(String[] args) 
{
	//if else if else
	
		int x=10;
		
		if (x==2) 
		{
			System.out.println("2");
		}
		else if (x==5)
		{
			System.out.println("5");
		}
		
		else 
		{
			System.out.println("10");
		}
		
		System.out.println("*****************************************************");
		//case
		char grade = 'A';
		
		switch(grade) 
		{
		
		case 'O':
			System.out.println("Outstanding");
			break;
		
		case 'A':
		
		case 'B':
			System.out.println("Good");
			break;
			
		case 'C':
			System.out.println("Work Hard");
			break;
			
		case 'D':
			System.out.println("Passed");
			break;
			
		case 'F':
			System.out.println("Failed!");
			break;
		
		default:
			System.out.println("Invalid Grade");
		}
		
		System.out.println("Your grade is:"+grade);
		
		
		System.out.println("*****************************************************");
		//case
		int num=12;
		switch(num%2) {
		case 0:
			System.out.println("even");
			break;
		case 1:
			System.out.println("odd");
			break;
		}
}
	
}
