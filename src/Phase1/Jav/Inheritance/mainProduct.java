package Phase1.Jav.Inheritance;

class product{

	private int id =78;
	private String name = "Amul";
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	void display() {
		System.out.println(id+name);
	}
}


class A extends product{

	private int count = 50;
	private String category = "butter";
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	void display() {

		System.out.println(count + category);
	}


}


class B extends product{

	private int count = 90;
	private String category = "Milk";
	public int getCount() {
		return count;
	}
	public String getCategory() {
		return category;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	void display() {

		System.out.println(count+category);
	}
}


class C extends product{

	private int count = 56;
	private String category = "choco";
	public int getCount() {
		return count;
	}
	public String getCategory() {
		return category;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	void display() {

		System.out.println(count+category);
	}


}

class subA extends A{

	private int price =30;




	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}





}

class subB extends B{

	private int price =10;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}






public class mainProduct {

	public mainProduct() {
		// TODO Auto-generated constructor stub
	}






	public static void main(String[] args) {

		subA price1 = new subA();
		subB price2 = new subB();


		System.out.println("Price of the Product : " +price1.getCount()*price1.getPrice());

		System.out.println("ID: "+price1.getId() + " "+ "Name: "+price1.getName()+ " " +"Category: " +price1.getCategory());

		System.out.println("");

		System.out.println("Price of the Product : " +price2.getCount()*price2.getPrice());

		System.out.println("ID: "+price2.getId() + " "+ "Name: "+price2.getName()+ " " +" Category: " +price2.getCategory());




	}


}
