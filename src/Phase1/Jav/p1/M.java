package Phase1.Jav.p1;

public class M {
	private int m1 =10;
	long m2= 456789;
	protected float m3= 4.7f;
	
	
	
	
	
	public void publicmethod() {
		System.out.println("This is the Public method");
		
		privatemethod();
		System.out.println("This is the Variable 1 of class M: " +m1);
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
		
		System.out.println("This is the Private method Call");
	}

}
