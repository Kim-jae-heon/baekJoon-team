package baekJoon.sqd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Queuing {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LinkedList<Integer> que = new LinkedList<>();
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= n; i++) {
			String str = br.readLine();
			String[] arr = str.split(" ");
			
			switch (arr[0]) {
			case "push":
				que.add(Integer.parseInt(arr[1]));
				break;
			case "pop":
				Integer a = que.poll();
				System.out.println(a != null ? a : -1);
				break;
			case "size":
				System.out.println(que.size());
				break;
			case "empty":
				if(que.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
				break;
			case "front":
				try {
					System.out.println(que.getFirst());
				} catch (Exception e) {
					System.out.println(-1);
				}
				break;
			case "back":
				try {
					System.out.println(que.getLast());
				} catch (Exception e) {
					System.out.println(-1);
				}
				break;
				
			}
		}
		
	}
}
