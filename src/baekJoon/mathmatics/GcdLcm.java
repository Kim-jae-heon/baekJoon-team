package baekJoon.mathmatics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GcdLcm {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] strArr = str.split(" ");
		
		int f = Integer.parseInt(strArr[0]);
		int s = Integer.parseInt(strArr[1]);
		
		List<Integer> nums = new ArrayList<>();
		for(int i = 2; i <= (f>s?s:f); i++) {
			while(f%i==0 && s%i==0) {
				f /= i;
				s /= i;
				nums.add(i);
			}
		}
		
		int divisor = 1;  
		for(int i = 0; i < nums.size(); i++) {
			divisor *= nums.get(i);
		}
		
		int multiple = divisor * Integer.parseInt(strArr[0])/divisor * Integer.parseInt(strArr[1])/divisor;
		
		System.out.println(divisor);
		System.out.println(multiple);
	}
}
