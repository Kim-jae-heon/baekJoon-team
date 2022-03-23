package baekJoon.io;

import java.util.Scanner;

public class Star07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		
		n = scan.nextInt();
		for(int i = 1; i <= 2*n-1; i++) {
			for(int j = 1; j <= n; j++) {
				if(i <= n)
					if(n-i < j) 
						System.out.print("*");
					else
						System.out.print(" ");
				else
					if(i-n < j)
						System.out.print("*");
					else
						System.out.print(" ");
			}
			System.out.println();
		}
	}
}
