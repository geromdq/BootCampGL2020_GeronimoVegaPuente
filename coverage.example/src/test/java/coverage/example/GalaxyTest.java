package coverage.example;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import coverage.example.model.Galaxy;

public class GalaxyTest {
	
	
	@Test
	void test()
	{
		Galaxy galaxy = new Galaxy("Galaxia");
		assertTrue(Galaxy.class == galaxy.getClass());
	}

}
