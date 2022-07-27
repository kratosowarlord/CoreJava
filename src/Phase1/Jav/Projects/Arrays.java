package Phase1.Jav.Projects;

public class Arrays {

	public static void main(String[] args) {

		// Single dimension array

		int a[] = { 10, 11, 12, 13, 14, 15 };

		for (int i = 0; i < a.length; i++) {

			System.out.println("The ararys are as following : " + a[i]);
		}

		// Multi dimension Array

		int[][] arr = { { 1, 2 }, { 3, 4 } };

		System.out.println("the length of the rows are as follows : " + arr[0].length);

		System.out.println("arr[0][0] = " + arr[0][0]);

	}

}
