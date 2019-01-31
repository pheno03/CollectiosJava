package com.exemple.mapExo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExo {

	public static void main(String[] args) {
		// TODO HashMap pour stocker
		Map<Integer, String> hmap = new HashMap<>();
		
		hmap.put(10, "1");
		hmap.put(20, "2");
		hmap.put(30, "3");
		hmap.put(40, "4");
		hmap.put(50, "5");
		
		System.out.println("Parcours de l'objet HashMap : "); 
		Set<Entry<Integer, String>>  setHm = hmap.entrySet();
		 
		Iterator<Entry<Integer, String>> iterator = setHm.iterator();
		
		while (iterator.hasNext()) {
			Entry<Integer, String> entry = iterator.next();
			System.out.println(entry.getKey() + " : " +entry.getValue());
		}
		
		// TODO LinkedMap combine la table de hachage et liens chainés		
		System.out.println("Valeur pour la clé 8 : " + hmap.get(8));
		Map<Integer, String> lhmap = new LinkedHashMap<>();
		
		lhmap.put(10, "1");
		lhmap.put(20, "2");	
		lhmap.put(30, "3");
		lhmap.put(40, "4");
		lhmap.put(50, "5");
		lhmap.put(60, "6");
  
		System.out.println("Parcours de l'objet LinkedHashMap : ");
		Set<Entry<Integer, String>> setLhm = lhmap.entrySet();
		Iterator<Entry<Integer, String>> iterator2 = setLhm.iterator();
		
		while (iterator2.hasNext()) {
			 Entry<Integer, String> entry = iterator2.next();
			 System.out.println(entry.getKey() + " : " + entry.getValue());
		}		
	}
}
 
