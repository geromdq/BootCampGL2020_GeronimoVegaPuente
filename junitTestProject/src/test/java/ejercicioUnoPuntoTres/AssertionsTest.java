package ejercicioUnoPuntoTres;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;



public class AssertionsTest {
	
	@Test	
	void test() {
	assertFalse(25 > 12);
	assertTrue(25 > 27);
	}
}
