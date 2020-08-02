package coverage.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

import coverage.example.model.Planet;
import coverage.example.model.Star;

public class StarTest {
	
	Star star = new Star();
	Planet neptune = new Planet();
	List<Planet> planetList = new ArrayList<Planet>();	
	
	@Test
	void getNameTest() {		
		star.setName("Sun");
		assertEquals("Sun",star.getName());			
	}
	
	@Test
	void setNameTest() {
		String initialName = star.getName();
		star.setName("something different");
		assertNotEquals(initialName,star.getName());
	}
	
	@Test
	void getPlanetsTest() {
		neptune.setName("Neptune");
		planetList.add(neptune);
		star.setPlanets(planetList);
		assertEquals(neptune,planetList.get(0));
	}
	
	@Test
	void setPlanetsTest() {
		star.setPlanets(this.planetList);
		/*List<Planet> planetList2 = star.getPlanets();
		planetList2.add(neptune);
		star.setPlanets(planetList2);
		List<Planet> planetList3 = star.getPlanets();*/
		assertEquals(planetList, star.getPlanets());		
	}
	
	@Test
	void toStringTest(){		
		neptune.setName("Neptune");
		star.setName("Sun");
		planetList.add(neptune);
		star.setPlanets(planetList);	
		assertEquals("Star [name=Sun, planets=[Planet [name=Neptune]]]",star.toString());
	}
	
	@Test
	void getColorTest() {
		star.setColor("Red");
		assertEquals("Red",star.getColor());				
	}
	
	@Test
	void setColorTest() {
		String initialColor = star.getColor();
		star.setColor("Grey");
		assertNotEquals(initialColor,star.getColor());
	}
	
	
	
}


