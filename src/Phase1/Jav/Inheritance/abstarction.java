package Phase1.Jav.Inheritance;

/*//Assignment 2:
(Parent) MNC ---> 2 abstract methods + 1 constructor + 1 normal method
Infosys (child of MNC) ----> make it abstract also  but give the implementation/method body of single abstarct method
Hello (child of Infosys) ----> here implement all the abstarct methods + 1 create normal method also
main class ---> call all the methods of all classes using the dynamic polymorphism*/

abstract class MNC{
	
	MNC(){
		
		System.out.println("This is the constructor of MNC");
		
	}
	
	abstract void IT();
	
	abstract void services();
	
	void big4() {
		
		System.out.println("This is a MNC method");
	}
	
	
}

abstract class infosys extends MNC{
	
	infosys(){
		
		
		System.out.println("This is the Constructor of infosys");
	}
	
		@Override
		void services() {
			
			System.out.println("this is the method services");
		
	}
		
}

class Hello extends infosys{
	
	
	Hello(){
		System.out.println("this is the constructor of Hello");
	}
	
	void IT() {
		
		System.out.println("this is the IT method");
	}
	
	void helloMethod() {
		
		System.out.println("this is the method of Hello");
	}
}



public class abstarction {
	
	
	public static void main(String[] args) {
		
		
		MNC call = new Hello();
		System.out.println("");
		Hello call2 = new Hello();
		
		call.IT();
		call.big4();
		call.services();
		call2.helloMethod();
		
		
	}
	

}
