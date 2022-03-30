package baekJoon.str;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AlphabetAnalyzing {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] count = new int[4];
		String str;
		while((str = br.readLine()) != null) {
			for(int j = 0; j < str.length(); j++) {
				char c = str.charAt(j);
				if(c == 32)
					count[3]++;
				else if(c > 47 && c < 58)
					count[2]++;
				else if(c > 64 && c < 91)
					count[1]++;
				else if(c > 96 && c < 123)
					count[0]++;
			}
			
			for(int j = 0; j < count.length; j++) {
				System.out.print(count[j] + " ");
				count[j] = 0;
			}
			System.out.println();
		}
	}
}
