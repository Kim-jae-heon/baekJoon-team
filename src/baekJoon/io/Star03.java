package baekJoon.io;

import java.util.Scanner;

public class Star03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		
		n = scan.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int j = (n+1)-i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
