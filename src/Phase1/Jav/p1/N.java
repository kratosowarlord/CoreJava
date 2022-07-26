package Phase1.Jav.p1;

public class N {
	
	
	protected long n1 = 12343232;
	public int n2= 1234;
	double n3=1234.567;
	
	public void publicmethod() {
		System.out.println("This is the Public method");
		
		privatemethod();
		
	}
	
	protected void protectedmethod() {
		
		System.out.println("This is the Protected method");
		privatemethod();
		
	}
	
	void defaultmethod() {
		
		System.out.println("This is the Default method");
		privatemethod();
	}
	
	private void privatemethod() {
		
		System.out.println("This is the Private method");
	}

}
