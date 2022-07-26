package Phase1.Jav.Practice;

public class AccessModifier {
	
	
	private int i =10;
	
	long l = 12121212;
	
	
	public void publicmethod() {
		System.out.println("This is the Public method");
		
		privatemethod();
		System.out.println(i);
		
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
