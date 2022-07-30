package Phase1.Jav.excptn;

import java.io.IOException;
import java.util.Scanner;

public class Exceptnhandlingexp {
	
	
	public static int display(int l,int b) throws IOException {
		
		if(l>b) {
			
			throw new IOException("Invalid values ,Length is greater than breadth");
		}
			
		else{
				System.out.println("Values are correct");
			}
			
			return l*b;
			
		}
	
	
	
	public static void main(String[] args) throws IOException {
		
		
		int result=0;
		   Scanner scanner = new Scanner(System.in);  // taking user input from console
	       
	       System.out.println("Enter length : ");
	       int l = scanner.nextInt();
	       
	       System.out.println("Enter breadth : ");
	       int b = scanner.nextInt();
	      
	       try{
	    	  result =display(l,b);
	       }
	       catch(IOException ae)
	       {
	    	   System.out.println(ae.getMessage());
	       }
	       
	       System.out.println("Result is : "+result);
	}
	}


