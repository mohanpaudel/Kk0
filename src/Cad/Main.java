package Cad;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>names=new ArrayList<>();
names.add("Ram");
names.add("Hari");
names.add("Shyam");
names.add("John");
names.add("Mike");
//names.forEach((n) ->{System.out.println(n);});
System.out.println(names);	
Consumer<String>method=(n)->{System.out.println(n);};
names.forEach(method);
	/*names.add(0,"Shyam");
	System.out.println(names);
	names.remove(5);
	System.out.println(names);
	names.remove(4);
	System.out.println(names);
	names.remove(3);
	System.out.println(names);
	System.out.println(names.get(0));
	names.set(1, "KLrishna");
	System.out.println(names);
	System.out.println(names.size());
	//names.clear();
	//System.out.println(names);*/
	
	//for(int i=0; i<names.size(); i++) {
		//System.out.println(names.get(i));
		for(String name:names) {
			System.out.println(name);
		}
	}
	}


