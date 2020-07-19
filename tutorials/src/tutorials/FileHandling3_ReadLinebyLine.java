package tutorials;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileHandling3_ReadLinebyLine 
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader cin = null;
		try 
		{
			
			cin = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(cin);
			
			System.out.println("Enter the lines and type quit to exit");
			
			String line;
			
			{
				line = br.readLine();
				System.out.println(line);
			}while(! line.equals("quit"));
			
			
		}
		finally 
		{
			if (cin != null) {
				cin.close();
			}
		}
	}
}
