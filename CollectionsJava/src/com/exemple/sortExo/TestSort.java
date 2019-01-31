package com.exemple.sortExo;

import java.util.Arrays;
import java.util.Scanner;

public class TestSort {

 
	// declaration de tableau
	static int[] pileDeCrepes = new int[6];

	public static void main(String[] args) {
		// saisie de valeur
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
			pileDeCrepes[5 - i] = sc.nextInt();
			 
		}
		
		// trie de tableau
		 Arrays.sort(pileDeCrepes);
		
		// Affichage de valeur trié
		System.out.printf("Trie de crêpe : %s\n", Arrays.toString(pileDeCrepes));
	//System.out.println(Permut);
		
	}
}
