package dat102;

public class InsertionSort {
	
	private static void swap(Object[] a, int i, int j) {
		Object temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	public static <T extends Comparable<? super T>> void insertionSort(T[] a, int n) {
		
		for(int i= start+1; i<=slutt; i++) {
			T tmp = a[i];
			int j = i -1; //siste i sortert del
			boolean ferdig = false;
			
			while(!ferdig && j >=0) {
				if(tmp.comparableTo(a[j]) < 0) {
					a[j +1] = a[j];
					j--;
				} else {
					ferdig = true;
				}
			}
			a[j +1] = tmp;
		}
	}


}
