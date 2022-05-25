package study;

/*사용자로부터 임의의 정수를 입력받아 입력받은 정수가
짝수인지 홀수인지를 판정하는 프로그램을 작성하시오
단 조건삼항연산자를 이용하여 처리하시오
 */
import java.util.*;
public class Exam02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		
		System.out.print("정수를 입력하시오: ");
		a = sc.nextInt();
		
		String result = (a%2==0)?"짝수":"홀수";
		
		System.out.println(result);
		
		
		
		
		
	
		

	}

}
