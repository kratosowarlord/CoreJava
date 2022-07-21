package Phase1.Java.Constructor;

public class calculateArea {
	
	int side;
	int width;
	int length;
	float radius;
	int base;
	int height;
	int diagnol1;
	int diagnol2;
	
	public calculateArea() {
		
		diagnol1 =12;
		diagnol2 =10;
		base =24;
		height =13;
		
	}

	
	public calculateArea(int s) {
		
		side =s;
		
		
	}
	//Method for Square
	
	public void Square() {
		
		System.out.println("The are of square is : " +(side*side));
	}
	
	public calculateArea(int w,int l ) {
		
		width= w;
		length =l;
		
	}
	
	//Method for Rectangle
	
	public void rectangle() {
		
		System.out.println("The area of rectangle is :" +width*length);
	}

	
	public calculateArea(float r) {
		
		radius =r;
	}
	//Method for Circle
	
	public void circle() {
		
		System.out.println("The area of circle is : " +(int)(Math.PI*radius*radius));
	}
	//Method for Rhombus
	
	public void RhombusArea() {
		System.out.println("The area of rhombus is : " +(int)(0.5*(diagnol1*diagnol2)));
	}
	
	//Method for Triangle
	
	public void trianglearea() {
		
		System.out.println("The are of triangle is : " +(int)(0.5*(base*height)));
	}
	
	
	
	public static void main(String[] args) {
		calculateArea s1 = new calculateArea(22);
		calculateArea r1 = new calculateArea(2,4);
		calculateArea c1 = new calculateArea(3.5f);
		
		
		s1.Square();
		r1.rectangle();
		c1.circle();
		//Calling methods for Rhombus and Triangle
		new calculateArea().RhombusArea();
		new calculateArea().trianglearea();
		
		
		
		
	}
}
