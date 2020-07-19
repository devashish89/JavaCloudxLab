package tutorials;

import java.io.File;

public class FileAndDirectory 
{
	//recursive func
	public static void filepaths(File file) {
		String[] paths = file.list();
		
		for (String path : paths) {
			System.out.println(path);
			File f = new File(file, path); // file: parent dir obj and path: child dir obj
			if (f.isDirectory()) {
				System.out.println("****");
				filepaths(f);
			}
		}
	}
	
	public static void main(String[] args) 
	{
		File file = new File("tmp");
		file.mkdir(); //created tmp folder
		System.out.println(file.isDirectory());
		System.out.println(file.getPath());
		
		File file1 = new File(file, "x"); //create directory:x under tmp
		file1.mkdir();
		
		filepaths(file);
				
	}

}
 