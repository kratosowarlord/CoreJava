package Phase1.Jav.Projects;

public class Typecasting {

	public static void main(String[] args) {


// Implicit Typecasting 
		
		System.out.println("********Implicit Typecasting Starts********");


		byte tcByte = 120;
		
		System.out.println(tcByte);

		// byte to short

		short tcShort = tcByte;
		
		System.out.println(tcShort);

		// short to Int

		int tcInt = tcShort;
		
		System.out.println(tcInt);

		// Int to long

		long tcLong = tcInt;
		
		System.out.println(tcLong);

		// Long to Float

		float tcFloat = tcLong;
		
		System.out.println(tcFloat);


		// Float to Double 

		double tcDouble = tcFloat;
		
		System.out.println(tcDouble);
		
		System.out.println();



// Explicit Typecasting
		
		System.out.println("********Explicit Typecasting Starts********");


		double d = 12345678.9876;
		
		System.out.println(d);

		// Double to Float

		float tcFloat1 = (float) d;
		
		System.out.println(tcFloat1);


		// Float to long 

		long tcLong1 = (long) tcFloat1;
		
		System.out.println(tcLong1);


		// Long to Int 

		int tcInt1 = (int)tcLong1;
		
		System.out.println(tcInt1);

		// Int to Short 

		short tcShort1 = (short) tcInt1;
		
		System.out.println(tcShort1);

		// Short to byte

		byte tcByte1 = (byte) tcShort1;
		
		System.out.println(tcByte1);






	}

}
