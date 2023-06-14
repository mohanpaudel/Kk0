package Cad;

import java.util.HashMap;

public class Mapk {public static void main(String[] args) {
	HashMap<Integer,String>pInfo=new HashMap<>();
	pInfo.put(1, "John");
	pInfo.put(2, "Mike");
	pInfo.put(3, "Jeny");
	System.out.println(pInfo);
	System.out.println(pInfo.size());
//pInfo.clear();
//System.out.println(pInfo);
//for(int i:pInfo.keySet()) {
	//System.out.println(i);
	for(String p:pInfo.values()) {
		System.out.println(p);
		
	}
}
}


