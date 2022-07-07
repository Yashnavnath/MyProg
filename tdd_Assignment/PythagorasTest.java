package tdd_Assignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PythagorasTest {

	@Test
	void test() {
		assertEquals(true, Pythagoras.templete(new int[] {6,8,10}, 3));
	}

}
