package study;
import java.util.*;
public class Test001 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	
	int low, high, card;
	
	// y/n ���ڿ��� ������ ������ �ݺ����� duqnfmf vkswjd
	while(true) {
		int i=0;//������� ���� Ƚ��
		low = 0; // ī���� �ּ� ����
		high = 99; // ī���� �ִ� ����
		card = r.nextInt(100);
		System.out.println("������ �ִ� ī�� ���� ���߾� ������.");
		
		while(true) {
			System.out.println("�Է��Ͻ� �� �ִ� ���� ����"+low+"~~"+high+"�Դϴ�.");
		int n=0;
		n=sc.nextInt();
		if(n>high||n<low) {
			System.out.println("�Է��ϴ� ���� ������ �ʰ��ϼ̽��ϴ�.");
		}else {
			if(n==card) {
				System.out.println("���߼̽��ϴ�. ���ϵ帳�ϴ�.");
				break;
			}else if(n>card) {
				System.out.println("�� ���� ���� �Է��Ͻÿ�.");
				high=n;
			}else {
				System.out.println("�� ū ���� �Է��Ͻÿ�.");
				low=n;
			}
		}
			
			i++;
			
		}
		System.out.println("��� ������ ���� �Ͻðڽ��ϱ�?(y/n): ");
		if(sc.next().equals("n")) {
			break;
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

	}

}
