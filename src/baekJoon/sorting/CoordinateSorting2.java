package baekJoon.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CoordinateSorting2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] coordinate = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			coordinate[i][0] = scan.nextInt();
			coordinate[i][1] = scan.nextInt();
		}
		
		Arrays.sort(coordinate, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1])
					return o1[0] - o2[0];
				else
					return o1[1] - o2[1];
			}
		});
		
		for(int i = 0; i < n; i++ ) {
			System.out.println(coordinate[i][0]+ " " + coordinate[i][1]);
		}
		
	}
}