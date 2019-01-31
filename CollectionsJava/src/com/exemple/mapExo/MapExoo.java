package com.exemple.mapExo;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Map<Integer, String> mapPersonne = new TreeMap<Integer, String>();
		
		mapPersonne.put(1, "Anita");
		mapPersonne.put(2,"Gregoire");
		mapPersonne.put(30, "Frederic");
		mapPersonne.put(44,"Kim");
		mapPersonne.put(25, "Poutine");
		
		Set set = mapPersonne.entrySet();
		Iterator iterator = set.iterator();
	
		while(iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry)iterator.next();
			System.out.println("key is:  "+mentry.getKey() + " & Value is: ");
			System.out.println(mentry.getValue());			
		}	
	}
}
