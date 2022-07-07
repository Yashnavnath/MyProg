package tdd_Assignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VowelsTest {

	@Test
	void test() {
		assertEquals(3, Vowels.countVowels("Abhimannu"));
	}

}
