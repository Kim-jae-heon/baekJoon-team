package baekJoon.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class AplusB8 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a,b,t;
        
        t = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < t; i++) {
        	String str = br.readLine();
        	StringTokenizer stk = new StringTokenizer(str);
        	
        	a = Integer.parseInt(stk.nextToken());
        	b = Integer.parseInt(stk.nextToken());
        	
        	bw.write("Case #" + (i+1) + ": " + a + " + " + b  + " = " + (a+b) +"\n");
        }
        
        br.close();
        bw.close();
	}
}
