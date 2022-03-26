package baekJoon.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NumberK {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] arr = str.split(" ");
		int n = Integer.parseInt(arr[0]);
		int idx = Integer.parseInt(arr[1]);
		
		String nums = br.readLine();
		String[] numArr_ = nums.split(" ");
		int[] numArr = new int[n];
		for(int i = 0; i < n; i++) {
			numArr[i] = Integer.parseInt(numArr_[i]);
		}
		
		Arrays.sort(numArr);
		
		System.out.println(numArr[idx-1]);
	}
}
