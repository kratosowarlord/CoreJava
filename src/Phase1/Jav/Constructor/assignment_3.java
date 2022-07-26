package Phase1.Jav.Constructor;

public class assignment_3 {
	
	String name;
	int age;
	char section;
	char gender;
	
	int subject1;
	int subject2;
	int subject3;
	
	public assignment_3() {
		
	
	}
	
	public assignment_3(String n,char s, char g,int a,int sub1, int sub2, int sub3) {
		
		name =n;
		section =s;
		gender =g;
		age =a;
		
		subject1 = sub1;
		subject2 = sub2;
		subject3 = sub3;
		
		
	}
	
	public assignment_3(String n,char s, char g,int a,int sub2,int sub3) {
		
		name =n;
		section =s;
		gender =g;
		age =a;
		subject2 = sub2;
		subject3 =sub3;
		
	}

	void display() {
		
		
		
		int part = subject1 +subject2+ subject3; 
		
		System.out.println("The name of the Student is " +name + " The student's section is " +section + " The student is a "+gender +" The student is " +age);
		System.out.println("The total Marks for the student is " +part);
		System.out.println("The percentage of the student is " +(float)((part*100)/300));
		
		
		
		

}
	
	
	public static void main(String[] args) {
		assignment_3 s1 = new assignment_3("Arun",'a','M',17,94,87,90);
		assignment_3 s2 = new assignment_3("Taruna",'b','F',17,67,71);
		assignment_3 s3 = new assignment_3("Arjun",'a','M',17,78,98);
		assignment_3 s4 = new assignment_3("Lata",'d','F',18,89,98,91);
		
		
		s1.display();
		System.out.println();
		s2.display();
		System.out.println();
		s3.display();
		System.out.println();
		s4.display();
	}
}
