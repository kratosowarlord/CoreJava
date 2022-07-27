package Phase1.Jav.Inheritance;

/*Vechile:(Parent)- abstract
- create two abstract methods  - run() and stop()
- create three methods of public void fuel - 1st method will take int / 2nd method will float and string  / 3rd method will take char and int (method overloading)
- declare two variables - int speed and long distance
- create two constructors also- default and parametrized
2W:(child)
- oveeride the two methods - run() and stop()
- create default constructor
- declare two variables - int speed and long distance with different values from the parent vechile
- decalre one more variable as int nos_of_tyre = 2
- create methods here also as display() --> this will print the three variables of 2W  + all the variable of the parent Vechile  (hint: super.variable_name)
*/

abstract class vehicle{
	
	private int speed =25;
	private long distance =450;
	
	vehicle(){
		
//		System.out.println("Constructor of Vehicle is Called.");
	}
	
	vehicle(int i,long d){
		
		speed = i;
		distance = d;
		
	}
	public int getSpeed() {
		return speed;
	}

	public long getDistance() {
		return distance;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setDistance(long distance) {
		this.distance = distance;
	}

	abstract void run();
	abstract void stop();
	
	public void fuel(int litre) {
		
	}
	
	public void fuel(int litre,float point) {
		
	}

	public void fuel(int litre,char type) {
	
	}
}







class twowheeler extends vehicle{
	
	private int speed = 34;
	private long distance = 340;
	private int no_of_tyre =2;
	
	twowheeler(){
		
		
	}
	
	void run() {
		System.out.println("Run Method");
	}
	
	void stop() {
		
		System.out.println("Stop Method");
	}
	
	
	void display() {
		
		System.out.println("Speed of 2W is " +speed +" With the distance of " +distance + " and the no. of tyres are:  " +no_of_tyre);
		System.out.println();
		
		System.out.println("The speed of vehicle is " +super.getSpeed() +" and the distance is  " +super.getDistance());
		
	}
	
	
	
	
	
}



public class abstarctexp {
	
	public static void main(String[] args) {
		
		twowheeler call = new twowheeler();
		
		call.display();
	}
	
	

}
