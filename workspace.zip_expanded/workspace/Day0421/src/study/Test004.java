package study;

/*
 *   임의의 정수로 돈의 금액을 입력받아 오만원권, 만원권, 오천원권, 천원권, 오백원동전, 백원동전, 오십원동전, 십원동전, 일원동전
 *   
 *   입력금액 : 65376
 *   5만원 1, 만원 1, 천원 5, 백원 3, 오십원 1, 십원2, 1원 6
 * 
 * 
 */

import java.util.*;
public class Test004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		int a1, a2, a3, a4, a5, a6, a7;
		int b1, b2, b3, b4, b5, b6;
		
		System.out.print("금액을 입력하시오: ");
		a = sc.nextInt();
		
		a1=a/50000;
		b1=a%50000;
		a2=b1/10000;
		b2=b1%10000;
		a3=b2/1000;
		b3=b2%1000;
		a4=b3/100;
		b4=b3%100;
		a5=b4/50;
		b5=b4%50;
		a6=b5/10;
		b6=b5%10;
		a7=b6/1;
		
		
		
		System.out.printf("5만원: %d개\n1만원: %d개\n1천원: %d개\n1백원: %d개\n50원: %d개\n10원: %d개\n1원: %d개"
				,a1,a2,a3,a4,a5,a6,a7);
		
		
		
		

	}

}
