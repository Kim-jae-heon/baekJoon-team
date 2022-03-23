package baekJoon.io;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n, result;
		
		List<String> list = new ArrayList<>();
		String n_ = scan.next(); 
		list.add(n_);
		
		String num_ = scan.next();
		list.add(num_);
		
		n = Integer.parseInt(list.get(0));
		result = 0;
		String str = list.get(1);
		
		if(n == str.length()) {
			for(int i = 0; i < n; i++) {
				result += Integer.parseInt(str.substring(i, i+1)); 
			}
		}
		
		System.out.println(result);
	}
}
