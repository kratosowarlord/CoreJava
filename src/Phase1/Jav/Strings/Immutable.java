package Phase1.Jav.Strings;

public class Immutable {


	public static void main(String[] args) {



		String t= "Delhi";   
		String o = "Mumbai"; 
		String k= "delhi";   
		String y= new String ("Mumbai");   
		String l= new String ("delhi");  
		String p = new String("Hello");  




		/*2) y with p
	(3) t with o
	(4) k with y
	(5) p with y

		 */


		if(o.equals(l)) {

			System.out.println("True");

		}else {
			System.out.println("False");

		}

		if(y.equals(p)) {
			System.out.println("True");

		}else {
			System.out.println("False");

		}


		if(t==o) {
			System.out.println("True");

		}else {
			System.out.println("False");


		}


		if(k.equals(y)) {

			System.out.println("True");

		}else {
			System.out.println("False");
		}


		if(p.equals(y)) {
			System.out.println("True");

		}else {
			System.out.println("False");


		}

	}

}

