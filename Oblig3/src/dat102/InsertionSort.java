package dat102;

public class InsertionSort {
	
	public static <T extends Comparable<? super T>> void insertionSort(T[] a, int n) {
		insertionSort(a, 0);
	}
	public static <T extends Comparable<? super T>> void sorteringVedInssetting(T[] a, int start, int slutt) {
		for(int i= start+1; i<=slutt; i++) {
			T tmp = a[i];
			int j = i -1; //siste i sortert del
			boolean ferdig = false;
			
			while(!ferdig && j >=0) {
				if(tmp.compareTo(a[j]) < 0) {
					a[j +1] = a[j];
					j--;
				} else {
					ferdig = true;
				}
			}
			a[j +1] = tmp;
		}
	}//t


}
