package mockito.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.*;

import mockito.example.model.Vehicle;


@ExtendWith(MockitoExtension.class)
class VehicleCrashTest {
	
	@InjectMocks
	VehicleCrash crashTest;
	

	
	
	@Mock
	Vehicle vehicleMock = mock(Vehicle.class);
	
	@BeforeAll
	public void Before(){
		crashTest = new VehicleCrash();		
	}
	
	
	@Test
	void WhenNoCrashNoValueThenOk() {
		
		
		assertEquals(0, crashTest.getTotalEnergy());
		assertEquals(0, crashTest.getTotalVehicles());
		assertEquals("No crashes measured",crashTest.toString());
	}

	@Test
	void WhenCrashAndCorrectValueThenOk() {
		Mockito.when(vehicleMock.getMass()).thenReturn(10.0);
		Mockito.when(vehicleMock.getMaxSpeed()).thenReturn(5.0);
		crashTest.crash(vehicleMock);		
	}

}
