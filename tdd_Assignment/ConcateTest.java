package tdd_Assignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConcateTest {

	@Test
	void test() {
		assertEquals("apple-banana-orange-Lemon", Concate.concateArray());
	}

}
