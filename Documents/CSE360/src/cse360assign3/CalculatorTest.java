package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator calc = new Calculator();
		assertNotNull(calc);
	}
	@Test
	public void getTotalTest() {
		Calculator calc = new Calculator();
		assertEquals(0,calc.getTotal());
	}

	@Test
	public void addTest() {
		Calculator calc = new Calculator();
		calc.add(5);
		assertEquals(5,calc.getTotal());		
	}
	
	@Test
	public void subtractTest() {
		Calculator calc = new Calculator();
		calc.subtract(7);
		assertEquals(-7,calc.getTotal());
	}
	
	@Test
	public void multiplyTest() {
		Calculator calc = new Calculator();
		calc.add(7);
		calc.multiply(8);
		assertEquals(56,calc.getTotal());
	}

	@Test
	public void divideTest() {
		Calculator calc = new Calculator();
		calc.add(26);
		calc.divide(0);
		assertEquals(0,calc.getTotal());
	}

	@Test
	public void getHistoryTest() {
		Calculator calc = new Calculator();
		calc.add(8);
		calc.multiply(7);
		calc.divide(2);
		assertEquals("0 + 8 * 7 / 2" ,calc.getHistory());
		
	}

}