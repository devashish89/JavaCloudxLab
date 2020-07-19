package tutorials;

public class ExceptionHandling 
{
	public static void main(String[] args)
	{
		try 
		{
			double e = 10/0;
		}
		catch(Exception e)
		{
			System.out.println("Catch block1: "+e);
		}
		finally
		{
			System.out.println("Finally block1");
		}
		
		System.out.println("*****************************************");
		
		try {
			int[] arr = {1,2};
			
			System.out.println(arr[3]); //Index Out of Bound Error
		}
		catch (ArrayIndexOutOfBoundsException o) {
			System.out.println("Catch Block2: "+o);
		}
		finally {
			System.out.println("Finally block2");
		}
		
		System.out.println("*****************************************");
		
		
	}

}	
	
