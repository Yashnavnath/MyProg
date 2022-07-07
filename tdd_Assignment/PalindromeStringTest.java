package tdd_Assignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeStringTest {

	@Test
	void test() {
		assertTrue(PalindromeString.isPalindrome("radar"));
	}

}
