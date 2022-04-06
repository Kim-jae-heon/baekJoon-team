package baekJoon.ll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Editor {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Stack<String> leftStack = new Stack<>();
		Stack<String> rightStack = new Stack<>();
		
		String editor = br.readLine();
		int n = Integer.parseInt(br.readLine());
		String[] strArr = editor.split("");
		
		//왼쪽 스택에 개별 문자들이 계층적으로 들어가있음으로 초기화가 된 상태이며 커서는 문장의 맨 뒤에 위치하고 있는 상태. 
		for(int i = 0; i < editor.length(); i++) {
			leftStack.push(strArr[i]);
		}
		
		for(int i = 1; i <= n; i++) {
			String str_ = br.readLine();
			String[] str = str_.split(" "); 
			switch (str[0]) {
			case "L":
				if(!leftStack.isEmpty())
					rightStack.push(leftStack.pop());
				break;
				
			case "D":
				if(!rightStack.isEmpty())
					leftStack.push(rightStack.pop());
				break;

			case "B":
				if(!leftStack.isEmpty())
					leftStack.pop();
				break;

			case "P":
				leftStack.push(str[1]);
				break;
			}
		}
		
		//초기화를 해버리면 stack이 가변적이어도 선언한 변수는 상수가 된다.
		int size_ = rightStack.size();
		for(int i = 0; i < size_; i++) {
			leftStack.push(rightStack.pop());
		}
		
		for(String s : leftStack) {
			sb.append(s);
		}
	}
}
