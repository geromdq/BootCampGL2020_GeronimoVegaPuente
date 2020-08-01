package coverage.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import coverage.example.model.Planet;

public class PlanetTest {
	
	Planet planet = new Planet();
	
	@Test
	void getNameTest() {		
		planet.setName("Neptuno");
		assertEquals("Neptuno",planet.getName());			
	}
	
	@Test
	void setNameTest() {
		String initialName = planet.getName();
		planet.setName("something different");
		assertNotEquals(initialName,planet.getName());
	}
	
	@Test
	void testToString() {
		planet.setName("Neptuno");
		assertEquals("Planet [name=Neptuno]",planet.toString());
	}
	
	

}
