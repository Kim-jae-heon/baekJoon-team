package baekJoon.sqd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stacking {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack<String> stack = new Stack<>();
		
		for(int i = 1; i <= n; i++) {
			String str = br.readLine();
			String[] box = str.split(" ");
			
			switch (box[0]) {
			case "push":
				stack.push(box[1]);
				break;
			
			case "pop":
				try {
					System.out.println(stack.pop());
				} catch(Exception e) {
					System.out.println(-1);
				}
				break;
			
			case "size":
				System.out.println(stack.size());
				break;
			
			case "empty":
				if(stack.empty()) 
					System.out.println(1);
				else
					System.out.println(0);
				break;
			
			case "top":
				try {
					System.out.println(stack.peek());
				} catch(Exception e) {
					System.out.println(-1);
				}
				break;
			}
		}
	}
	
}
