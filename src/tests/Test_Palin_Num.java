package tests;

import static org.junit.Assert.*;
import Palindrome.*;
import org.junit.Test;

public class Test_Palin_Num {

	@Test
	public void testPalindNum() {
		assertEquals(true,Main.numberPalindrome(123321));
		assertEquals(true,Main.numberPalindrome(56765));
		assertEquals(false,Main.numberPalindrome(4567));
	}
}
