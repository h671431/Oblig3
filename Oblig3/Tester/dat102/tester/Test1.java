package dat102.tester;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;

import dat102.Soeking;
import org.junit.jupiter.api.Test;

class Test1 {

	@BeforeEach
	void setUp1() throws Exception {
	}
	Integer [] tab1 = {2, 5, 10, 14, 23};		
	Integer [] tab2 = {9, 3, 10, 14, 12};
		
	/* 
	Lineærsøking i sortert tabell
	*/
	@Test
	public void testUsortertTabell() {
			
		assertTrue(Soeking.usortertTabell(tab2, 14));
	}
	
	/* 
	Lineærsøking i usortert tabell
	*/
	@Test
	public void testSortertTabell(){
			
		assertTrue(Soeking.sortertTabell(tab1, 23));	
	}
		
	/* 
	Binærsøking i sortert tabell
	*/
	@Test
	public void testBinaersoek() {
			
		assertFalse(Soeking.binaersoek(tab2, 3));
		}
}
