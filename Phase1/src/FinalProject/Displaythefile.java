package FinalProject;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Displaythefile{
void displayfile() throws IOException {
		String path="E:\\mphasis\\";
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the filename to search");
//		String filename=sc.next();
		File f=new File(path);
		//display operation
		File filenames[]=f.listFiles();
		for(File ff:filenames) {
			System.out.println(ff.getName());
		}
		
	}

}


