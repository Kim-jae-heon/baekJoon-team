package baekJoon.io;

import java.util.Scanner;

public class Star06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		
		n = scan.nextInt();
		for(int i = 1; i <= 2*n-1; i++) {
			for(int j = 1; j <= 2*n; j++) {
				if(i <= n)
					if(j <= i)
						System.out.print("*");
					else if (j > 2*n-i)
						System.out.print("*");
					else
						System.out.print(" ");
				else 
					if(j <= 2*n-i)
						System.out.print("*");
					else if(j > i)
						System.out.print("*");
					else
						System.out.print(" ");
				
			}
			System.out.println();
		}
	}
}
