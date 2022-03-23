package baekJoon.io;

import java.util.Scanner;

public class Printing2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a;
	
		a = scan.nextInt();
		for(int i = a; i > 0; i--) {
			System.out.println(i);
		}
	}
}
