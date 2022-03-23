package baekJoon.io;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n, result;
		n = scan.nextInt();
		result = 0;
		
		for(int i = 0; i < n; i++) {
			result += i+1;
		}
		
		System.out.println(result);
		scan.close();
	}
}
