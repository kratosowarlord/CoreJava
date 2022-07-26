package Phase1.Jav.Projects;

public class assistedProject3 {
	
	int num = 45;
	
	
	//Implementing the Method 
	
	
	public int remainderFunction(int a,int b) {
		
		
		int rem = a%b;
		
		return rem;
		
		
	}
	
	
	public int multiply(int num) {
		
	  return 	num *= num;
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		assistedProject3 remainder = new assistedProject3();
		
		
		System.out.println(remainder.remainderFunction(566, 3));
		
		
		
		System.out.println("Checking before operation " +remainder.num);
		
		remainder.multiply(remainder.num);
		System.out.println("After the method call :"+remainder.num);
	}
	

}
