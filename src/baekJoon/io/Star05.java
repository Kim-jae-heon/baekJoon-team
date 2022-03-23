package baekJoon.io;

import java.util.Scanner;

public class Star05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		
		n = scan.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-1+i; j++) {
				if(n-i >= j)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
