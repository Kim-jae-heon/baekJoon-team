package baekJoon.str;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ROT13 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String result = "";
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if(c > 64 && c <= 77) {
				c += 13;
				result += c;
			}
			else if(c > 77 && c <= 90) {
				c -= 13;
				result += c;
			}
			else if(c > 96 && c <= 109) {
				c += 13;
				result += c;
			}
			else if(c > 109 && c <= 122) {
				c -= 13;
				result += c;
			} else {
				result += c;
			}
		}
		
		System.out.println(result);
	}
}
