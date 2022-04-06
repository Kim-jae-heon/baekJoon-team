package baekJoon.mathmatics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class LeastCommonMultiple {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= t; i++) {
			String aAndB = br.readLine();
			String[] arr = aAndB.split(" ");
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[1]);
			List<Integer> list = new ArrayList<>();
			
			if(a >= 2 && b >= 2) {
				for(int j = 2; j <= (a>b?b:a); j++) {
					while(a%j == 0 && b%j == 0) {
						a /= j;
						b /= j;
						list.add(j);
					}
				}
				
				list.add(a);
				list.add(b);
				
				int lcm = 1;
				for(int nums = 0; nums < list.size(); nums++ ) {
					lcm *= list.get(nums);
				}
				
				System.out.println(lcm);
			} else {
				System.out.println(a*b);
			}
		}
	}
}
