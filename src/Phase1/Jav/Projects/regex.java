package Phase1.Jav.Projects;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
	
	public static void main(String[] args) {

		String pattern = "[a-z]+";
		String check = "Hello World";
		
		Pattern p = Pattern.compile(pattern);
		Matcher c = p.matcher(check);
		
		while (c.find())
	      	System.out.println( check.substring( c.start(), c.end() ) );
		}


}
