package baekJoon.dp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Padoban {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t,n;
		t = scan.nextInt();
		long[] arr = new long[t];
		
		List<Long> list = new ArrayList<>();
		list.add(1L);
		list.add(1L);
		list.add(1L);
		
		for(int c = 0; c < t; c++) {
			n = scan.nextInt();
			
			for(int i = 0; i < n; i++) {
				long k = list.get(i) + list.get(i+1); 
				list.add(i+3, k); 
			}
			
			arr[c] = list.get(n-1);
			System.out.println(arr[c]);
		}
	}
}
