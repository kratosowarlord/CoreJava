package Phase1.Jav.Projects;

public class try_catch {
public static void main(String[] args) {
	

	int num1, num2,result;
	num1=98;num2=0;

	try
	{

		result = num1 / num2;
	}

	catch(
			ArithmeticException ae)
	{

		System.err.println(ae.getMessage());
	}

	

}

}


