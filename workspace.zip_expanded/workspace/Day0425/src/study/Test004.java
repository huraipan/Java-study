package study;

import java.io.*;
public class Test004 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int year, month, day;
		day=0;
		
		System.out.print("�⵵: ");
		year = Integer.parseInt(br.readLine());
		
		System.out.print("��: ");
		month = Integer.parseInt(br.readLine());
		
		
		switch (month) {
		
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: day=31; break;
		case 4: case 6: case 9: case 11:  day=30; break;
		case 2:
			if(year%4==0&&year%100!=0||year%400==0) {
				day=29;
			}else {
				day=28;
			}break;
		
		default :
			day=0;
			break;
		}
		
		if(day!=0) {
			System.out.printf("%d�� %d���� %d���� �Դϴ�.", year, month, day);
		}else {
			System.out.println("�Է¿���");
		}
		
		
		
		
		
		
		
		

	}

}
