package Cad;

import java.util.LinkedList;

public class Linkeda {public static void main(String[] args) {
	LinkedList<Integer>ages=new LinkedList<>();
	ages.add(15);
	ages.add(28);
	ages.add(43);
	ages.add(40);
	ages.add(50);
	System.out.println(ages);
	ages.addFirst(10);
	System.out.println(ages);
	ages.addLast(13);
	System.out.println(ages);
	ages.removeFirst();
	System.out.println(ages);
	ages.removeLast();
	System.out.println(ages);
	System.out.println(ages.getFirst());
	System.out.println(ages.getLast());
	System.out.println(ages.get(3));
}

}
