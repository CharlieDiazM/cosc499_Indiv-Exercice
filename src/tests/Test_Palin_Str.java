package tests;

import static org.junit.Assert.*;
import Palindrome.*;
import org.junit.Test;

public class Test_Palin_Str {

	@Test
	public void testPalindStr() {
		assertTrue(Main.stringPalindrome("level"));
		assertFalse(Main.stringPalindrome("hello"));
	}
}
