package baekJoon.mathmatics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//�� �κ� �ٽ� ���� �ʼ�.. �� ���ذ� �Ȱ�. 
public class GreatestCommonDivisor {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String inputs = br.readLine();
		String[] strArr = inputs.split(" ");
		
		long a = Long.parseLong(strArr[0]);
		long b = Long.parseLong(strArr[1]);
		
		if(a<b) {
			long temp = a;
			a = b;
			b = temp;
		}
		
		while(b > 0) {
			long temp = b;
			b = a%b;
			a = temp;
		}
		
		for(long i = 1; i <= a; i++) {
			sb.append("1");
		}
		
		System.out.println(sb);
	}
}
