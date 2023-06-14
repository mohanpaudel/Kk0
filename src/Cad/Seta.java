package Cad;

import java.util.HashSet;

public class Seta {public static void main(String[] args) {
	HashSet<String>names=new HashSet<>();
	names.add("Ram");
	names.add("Hari");
	names.add("hari");
	names.add("John");
	names.add("Mike");
	System.out.println(names);
	System.out.println(names.contains("Ram"));
	names.remove("John");
	System.out.println(names);
	names.size();
	System.out.println(names.size());
	//names.clear();
	//System.out.println(names);
	for(String n:names) {
		System.out.println(n);
	}
}

}
