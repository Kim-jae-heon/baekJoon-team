package baekJoon.sqd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Dequeing {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		LinkedList<String> dq = new LinkedList<>();
		
		for(int i = 1; i <= n; i++) {
			String str = br.readLine();
			String[] arr = str.split(" ");
			
			switch (arr[0]) {
			case "push_front":
				dq.addFirst(arr[1]);
				break;
			case "push_back":
				dq.addLast(arr[1]);
				break;
			case "pop_front":
				String f = dq.pollFirst();
				System.out.println(f == null? -1 : f);
				break;
			case "pop_back":
				String l = dq.pollLast();
				System.out.println(l == null? -1 : l);
				break;
			case "size":
				System.out.println(dq.size());
				break;
			case "empty":
				if(dq.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
				break;
			case "front":
				String pf = dq.peekFirst();
				System.out.println(pf == null? -1 : pf);
				break;
			case "back":
				String pl = dq.peekLast();
				System.out.println(pl == null? -1 : pl);
				break;
			}
		}
	}
}
