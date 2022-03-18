package baekJoon;

import java.util.Scanner;

public class PrintOut3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		int n = str.length()/10 + 1;
	
		for(int i = 0; i < n; i++) {
			if(i == n-1) {
				System.out.println(str.substring(10*i));
			} else {
				System.out.println(str.substring(10*i, 10*(i+1)));
			}
		}
	}
}
