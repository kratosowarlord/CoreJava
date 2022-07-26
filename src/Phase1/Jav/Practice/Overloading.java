package Phase1.Jav.Practice;

public class Overloading {
	
	public void calculate(int a, int b) {
		int c = a+b;
		System.out.println("The addition of the two number is : " +c);
	}
	
	public void calculate(long r) {
		
		System.out.println("The are of the circle is : " + ((r*r)*Math.PI));
		
	}
	
	public void calculate(float l, float w) {
		System.out.println("The are of rectangle is : " +(l*w));
		
	}
	
	public void calculate(int a) {
		System.out.println("The are of square is : " +(a*a));
		
	}
	
	
	public static void main(String[] args) {
		
		Overloading o = new Overloading();
		
		o.calculate(34, 760);
		o.calculate(5l);
		o.calculate(3f,4f);
		o.calculate(8);
	}

}
