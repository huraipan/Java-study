package study;

/*
 * switch ~ case ���� �̿��Ͽ� Ŀ�� �޴��� ������ �˷��ִ� ���α׷� ����
 * Ŀ�Ǹ޴�: ����������, īǪġ��, ī��󶼴� 3500��, �Ƹ޸�ī��� 2000���̴�.
 * 
 */
import java.util.*;
public class Test002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int price=1;
		while(price !=0) {
		System.out.print("���� Ŀ�Ǹ� �帱���? ");
		String order = sc.next();
		
		switch(order) {
		
		case "����������":
		case "īǪġ��":
		case "ī���":	
		price =3500;
		break;
		case "�Ƹ޸�ī��":
		price =2000;
		break;
		
		
		
		
		default:
			System.out.println("���� �޴��Դϴ�.");
		}
		
		System.out.println(order+"�� "+price+"���Դϴ�.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
