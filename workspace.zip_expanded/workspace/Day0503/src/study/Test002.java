package study;

/*   사용자가 입력한 정수를 계속해서 더해 나아감
 *   만약 0이 입력되면 지금까지의 입력된 수의 합을 출력
 * 
 * 
 */
import java.util.*;

public class Test002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int i=1, sum=0;
		
		while(i!=0) {
			System.out.print("정수 입력: ");
			i=sc.nextInt();
			sum+=i;
			
		}System.out.println(sum);
		
		
		
		

	}

}
