package com.exemple.listExo;

import java.util.ArrayList;

public class TestList {

	public static void main(String[] args) {
	
		ArrayList list = new ArrayList();
		 
		 list.add(12);
		 list.add("Une chaine de caractere !");
		 list.add(12.20f);
		 list.add('d');
		 		 
		 for (int i = 0; i < list.size(); i++) {
			 System.out.println("une donnée à l'indice  "+ i + " = " +list.get(i));
			
		}

	}

}
