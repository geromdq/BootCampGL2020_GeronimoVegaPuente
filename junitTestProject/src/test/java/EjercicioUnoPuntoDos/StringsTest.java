package EjercicioUnoPuntoDos;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.Test;

public class StringsTest {
	
	
	 private String stringOne = "Hello";
	 private String stringTwo = "Hello";
	 private String stringThree = "GoodBye";
	
	
	@Test	
	void test() {
		assertNotEquals(stringOne,stringTwo);
		assertFalse(stringOne.equals(stringThree));
	}
}
