package Phase1.Jav.Strings;

public class stringBuffer {
	
	
	public static void main(String[] args) {
		
		
		
		StringBuffer s = new StringBuffer("Started Java");
		
		s.append("Phase1 ");        //now original string is changed  
		System.out.println(s);  
		
		s.delete(2,5);  
		System.out.println(s);
		//prints Hello Java  
		
		s.replace(5,9,"Python ");  
		System.out.println(s);
		
		s.insert(5,"Language ");     //now original string is changed  
		System.out.println(s);  
		
		
		s.reverse();  
		System.out.println(s);
		
		System.out.println(s.charAt(9));
		
//		StringBuilder ss = new StringBuilder("Core");
//		
//		System.out.println(">>>>>>>"+ ss);
//		ss.append("Java");
//		System.out.println(">>>>>>>"+ ss);
//		System.out.println(ss.length());
//		System.out.println(ss.charAt(6));
//		System.out.println(ss.reverse());
		
		
	}

}
