package study;

/*   무한대로 두개의 정수를 입력받아 합계를 구하는 프로그램을 작성하시오.
 * 
 */
import java.util.*;
public class Test002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, sum=0;
		
		
		
		System.out.println("0을 입력 시 종료됩니다.");
		
		
		
		for(;;) {
			System.out.print("첫번째 정수 입력: ");			
			n1=sc.nextInt();
			if(n1==0) {
				break;
			}
			
			System.out.print("두번째 정수 입력: ");
			n2=sc.nextInt();
			if(n2==0) {
				break;
			}
			
			sum=n1+n2;
			System.out.println("합: "+sum);
			
		}
		System.out.println("종료");
		
		
		
		
		
		
		
		

	}

}
