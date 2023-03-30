package oppgave2;

import java.util.Random;

public class Oppg2 {
	public static void main(String[] args) {

		int n = 64000;
		int[] list = new int[n];

		Random rand = new Random();

		for (int i = 0; i < n; i++) {
			list[i] = rand.nextInt(n);
			System.out.print(list[i] + " ");
		}

		System.out.println();

		long startTime = System.nanoTime();

		insertionSort(list);

		selectionSort(list);

		quickSort(list, 0, list.length - 1);

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

	private static void quickSort(int[] array, int start, int end) {
		if (end <= start) {
			return;
		}

		int pivot = array[end];
		int i = start;

		for (int j = start; j <= end; j++) {
			if (array[j] < pivot) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		i++;
		int temp = array[i];
		array[i] = array[end];
		array[end] = temp; // return i;

	}

	private static void selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[min] < array[j]) {
					min = j;
				}
			}

			int temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
	}

	private static void mergeSort(int[] array) {
		int length = array.length;
		if (length <= 1) {
			return;
		}
		int middle = length / 2;
		int[] leftArray = new int[middle];
		int[] rightArray = new int[length - middle];

		int i = 0; // right side of list
		int j = 0; // left side of list

		for (; i < length; i++) {
			if (i < middle) {
				leftArray[i] = array[i];
			} else {
				rightArray[j] = array[i];
				j++;
			}
		}
		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(leftArray, rightArray, array);

	}

	private static void merge(int[] leftArray, int[] rightArray, int[] array) {
		int leftSize = array.length / 2;
		int rightSize = array.length - leftSize;
		int i = 0, l = 0, r = 0;

		while (l < leftSize && r < rightSize) {
			if (leftArray[l] < rightArray[r]) {
				array[i] = leftArray[l];
				i++;
				l++;
			} else {
				array[i] = rightArray[r];
				i++;
				r++;
			}
		}
		while (l < leftSize) {
			array[i] = leftArray[l];
			i++;
			l++;
		}
		while (r < rightSize) {
			array[i] = rightArray[r];
			i++;
			r++;
		}
	}

}
