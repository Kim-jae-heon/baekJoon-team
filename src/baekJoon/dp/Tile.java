package baekJoon.dp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tile {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(0);
		list.add(3);
		int n = scan.nextInt();
		
		if(n >= 3) {
			for(int i = 3; i <= n; i++) {
				if(i%2 == 1) 
					list.add(0);
				else {
					int sub = 0;
					for(int j = 4; j <= i; j += 2)
						sub += list.get(i-j);
					list.add(list.get(i-2)*3+sub*2);
				}
			}
		}
		
		System.out.println(list.get(n));
	}
}	
