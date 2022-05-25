package exam;
/*   문]
 *    양의 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수중에서 3의 배수만 출력
 *  
 */
import java.util.*;
public class Test002 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    
		int[] arr = new int[10];
		
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("양의 정수 입력: ");
			arr[i]=sc.nextInt();
		}
		
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]%3==0&&arr[i]!=0) {
				System.out.println("arr["+i+"]: "+arr[i]);
			}
		}
		
		
		
		
		
		
		
		

	}

}
