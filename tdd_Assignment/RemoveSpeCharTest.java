package tdd_Assignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveSpeCharTest {

	@Test
	void test() {
		assertEquals("This Red car ", RemoveSpeChar.removeSpeChar("This@Red$car-"));
	}

}
