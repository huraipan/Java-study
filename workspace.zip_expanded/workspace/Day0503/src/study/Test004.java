package study;

import java.util.*;

public class Test004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int a, b = 0;
		a = r.nextInt(100);



		while (true) {			
			System.out.print("맞춰봐: ");
			b = sc.nextInt();
			if (a == b) {
				System.out.println("정답");
				a = r.nextInt(100);
				System.out.print("한판 더?");
				String str = sc.next();
				if(str.equals("n")) {
					System.exit(0);
					break;}
				else if(str.equals("y")) {
					System.out.println();
				}				
			}
			else if (a > b) {
				System.out.println("더 크게 ");
			} else if (a < b) {
				System.out.println("더 작게");
			}			
		}
		
		
				
	}

}
