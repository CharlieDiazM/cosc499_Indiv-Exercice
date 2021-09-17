package tests;

import static org.junit.Assert.*;
import Palindrome.*;
import org.junit.Test;

public class Test_Palin_Num {

	@Test
	public void testPalindNum() {
		assertTrue(Main.numberPalindrome(123321));
		assertTrue(Main.numberPalindrome(56765));
		assertFalse(Main.numberPalindrome(4567));
	}
}
