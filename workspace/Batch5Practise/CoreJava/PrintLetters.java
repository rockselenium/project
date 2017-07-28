package CoreJava;

import java.util.Scanner;

public class PrintLetters {
	public static void main(String[] args) {
		System.out.println("please Enter a word:");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'a')
				continue;
			
			System.out.println("the " + "NO." + (i + 1) + " letter is----->  " + input.charAt(i));
		}
		scan.close();
	}
}
