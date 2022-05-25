package study;

/*
 *    사용자로부터 임의의 정수를 입력받아
 *    입력받은 정수가 양수인지, 음수인지, 0인지를 판정하는 프로그램을 구현
 * 
 * 입력은 버퍼
 * 
 *  if or 삼항연산자 활용
 */
import java.io.*;
public class Exam03 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		
	int a;
	String b;
	
	
	System.out.print("정수 입력: ");
	a = Integer.parseInt(br.readLine());
	
	/*
    if (a>0) {
    	System.out.println("양수입니다.");
    }else if (a<0) {
    	System.out.println("음수입니다.");
    }else {
    	System.out.println("0입니다.");
    }
	*/
	
    b=(a==0) ? "0입니다." : (a>0) ? "양수입니다." : "음수입니다.";
    System.out.println(b);
		  

		
		
		

	}

}
