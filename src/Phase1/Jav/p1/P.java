package Phase1.Jav.p1;

public class P {

	public void publicmethod() {
		System.out.println("This is the Public method");
		
		privatemethod();
		
	}
	
	protected void protectedmethod() {
		
		System.out.println("This is the Protected method of Class P");
		privatemethod();
		
	}
	
	void defaultmethod() {
		
		System.out.println("This is the Default method of Class P");
		privatemethod();
	}
	
	private void privatemethod() {
		
		System.out.println("This is the Private method Of Class P");
	}
	
	
	
	
	public static void main(String[] args) {
		new M().publicmethod();
		System.out.println("This is the variable 2 of Class M : " +new M().m2);
		System.out.println("This is the variable 3 of Class M : " +new M().m3);
		System.out.println("This is the variable 1 of Class N : " +new N().n1);
		System.out.println("This is the variable 2 of Class N : " +new N().n2);
		System.out.println("This is the variable 3 of Class N : " +new N().n3);
		
	}
}
