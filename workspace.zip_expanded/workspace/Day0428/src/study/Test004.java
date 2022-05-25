package study;

/*     입력된 정수의 평균을 구하는 프로그램을 구현하시오.
 *      1. 제일 먼저 입력할 정수의 개수를 사용자로 부터 입력 받는다.
 *      2. 입력받은 수 만큼 평균값을 구하여 출력한다.
 *      단 평균값은 실수로 처리한다.
 */

import java.util.*;
public class Test004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, i, n;
		double avg, sum=0.0;
		
		System.out.print("입력할 정수의 개수: ");
		n=sc.nextInt();
		
		
		for(i=1;i<=n;i++) {
			System.out.print("정수 입력: ");
			a=sc.nextInt();
			sum+=a;
		}
		
		avg=sum/n;
		System.out.printf("%.2f",avg);
		
		

	}

}
