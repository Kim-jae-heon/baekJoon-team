package baekJoon.sqd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class VPS {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<>();
		
		int n= Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++) {
			String ps = br.readLine();
			boolean well = true;
			
			
			for(int j = 0; j < ps.length(); j++) {
				char c = ps.charAt(j);
				
				if(c == '(') 
					stack.push(c);
				else if (stack.empty()) {
					well = false;
					break;
				}
				else 
					stack.pop();
			}
			
			if(stack.empty() && (well == true))
				System.out.println("YES");
			else {
				System.out.println("NO");
			}
			stack.clear();
		}
	}
}
