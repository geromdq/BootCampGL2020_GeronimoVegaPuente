package ejercicioUnoPuntoCuatro;
import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Test;

public class LongNullTest {
	
	Long var = null;
	
	@Test
	void test() {
		assertFalse(var==null);
		var = (long) 1;
		assertFalse(var!=null);
	}
}
