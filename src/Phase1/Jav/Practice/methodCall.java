package Phase1.Jav.Practice;

public class methodCall {
	
	int value1 =170;
	
	public int operation(int value) {
		
		return value1 = value1*10/100;
	}
	
	
	
	public static void main(String[] args) {
		
		
		methodCall call = new methodCall();
		
		System.out.println("Calling before operation " +call.value1);
		
		call.operation(100);
		
		System.out.println("After the operation :" +call.value1);
	}

}
