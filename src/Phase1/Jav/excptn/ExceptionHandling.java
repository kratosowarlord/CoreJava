package Phase1.Jav.excptn;

public class ExceptionHandling {

	public static void main(String[] args) {
		int num1, num2, result;
		num1 = 98;
		num2 = 0;

		try {

			result = num1 / num2;
		}

		catch (NullPointerException ae) {

			System.err.println(ae.getMessage());
		}

		catch (Exception e) {

			System.out.println("Exception(Parent)");

			System.out.println(e.getMessage());
		}

		finally {

			result = num1 + num2;
			System.out.println("This is a final block with result " + result);

		}
	}

}
