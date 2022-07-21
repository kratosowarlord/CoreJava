package Phase1.Java.p2;

import Phase1.Java.p1.N;


public class Y extends N {
	
	
	public static void main(String[] args) {
		
		new Y().publicmethod();
		new Y().protectedmethod();
		
	System.out.println("/n");
		
		
		// X variables
		
		new X().publicbroadcast();
		System.out.println("The Variable of 2 is " +new X().x2);
		System.out.println("The Variable of 3 is " +new X().x3);
		System.out.println("The Variable of 4 is " +new X().x4);
	}
	
	

}
