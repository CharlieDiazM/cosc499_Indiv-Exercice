package Palindrome;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number;
		String word;
		
		System.out.println("Enter a number and a word:");
		number = input.nextInt();
		word = input.next();
		
		System.out.println(numberPalindrome(number));
		System.out.println(stringPalindrome(word));
	}
	
	public static boolean numberPalindrome(int num) {
		int newNum = 0;
		int rem;
		int prevNum = num;
		
		while(num > 0) {
			rem = num % 10;
			newNum = newNum * 10 + rem;
			num = num / 10;
		}
		
		if(prevNum == newNum) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean stringPalindrome(String str) {
		String newString = "";
		int max = str.length();
		for(int i = max - 1; i >= 0; i--) {
			newString = newString + str.charAt(i);
		}
		
		if(str.equals(newString)) {
			return true;
		}else {
			return false;
		}
	}
}
