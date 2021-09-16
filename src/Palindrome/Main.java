package Palindrome;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number;
		
		System.out.println("Enter a number:");
		number = input.nextInt();
		
		System.out.println(numberPalindrome(number));
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
}
