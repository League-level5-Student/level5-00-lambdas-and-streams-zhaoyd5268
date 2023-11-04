package _01_Lambda_Methods;

import java.util.Random;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.

		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s) -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");

		// 2. Call the printCustonMessage method using a lambda so that the String
		// prints backwards.
		printCustomMessage((s) -> {
			StringBuilder str = new StringBuilder();
			for (int i = s.length() - 1; i >= 0; i--) {
				str.append(s.charAt(i));
			}
			System.out.println(str.toString());
		}, "supercalifragilisticexpeliadocous");
		// 3. Call the printCustonMessage method using a lambda so that the String
		// prints with a mix between upper an lower case characters.
		printCustomMessage((s) -> {
			StringBuilder str = new StringBuilder();
			Random ran = new Random();

			for (int i = 0; i < s.length(); i++) {
				int rnum = ran.nextInt(2);
				if (rnum == 0) {
					String a = s.charAt(i) + "";
					str.append(a.toUpperCase());
				} else {
					String a = s.charAt(i) + "";
					str.append(a.toLowerCase());
				}
			}
			System.out.println(str.toString());
		}, "supercalifragilisticexpeliadocous");
		// 4. Call the printCustonMessage method using a lambda so that the String
		// prints with a period in between each character.
		printCustomMessage((s) -> {
			StringBuilder str = new StringBuilder();
			for (int i = 0; i < s.length(); i++) {
				str.append(s.charAt(i) + ".");
			}
			System.out.println(str.toString());
		}, "supercalifragilisticexpeliadocous");
		// 5. Call the printCustonMessage method using a lambda so that the String
		// prints without any vowels.
		printCustomMessage((s) -> {
			StringBuilder str = new StringBuilder();

			String[] arr = new String[5];
			arr[0] = "a";
			arr[1] = "e";
			arr[2] = "i";
			arr[3] = "o";
			arr[4] = "u";
			for(int i = 0; i < s.length(); i++) {
				boolean goodornot=true;
				String pvowel = s.charAt(i)+"";
				for (int j = 0; j < 5; j++) {
					if (pvowel.contains(arr[j])) {
						goodornot = false;
						System.out.println("frogs");
					}
				}
				if (goodornot != false) {
				str.append(pvowel);
				}
			}
			System.out.println(str.toString());
		}, "supercalifragilisticexpeliadocous");

	}

	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
