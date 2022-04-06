package baekJoon.str;

import java.util.Arrays;
import java.util.Scanner;

public class SuffixArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		String[] arr = new String[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			arr[i] = str.substring(i);
		}
		
		Arrays.sort(arr);
		
		for(String s : arr) {
			System.out.println(s);
		}
	}
}
