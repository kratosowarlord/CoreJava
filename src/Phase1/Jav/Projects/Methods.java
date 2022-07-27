package Phase1.Jav.Projects;

public class Methods {
	
	int num = 45;
	
	
	//Implementing the Method for 
	
	
	public int remainderFunction(int a,int b) {
		
		
		int rem = a%b;
		
		return rem;
		
		
	}
	
	//Call by value
	
	public int multiply(int number) {
		
	  return num *= num;
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		Methods remainder = new Methods();
		
		
		System.out.println(remainder.remainderFunction(566, 3));
		
		
		
		System.out.println("Checking before operation " +remainder.num);
		
		remainder.multiply(remainder.num);
		
		System.out.println("After the method call :"+remainder.num);
	}
	

}
