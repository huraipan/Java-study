package study;

/*   ���Ѵ�� �ΰ��� ������ �Է¹޾� �հ踦 ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 */
import java.util.*;
public class Test002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, sum=0;
		
		
		
		System.out.println("0�� �Է� �� ����˴ϴ�.");
		
		
		
		for(;;) {
			System.out.print("ù��° ���� �Է�: ");			
			n1=sc.nextInt();
			if(n1==0) {
				break;
			}
			
			System.out.print("�ι�° ���� �Է�: ");
			n2=sc.nextInt();
			if(n2==0) {
				break;
			}
			
			sum=n1+n2;
			System.out.println("��: "+sum);
			
		}
		System.out.println("����");
		
		
		
		
		
		
		
		

	}

}
