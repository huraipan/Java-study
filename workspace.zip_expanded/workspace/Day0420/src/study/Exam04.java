package study;

/*임의의 년도를 입력받아
입력받은 년도가 윤년인지 평년인지를 판정하는 프로그램 구현
if or 삼항연산자 활용

윤년한정 조건
- 연도가 4의 배수이면서 100의 배수가 아니거나
400의 배수이면 윤년 그렇지 않으면 평년
*/
import java.io.*;
public class Exam04 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int a;
		String b;
		
		
		System.out.print("년도: ");
		a = Integer.parseInt(br.readLine());
		
		//b=(a%4==0&&a%100!=0||a%400==0)?"윤년입니다.":"평년입니다.";
			
		if ((a%4==0&&a%100!=0||a%400==0)) {
			System.out.println("윤년입니다.");
		}else {
			System.out.println("평년입니다.");
		}
		
		
		
		//System.out.println(b);
		
		

	}

}
