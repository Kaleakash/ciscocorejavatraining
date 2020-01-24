package test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.Calculation;

public class CalculationTest {

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		Calculation cc = new Calculation();
		int result = cc.add(100, 200);
		
		assertEquals(300, result);
	}

}
