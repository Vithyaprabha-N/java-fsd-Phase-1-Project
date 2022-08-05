package FinalProject;

import java.io.IOException;
import java.util.Scanner;
public class PracticeCode {
      public static void main(String[]args)throws IOException{
    	  Scanner sc=new Scanner(System.in);
    	  
    	  Addnewfile a=new Addnewfile();
    	  Deleteafile del=new Deleteafile();
    	  Searchthefile s=new Searchthefile();
    	  Displaythefile d=new Displaythefile();
    	  
    	 
    	  
           while(true) {
        	   System.out.println("Enter your option main switch case");
         	  int code1=sc.nextInt();
        	   switch(code1) {
        	   case 1:d.displayfile();
        	         break;
        	   case 2: while(true) {
        		   System.out.println("Enter youur option for sub switch case");
        		   int code2 =sc.nextInt();
        		   switch(code2) {
        		     case 1:a.addfile();
        		     break;
        		     case 2:del.deletefile();
        		     break;
        		     case 3:s.searchfile();
        		     break;
        		     case 4:System.exit(0);
        		     break;
        		   }
        	   }
        	   case 3:System.exit(0);
        	   }
           }
      }
}
