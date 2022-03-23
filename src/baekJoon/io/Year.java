package baekJoon.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Year {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int x,y, key, typ;
		String[] arr = new String[2];
		
		str = br.readLine();
		arr = str.split(" ");
		x = Integer.parseInt(arr[0]);
		y = Integer.parseInt(arr[1]);
		typ = 0;
		
		switch(x) {
		case 1:
			typ = 0;
			break;
		case 2:
			typ = 31;
			break;
		case 3:
			typ = 59;
			break;
		case 4:
			typ = 90;
			break;
		case 5:
			typ = 120;
			break;
		case 6:
			typ = 151;
			break;
		case 7:
			typ = 181;
			break;
		case 8:
			typ = 212;
			break;
		case 9:
			typ = 243;
			break;
		case 10:
			typ = 273;
			break;
		case 11:
			typ = 304;
			break;
		case 12:
			typ = 334;
			break;
		default:
			System.out.println("1~12범위 안에 있는 숫자를 입력해주세요.");
			break;
		}
		
		key = (typ + y)%7;
		
		switch (key) {
		case 0:
			System.out.println("SUN");
			break;
		
		case 1:
			System.out.println("MON");
			break;
			
		case 2:
			System.out.println("TUE");
			break;
			
		case 3:
			System.out.println("WED");
			break;
	
		case 4:
			System.out.println("THU");
			break;
	
		case 5:
			System.out.println("FRI");
			break;
			
		case 6:
			System.out.println("SAT");
			break;

		default:
			System.out.println("숫자를 입력해주세요");
			break;
		}
	}
}
