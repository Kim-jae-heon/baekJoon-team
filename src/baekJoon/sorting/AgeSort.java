package baekJoon.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class AgeSort {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[][] ageName = new String[n][2];
		
		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			String[] an = str.split(" ");
			ageName[i][0] = an[0];
			ageName[i][1] = an[1];
		}
		
		Arrays.sort(ageName, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
			}
		});
		
		for(int i = 0; i < n; i++) {
			System.out.println(ageName[i][0] + " " + ageName[i][1]);
		}
	}
}
