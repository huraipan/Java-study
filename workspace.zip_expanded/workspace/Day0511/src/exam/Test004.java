package exam;

/*    ��]
 *     ��ǻ�Ϳ� ����� ������ ���� ���� �� ������ ����
 *     ����ڰ� ���� 3������ �ϳ��� �Է��ϰ� ������
 *     ��ǻ�ʹ� �������� �ϳ��� �����Ͽ� ����ڿ� ����
 *     ���� �̰������ �Ǵ��ϰ� ����ڰ� �׸��� �Է��ϸ� ������ ������
 *    
 */
import java.util.*;
public class Test004 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String c="����ڰ� �����ϴ�.\n";
    String b="����ڰ� �̰���ϴ�.\n";
    String[] str = {"����","����","��"};
    
    
    while(true) {
    	int n=(int)(Math.random()*3);	
    	System.out.print("���� ���� ��: ");
        String a=sc.next();
    		if(a.equals(str[n])) {
    			System.out.printf("�����: %s, ��ǻ��: %s, �����ϴ�.\n",a,str[n]);	   		
    	}else if(a.equals("����")&&str[n].equals("����")) {
    		System.out.printf("�����: %s, ��ǻ��: %s, %s",a,str[n],b);		
    	}else if(a.equals("����")&&str[n].equals("��")) {
    		System.out.printf("�����: %s, ��ǻ��: %s, %s",a,str[n],c);		
    	}else if(a.equals("����")&&str[n].equals("����")) {
    		System.out.printf("�����: %s, ��ǻ��: %s, %s",a,str[n],c);		
    	}else if(a.equals("����")&&str[n].equals("��")) {
    		System.out.printf("�����: %s, ��ǻ��: %s, %s",a,str[n],b);		
    	}else if(a.equals("��")&&str[n].equals("����")) {
    		System.out.printf("�����: %s, ��ǻ��: %s, %s",a,str[n],c);		
    	}else if(a.equals("��")&&str[n].equals("����")) {
    		System.out.printf("�����: %s, ��ǻ��: %s, %s",a,str[n],b);		
    	}
    		
    		if(a.equals("�׸�")) {
        		break;}	
    	
    }

	}

}
