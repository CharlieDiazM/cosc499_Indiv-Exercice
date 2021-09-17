package tests;

import static org.junit.Assert.*;
import Palindrome.*;
import org.junit.Test;

public class Test_Palin_Str {

	@Test
	public void testPalindStr() {
		assertEquals(true,Main.stringPalindrome("level"));
		assertEquals(false,Main.stringPalindrome("hello"));
	}
}
