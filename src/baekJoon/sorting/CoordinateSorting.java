package baekJoon.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class CoordinateSorting {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] arr = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			arr[i][0] = scan.nextInt();
			arr[i][1] = scan.nextInt();
		}
		
		Arrays.sort(arr, (o1, o2) -> { 
				if(o1[0] == o2[0])  
					return o1[1] - o2[1];
				else 
					return o1[0] - o2[0];
				
		});
		
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}
}