package baekJoon.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class KEM {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[][] kem = new String[n][4];
		
		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			String[] arr = str.split(" ");
			kem[i][0] = arr[0];
			kem[i][1] = arr[1];
			kem[i][2] = arr[2];
			kem[i][3] = arr[3];
		}
		
		Arrays.sort(kem, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				int kor1 = Integer.parseInt(o1[1]);
				int kor2 = Integer.parseInt(o2[1]);
				int eng1 = Integer.parseInt(o1[2]);
				int eng2 = Integer.parseInt(o2[2]);
				int math1 = Integer.parseInt(o1[3]);
				int math2 = Integer.parseInt(o2[3]);
				
				if(kor1 == kor2 && eng1 == eng2 && math1 == math2)
					return o1[0].compareTo(o2[0]);
				else if(kor1 == kor2 && eng1 == eng2)
					return -(math1 - math2);
				else if(kor1 == kor2)
					return eng1 - eng2;
				else
					return -(kor1 - kor2);
			}
		});
		
		for(int i = 0; i < n; i++) 
			System.out.println(kem[i][0]);
		
	}
}