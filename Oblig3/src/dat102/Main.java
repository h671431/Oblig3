package dat102;

public class Main {

	public static void main(String[] args) {
		
		Integer[] tab = {7, 4, 1, 9, 5, 2};
		
		SorterTabell.insertionSort(tab, tab.length);
		
		for(Integer e : tab) {
			System.out.println(e + "");
		}
		System.out.println();
	}
	//test

}
