package tutorials;

import java.text.SimpleDateFormat;
import java.util.Date;



public class DateTime 
{
	public static void main(String[] args) 
	{
		Date dNow = new Date();
		System.out.println(dNow);
		
		
		SimpleDateFormat ft = new SimpleDateFormat("E dd/MMM/yyyy HH:mm:ss");
		System.out.println(ft.format(dNow));
	}
}
