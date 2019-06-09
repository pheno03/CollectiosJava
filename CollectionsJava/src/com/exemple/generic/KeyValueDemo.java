package com.exemple.generic;

/**
 * Utilisation de parametre generic K, V
 * 
 * @author srakotomalala
 *
 */
public class KeyValueDemo {
	private static final String NUMERO_PHONE = "Phone = ";
	private static final String NAME = " /name = ";

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		KeyValue<Integer, String> entry = new KeyValue<Integer, String>(12000111, "Tom");

		Integer phone = entry.getKey();

		String name = entry.getValue();

		System.out.println(NUMERO_PHONE + phone + NAME + name);
	}

}
