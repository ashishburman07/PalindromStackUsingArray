package palindrom;

import java.util.Arrays;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(CheckPalindrom("Hi! I am Ashish"));  //false
		System.out.println(CheckPalindrom("Racecar!"));  //true
		System.out.println(CheckPalindrom("I did < did I?"));//true

		
		
		

	}

	private static boolean CheckPalindrom(String string) {

		String data = string.toLowerCase();
		StringBuilder sb1 = new StringBuilder();
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < data.length(); i++) {
			char c = data.charAt(i);
			if ('a' < c && c < 'z') {
				sb1.append(c);
				stack.push(c);
			}

		}
		StringBuilder sb2 = new StringBuilder(stack.size());
		while(!stack.isEmpty()) {
			sb2.append(stack.pop());
		}

		if(sb1.toString().equals(sb2.toString())){
			return true;
		}
		
		return false;
	}

}
