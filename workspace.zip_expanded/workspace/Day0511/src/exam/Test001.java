package exam;

/*    ��]
 *    
 *    �л� ���� �Է¹޾� �Է¹��� �ο��� ��ŭ �л��� �̸��� ��ȭ��ȣ�� �Է¹ް�
 *    �Է� ���� ���� ��ü�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *    ��, �迭�� �̿�
 * 
 */
import java.util.*;
public class Test001 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        
		int n=0;
		System.out.print("�л��� �Է�: ");
		n=sc.nextInt();
		
		String[] name = new String[n];
		String[] num = new String[n];
		
		for(int i=0;i<name.length;i++) {
		System.out.print("�̸�[����]��ȭ��ȣ: ");
		name[i]=sc.next();
		num[i]=sc.next();
		
		
		}
		System.out.println();
		
		
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]+"  "+num[i]);
		}
		
		
		
		
		
		
		
		
		
		

	}

}
