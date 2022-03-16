package baekJoon;

import java.util.Scanner;

public class AplusB4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b;
		
		while(scan.hasNext()) {
			a = scan.nextInt();
			b = scan.nextInt();
			
			if(a == 0 && b == 0) {
				break;
			}
			
			System.out.println(a+b);
		}
	}
}
