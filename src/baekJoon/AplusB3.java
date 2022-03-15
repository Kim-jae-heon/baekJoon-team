package baekJoon;

import java.util.Scanner;

public class AplusB3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("케이스 갯수: ");
		int cnt = scan.nextInt();
		int a,b;
		
		//케이스 갯수만큼 배열 생성
		int[] arr = new int[cnt];
		
		for(int i = 0; i<cnt; i++) {
			
			//a,b에 값 담기
			System.out.print("a값 입력: ");
			a = scan.nextInt();
			System.out.print("b값 입력: ");
			b = scan.nextInt();
			arr[i] = a+b;
		}
		
		for(int p : arr) {
			System.out.println(p);
		}
		
		scan.close();
	}
}
