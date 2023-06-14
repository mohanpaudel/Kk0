package Cad;

public class Hap {public static void main(String[] args) {
	Bird b=new Bird();
	b.name="Pilot";
	b.address="Ktm";
	b.phone=677;
	b.printInfo();
}

}

class Bird{
	String name;
	String address;
	int phone;

void printInfo() {
	System.out.println(name);
	System.out.println(address);
	System.out.println(phone);
	
}}
class Pilot extends Bird{
	//name="Pilot";
	//address="Ktm";
	//phone=677;
	//b.printInfo();
}