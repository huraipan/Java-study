package study;

import java.util.*;

public class Test004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int a, b = 0;
		a = r.nextInt(100);



		while (true) {			
			System.out.print("�����: ");
			b = sc.nextInt();
			if (a == b) {
				System.out.println("����");
				a = r.nextInt(100);
				System.out.print("���� ��?");
				String str = sc.next();
				if(str.equals("n")) {
					System.exit(0);
					break;}
				else if(str.equals("y")) {
					System.out.println();
				}				
			}
			else if (a > b) {
				System.out.println("�� ũ�� ");
			} else if (a < b) {
				System.out.println("�� �۰�");
			}			
		}
		
		
				
	}

}
