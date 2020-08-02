package coverage.loteria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import coverage.loteria.model.CartonGenerator;

public class LoteriaTest {
	
	CartonGenerator carton = new CartonGenerator();	
	Loteria loteria = new Loteria(500.0f,20, carton);
	
	@Test
	void getPozoTest() {		
		assertEquals(500.0f,loteria.getPozo());		
	}
	
	@Test
	void getBoletosTest() {		
		assertEquals(20,loteria.getBoletos());		
	}
	
	@Test
	void getGanadoresTest() {	
		loteria.setGanadores(5);
		assertEquals(5,loteria.getGanadores());		
	}
	
	@Test
	void hayGanadoresÚnicoTest() {
		loteria.setGanadores(1);
		assertTrue(loteria.hayGanadorUnico());		
	}
	
	@Test
	void hayCuadrupleGanadorTest(){
		loteria.setGanadores(4);
		assertEquals(true,loteria.hayCuadrupleGanador());
	}
	
	@Test
	void jugadaTest() {
		loteria.jugada();
		assertEquals(0,loteria.getGanadores());		
	}
	

}
