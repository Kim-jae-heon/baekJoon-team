package baekJoon.io;

import java.util.Scanner;

public class Star10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		
		n = scan.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-1+i; j++) {
				if(i == 1)
					if(j < n)
						System.out.print(" ");
					else
						System.out.print("*");
				else if(i == n)
					System.out.print("*");
				else
					if(j == n-i+1)
						System.out.print("*");
					else if(j == n+i-1)
						System.out.print("*");
					else
						System.out.print(" ");
			}
			System.out.println();
		}
	}
}
