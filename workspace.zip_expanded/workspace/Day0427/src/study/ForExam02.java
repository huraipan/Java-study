package study;

/*   정수 두개를 입력받아 두 수 사이의 수들의 합계를 구하는 프로그램을 작성하시오.
 * 
 */
import java.io.*;
public class ForExam02 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int num1, num2, sum, i;
		sum=0;
		
		
		
		System.out.print("첫번째 정수 입력: ");
		num1 = Integer.parseInt(br.readLine());
		
		System.out.print("두번째 정수 입력: ");
		num2 = Integer.parseInt(br.readLine());
		
		
		
		if (num1>num2) {
			num1=num1^num2;
			num2=num2^num1;
			num1=num1^num2;
		}
		for (i=num1;i<=num2;i++) {
			sum=sum+i;
		}System.out.println(sum);
		
		
		
		
		
		
		
		

	}

}
