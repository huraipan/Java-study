package study;


/*    사용자가 입력하는 정수를 계속해서 더해 나간다.
 *    만약에 0이 입력되면 지금까지 입력된 정수의 합계를 출력하고 종료하는 프로그램을 구현하시오.
 *    단, while문 이용
 * 
 */
import java.util.*;
public class Test002 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	int a, sum = 0;
	
	
	
	while (true) {
		System.out.print("정수 입력: ");
		a=sc.nextInt();
		sum=sum+a;
		if(a==0) {
			System.out.println(sum);
		break;}
	}
		
		
		
		
		
		
		
		
		
		

	}

}
