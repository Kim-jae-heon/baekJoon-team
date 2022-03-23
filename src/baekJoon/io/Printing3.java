package baekJoon.io;

import java.util.Scanner;

public class Printing3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a;
	
		a = scan.nextInt();
		for(int i = 0; i < 9; i++) {
			System.out.printf("%d * %d = %d\n",a,i+1,a*(i+1));
		}
	}
}
