package Cad;

interface animal{
	void sound();
}



 class Tiger implements animal{
	 public void sound() {
		 System.out.println("Tiger sound danger");
	 }
	
}
 class  Donkey implements animal{
	 public void sound() {
		 System.out.println("Donkey sound  sth");
	 }
 }



























public class Interfacea {
	public static void main(String[] args) {
		Donkey d=new Donkey();
		Tiger t=new Tiger();
		d.sound();
		t.sound();
	}

}
