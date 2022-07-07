package tdd_Assignment;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

class CalculatorTest {
	
	private Calculator obj;
	
	@Rule
	public ExpectedException expobj=ExpectedException.none();
	
	@Test
	void test() {
	assertEquals(30, obj.addofTwono(10, 20));
	assertEquals(20,obj.subtraction(30, 10));
	assertEquals(50, obj.multiOfTwoNo(10, 5));
	assertEquals(125, obj.cube(5));
	assertEquals(81, obj.square(9));
	assertEquals(8, obj.power(2, 3));
		
	}
     
	@Test
	public void testException()
	{
		expobj.expect(ArithmeticException.class);
		expobj.expectMessage(containsString("/ by zero"));
		assertEquals(3, obj.division(10, 3));
		assertEquals(1, obj.modules(40, 3));
	}
	
	
}
