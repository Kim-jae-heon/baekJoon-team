package baekJoon.io;

import java.util.Scanner;

public class AplusB6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int a,b,t;
        
        System.out.print("몇 회 반복? : ");
        t = scan.nextInt();
        
        int i = 0;
        while(i++ < t) {
        	System.out.println("두 개의 정수를 쉼표로 구분하여 입력해주세요.");
        	String[] str = scan.next().split(",");
        	
        	a = Integer.parseInt(str[0]);
        	b = Integer.parseInt(str[1]);
        	System.out.println(a+b);
        }
        scan.close();
	}
}
