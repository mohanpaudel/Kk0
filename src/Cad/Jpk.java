package Cad;

public class Jpk {
public static void main(String[] args) {
	Pen p=new Pen("hat","hky",2000);
	p.printInfo();
}
}
class Pen{
	String name;
	String brand;
	double price;

public Pen(String name, String brand, double price) {
	this.name=name;
	this.brand=brand;
	this.price=price;
}
	 void printInfo() {
		 System.out.println("Nmae is " +name);
		 System.out.println("Brand is" +brand);
		System.out.println(("Price is" +price));
		 
	 }
}

 //class Dotpen extends Pen {

	
	

