package tutorials;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class FileHandling2
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader in  = null;
		
		try 
		{
			in = new InputStreamReader(System.in); //input from console
			System.out.println("enter characters, 'q' to quit");
			
			char c;
			while((c = (char) in.read())!='q')
			{
				System.out.println(c);
			}
			
		}
		finally 
		{
			if(in==null)
			{
				in.close();
			}
		}
	}
}
