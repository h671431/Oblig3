package oppgave1;

import java.util.Random;

public class oppg1b {
	public static void main(String[] args) {

		// int list[] = {9, 8, 4, 6, 1, 3, 2, 5, 7, 34, 12, 99, 33, 46, 23, 90, 54, 45};
		// ArrayList<Integer> list = new ArrayList<Integer>();

		// for (int i : list) {
		// System.out.print(i + " ");

		int n = 10;
		int[] list = new int[n];

		Random rand = new Random();

		for (int i = 0; i < n; i++) {
			list[i] = rand.nextInt(n);
			System.out.print(list[i] + " ");
		}

		System.out.println();

		long startTime = System.nanoTime();

		insertionSort(list);

		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;

		for (int i : list) {
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println("Time used is: " + totalTime);

	}

	private static void insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			int j = i - 1;

			while (j >= 0 && array[j] > temp) {
				array[j + 1] = array[j];
				j--;
			}

			array[j + 1] = temp;
		}
	}
	
/*
 * først tar vi ut 2 element i tabellen, med sart fra insertionSort metoden
 * løkke for å se hvilke av de to elementene som er størst, bruke det største og sammenligne i tabellen og sette inn begge elementene 
 * gjøre det samme, de neste 2 elementene 
 * 
 * 
 * må ha en if seting hvos antall n (antallet elementer i tabellen) er oddetall, slik at 
 * 
 */
}

