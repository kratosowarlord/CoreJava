package Phase1.Jav.Projects;


class defaultConstructor{





	int ID;
	String name;




	void display() {

		System.out.println(ID +" "+name);
	}
}


class paramConstructor{

	int id;
	String name;


	paramConstructor(int i, String n){
		id = i;
		name =n;
	}

	void display() {

		System.out.println(id+""+name);
	}
}


public class Constructor {



	public static void main(String[] args) {

		defaultConstructor con1 = new defaultConstructor();
		paramConstructor con2  = new paramConstructor(21,"Karan");


		con1.display();
		con2.display();
		
	}










}
