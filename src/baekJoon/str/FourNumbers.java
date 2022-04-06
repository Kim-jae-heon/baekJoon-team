package baekJoon.str;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FourNumbers {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] arr = str.split(" ");
		
		String fArr = arr[0] + arr[1];
		String sArr = arr[2] + arr[3];
		
		try {
			long f = Long.parseLong(fArr);
			long s = Long.parseLong(sArr);
			System.out.println(f + s);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
