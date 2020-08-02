package ejercicioUnoPuntoSeis;

import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Test;
public class SumaIntTest {
	
	
	public int addTwoInts(int value, int value2) {
		return value+value2;
	}
	
	@Test
	void test() {
		int value = 2;
		int value2 = 3;
		try {
			assertEquals((value + value2),addTwoInts(value,value2));
		}catch(AssertionError e){
			System.out.println("El resultado está mal: ");
		}		
	}
}
