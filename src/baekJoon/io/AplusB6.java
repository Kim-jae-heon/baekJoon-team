package baekJoon.io;

import java.util.Scanner;

public class AplusB6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int a,b,t;
        
        System.out.print("�� ȸ �ݺ�? : ");
        t = scan.nextInt();
        
        int i = 0;
        while(i++ < t) {
        	System.out.println("�� ���� ������ ��ǥ�� �����Ͽ� �Է����ּ���.");
        	String[] str = scan.next().split(",");
        	
        	a = Integer.parseInt(str[0]);
        	b = Integer.parseInt(str[1]);
        	System.out.println(a+b);
        }
        scan.close();
	}
}
