package exam;
/*   ��]
 *    ���� ���� 10���� �Է¹޾� �迭�� �����ϰ�, �迭�� �ִ� �����߿��� 3�� ����� ���
 *  
 */
import java.util.*;
public class Test002 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    
		int[] arr = new int[10];
		
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("���� ���� �Է�: ");
			arr[i]=sc.nextInt();
		}
		
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]%3==0&&arr[i]!=0) {
				System.out.println("arr["+i+"]: "+arr[i]);
			}
		}
		
		
		
		
		
		
		
		

	}

}
