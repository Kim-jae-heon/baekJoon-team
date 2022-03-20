package baekJoon;

import java.util.Scanner;

public class Star2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		
		n = scan.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(j < (n+1)-i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
			
		}
	}
}
