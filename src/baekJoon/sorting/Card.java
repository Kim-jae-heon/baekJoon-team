package baekJoon.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Card {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long[] cardNum = new long[n];
		int count = 1;
		int max = 0, maxIdx = 0;
		
		for(int i = 0; i < n; i++) {
			cardNum[i] = Long.parseLong(br.readLine());
		}
		
		Arrays.sort(cardNum);
		
		for(int i = 0; i < n-1; i++) {
			if(cardNum[i] == cardNum[i+1])
				count++;
			else 
				count = 1;
				
			if(count > max) {
				max = count;
				maxIdx = i;
			}
		}
		
		System.out.println(cardNum[maxIdx]);
	}
}
