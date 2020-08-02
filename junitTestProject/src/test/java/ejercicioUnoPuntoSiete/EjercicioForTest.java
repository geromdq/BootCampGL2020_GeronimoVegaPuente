package ejercicioUnoPuntoSiete;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;

public class EjercicioForTest {
	
	public boolean checkValue(int condition) {
		for(int i = 0; i <= condition; i++) {
			if (i==3) {				
				return true;
			}			
		}
		return false;
	}
	
	
	
	@Test 
	void checkValueTestFalse() {				
		assertFalse( "Esta variable no es true:", checkValue(2));		
	}
	
	@Test
	void checkValueTestTrue() {
		assertTrue("Esta variable no es false: ", checkValue(4));
	}
	
}
