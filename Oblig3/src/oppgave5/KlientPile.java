package oppgave5;

import oppgave5.*;
import java.util.*;

public class KlientPile {
	public static void main(String[] a) {
		int size = 10; //size of array i want to make
		int randomTab[] = new int[size];
		/*for(int i = 0; i < size; i++) {
			//generate a new random number (max 5000) for each time the the loop goes
			int randomNumb = 4;
			randomTab[i] = getRandomNumber(1,5000);
			int stupid = getRandomNumber(1,5000);
			if(randomTab.find(randomNumb)) {
				
			}
		}*/

		// Test pile by sorting values in a table
		//int tab[] = { 300, 10, 30, 2, 100, 33, 1, 200, 18, 54, 43};
		int dupeElements = 0;

		BinaryPile<Integer> h1 = new BinaryPile<Integer>();
		for (int i = 0; i < size; i++) {
			
			//generate a new random number (max 5000) for each time the the loop goes
			int stupid = getRandomNumber(1,20);
			if(h1.find(stupid)) {
				dupeElements ++;
			}

			
			h1.addElement((stupid));
		}
		System.out.printf("have %s duplicates", dupeElements);

		
		System.out.println("number of nodes: " + randomTab.length);
		System.out.printf("%s nodes", h1.getNumbOfNodes());
		
		System.out.println("\nValues in the table now:");
		h1.writeTab();
		// Remove the pile and add it back sorted
		System.out.println("\nTable in sorted order");
		while (!h1.isEmpty()) {
			Integer h =  h1.removeSmallest();
			System.out.print(h + " ");
		}
		System.out.println();
	}
	public static int getRandomNumber(int min, int max) {
	    return (int) ((Math.random() * (max - min)) + min);
	}
}
