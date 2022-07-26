package Phase1.Jav.Practice;

public class TypecastingJava {
	
	public static void main(String[] args) {
		
		
		//Float to long 
		
		float f = 21.4566f;
		
		
		long l = (long) f;
		System.out.println("The following is typecasted from float to long: " + l);
		
		
		//double >> long >> int >> char
		
		double vardouble = 1213.123;
		
		long varlong = (long) vardouble;
		
		int varint = (int) varlong;
		
		System.out.println("The value of char is : " +varint);
		
		char varchar = (char) varint;
		
		System.out.println("The value conversion  of double to long to int to char is : " +varchar);
		
		
		
		// long to byte 
		
		long varlong1 = 212121212;
		
		byte varbyte1 =  (byte) varlong1;
		
		System.out.println("The Value conversion of long to byte is : " +varbyte1);
		
		
		
		//int >> double >> long 
		
		
		int varint2 = 1234455;
		
		double vardouble2 = varint2;
		
		long varlong2 = (long) vardouble2;
		
		System.out.println("The value of conversion from int to double to long : " +varlong2);
		
		
		
	}

}
