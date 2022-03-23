package baekJoon.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Greatest_Smallest {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		String str;
		
		n = Integer.parseInt(br.readLine());
		str = br.readLine();
		String[] arr = str.split(" ");
		int[] intArr = new int[n];
		
		
		for(int i = 0; i < n; i++) {
			intArr[i] = Integer.parseInt(arr[i]);
		}
		
//		for(int i = 0; i < n; i++) {
//			for(int j = i+1; j < n; j++ ) {
//				if(intArr[i] > intArr[j]) {
//					box = intArr[i];
//					intArr[i] = intArr[j];
//					intArr[j] = box;
//				}
//			}
//		}
		
		Arrays.sort(intArr);
		System.out.println(intArr[0] + " " + intArr[n-1]);
		
	}
}
