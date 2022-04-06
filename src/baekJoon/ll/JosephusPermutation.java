package baekJoon.ll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

//queue이용해서 풀기
public class JosephusPermutation {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] arr = str.split(" ");
		
		int n = Integer.parseInt(arr[0]);
		int k = Integer.parseInt(arr[1]);
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int i = 1; i <= n; i++) {
			q.offer(i);
		}
		
		int s = q.size();
		System.out.print("<");
		
		for(int j = 0; j < s; j++)
			for(int i = 1; i <= k; i++) {
				if(i != k)
					q.offer(q.poll());
				else
					if(j == s-1)
						System.out.print(q.poll());
					else
						System.out.print(q.poll() + ", ");
			}
			
		System.out.print(">");
	}
}
