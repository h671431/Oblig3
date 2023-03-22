package dat102;

public class Main {

	public static void main(String[] args) {
		
		Integer[] tab = {2, 9, 6, 7, 1, 4};
		
		InsertionSort.insertionSort(tab, tab.length);
		
		for(Integer e : tab) {
			System.out.println(e + "");
		}
		System.out.println();
	}
	//dette er en enrding for å teste

}
