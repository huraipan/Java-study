package exam;

/*    문]
 *    
 *    학생 수를 입력받아 입력받은 인원수 만큼 학생의 이름과 전화번호를 입력받고
 *    입력 받은 내용 전체를 출력하는 프로그램을 작성하시오.
 *    단, 배열을 이용
 * 
 */
import java.util.*;
public class Test001 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        
		int n=0;
		System.out.print("학생수 입력: ");
		n=sc.nextInt();
		
		String[] name = new String[n];
		String[] num = new String[n];
		
		for(int i=0;i<name.length;i++) {
		System.out.print("이름[공백]전화번호: ");
		name[i]=sc.next();
		num[i]=sc.next();
		
		
		}
		System.out.println();
		
		
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]+"  "+num[i]);
		}
		
		
		
		
		
		
		
		
		
		

	}

}
