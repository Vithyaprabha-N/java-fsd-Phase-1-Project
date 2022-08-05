package FinalProject;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Deleteafile {
	void deletefile() throws IOException {
		String path="E:\\mphasis\\";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the filename to delete");
		String filename=sc.next();
		String finalpath=path+filename;
		File f=new File(finalpath);
		//delete operation
		f.delete();
		System.out.println("file gets deleted");
		
	}

}


