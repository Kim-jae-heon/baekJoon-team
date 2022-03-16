package baekJoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AplusB5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
       
		while(scan.hasNext()) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println(a+b);
		}
		scan.close();
	}
}
