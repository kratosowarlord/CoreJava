package Phase1.Jav.Projects;

public class Strings {

	public static void main(String[] args) {

		// String Methods
		String st = new String("Hello World");
		System.out.println(st.length());

		// Sub string
		String sub = new String("This is a Sub String Method");
		System.out.println(sub.substring(2, 6));

		// String Compare
		String c1 = "Compore";
		String c2 = "Compare";

		System.out.println(c1.compareTo(c2));

		// IsEmpty

		String ie = "";
		System.out.println(ie.isEmpty());

		// toLowecase

		String tl = "JAJS";
		System.out.println(tl.toLowerCase());

		// equals
		String x = "Welcome to Java";
		String y = "WeLcOmE tO JaVa";
		System.out.println(x.equals(y));

		// Creating StringBuffer and append method
		StringBuffer s = new StringBuffer("Welcome to Java!");
		s.append("Enjoy your learning");
		System.out.println(s);

		// insert method
		s.insert(0, 'w');
		System.out.println(s);

		// replace method
		StringBuffer sb = new StringBuffer("Hello");
		sb.replace(0, 2, "hEl");
		System.out.println(sb);

		// delete method
		sb.delete(0, 1);
		System.out.println(sb);

		// StringBuilder
		System.out.println("\n");
		System.out.println("Creating StringBuilder");
		StringBuilder sb1 = new StringBuilder("Happy");
		sb1.append("Learning");
		System.out.println(sb1);

		System.out.println(sb1.delete(0, 1));

		System.out.println(sb1.insert(1, "Welcome"));

		System.out.println(sb1.reverse());

		// conversion
		System.out.println("\n");
		System.out.println("Conversion of Strings to StringBuffer and StringBuilder");

		String str = "Hello";

		// conversion from String object to StringBuffer
		StringBuffer sbr = new StringBuffer(str);
		sbr.reverse();
		System.out.println("String to StringBuffer");
		System.out.println(sbr);

		// conversion from String object to StringBuilder
		StringBuilder sbl = new StringBuilder(str);
		sbl.append("world");

	}

}
