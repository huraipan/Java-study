package study;
import java.util.*;
public class Test005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sel;
		
		
		while(true) {
			System.out.println("�޴�: �ݶ�, ���̴�, ����ƾ, ���ڼ���, ���̽�, ���Ͻ�");
			
			
			System.out.print("�Է�(0�Է½� ����): ");
			sel=sc.next();
			
			if(sel.equals("0")) {
				System.out.println("����");
				break;
				}
			
			
			
			switch (sel) {
			case "�ݶ�":
				 System.out.println("�ݶ� ���Խ��ϴ�.\n");
				 break;
			case "���̴�":
				 System.out.println("���̴ٰ� ���Խ��ϴ�.\n");
				 break;
			case "����ƾ":
				 System.out.println("����ƾ�� ���Խ��ϴ�.\n");
				 break;
			case "���ڼ���":
				 System.out.println("���ڼ��̰� ���Խ��ϴ�.\n");
				 break;
			case "���̽�":
				 System.out.println("���̽��� ���Խ��ϴ�.\n");
				 break;
			case "���Ͻ�":
				 System.out.println("���Ͻ��� ���Խ��ϴ�.\n");
				 break;
			
				  
			}
			
			
		}

	}

}
