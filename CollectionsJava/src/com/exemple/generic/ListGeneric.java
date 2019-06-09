package com.exemple.generic;

import java.util.ArrayList;

public class ListGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> userNames = new ArrayList<String>();
		
		userNames.add("Tom");
		userNames.add("Jerry");
		
		
		/**
		 * erreur si on rajoute cette code car ArrayList<String> 
		 */
		//userNames.add(new Integer(100));
		
		String userNames1 = userNames.get(0);
		
		System.out.println("userName1 = "+userNames);
		

	}

}
