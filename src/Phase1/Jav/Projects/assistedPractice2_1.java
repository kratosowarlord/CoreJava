package Phase1.Jav.Projects;




class defModifier{
	

	//Default Access Modifier
	
	void defaultModifier() {
		
		System.out.println("This is a Default Access Modifier!!");
	}
	
}

public class assistedPractice2_1 {
	
	
	
	// Private Access Modifier
	
	
	private void privateModifier() {
		
		System.out.println("This is a Private Access Modifier Called in Public Modifier!!");
	}
	
	
	//Protected Modifier
	
	
	protected void ProModifier() {
		
		System.out.println("This is a Protected Access Modifier!!");
		
		
	}
	
	
	public void PublicModifier() {
		
		System.out.println("This is a Public Access Modifier!!");
		
		privateModifier();
	}
	
	
	
	public static void main(String[] args) {
		
		
		defModifier def = new defModifier();
		
		def.defaultModifier();
	
	}
	

}
