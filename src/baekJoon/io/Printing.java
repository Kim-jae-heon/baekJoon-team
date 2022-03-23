package baekJoon.io;

import java.util.Scanner;

public class Printing {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a;
	
		a = scan.nextInt();
		for(int i = 0; i < a; i++) {
			System.out.println(i+1);
		}
	}
}
