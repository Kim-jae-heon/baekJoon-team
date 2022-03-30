package baekJoon.str;

import java.util.Scanner;

public class AlphabetCounting {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] count = new int[26];
		
		String str = scan.nextLine();
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			for(int j = 97; j < 123; j++) {
				if(c == j) {
					count[c-97]++;
				}
			}
		}
		
		for(int i = 0; i < count.length; i++) {
			System.out.print(count[i] + " ");
		}
	}
}
