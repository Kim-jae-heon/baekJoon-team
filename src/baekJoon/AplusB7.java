package baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class AplusB7 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a,b,t;
		
		t = br.read();
		
		for(int i = 0; i < t; i++) {
			String str = br.readLine();
        	StringTokenizer st = new StringTokenizer(str);
        	
        	a = Integer.parseInt(st.nextToken());
        	b = Integer.parseInt(st.nextToken());
        	bw.write("Case #" + (i+1) + ": " + (a + b) + "\n");
		}
		
		br.close();
		bw.close();
	}
}
