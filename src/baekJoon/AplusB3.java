package baekJoon;

import java.util.Scanner;

public class AplusB3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���̽� ����: ");
		int cnt = scan.nextInt();
		int a,b;
		
		//���̽� ������ŭ �迭 ����
		int[] arr = new int[cnt];
		
		for(int i = 0; i<cnt; i++) {
			
			//a,b�� �� ���
			System.out.print("a�� �Է�: ");
			a = scan.nextInt();
			System.out.print("b�� �Է�: ");
			b = scan.nextInt();
			arr[i] = a+b;
		}
		
		for(int p : arr) {
			System.out.println(p);
		}
		
		scan.close();
	}
}
