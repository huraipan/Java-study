package study;

/*����) �ִ� 100�������� ������ ���ʷ� �Է¹޴ٰ� 0�� �ԷµǸ� �Է��� �ߴ��ϰ� ¦�� ��°�� �Էµ� ������ ��� ����ϴ� ���α׷� �ۼ� 
 * 
 * 
 */
import java.util.*;
public class Test001 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    
    int[] arr = new int[100];
    int count=0;
    
    
    for(int i=0;i<arr.length;i++) {
    	System.out.print("���� �Է�(0�Է½� ����): ");
    	arr[i]=sc.nextInt();
    	if(arr[i]==0) {
    		break;
    	}count++;
    }
    
    for(int j=1;j<count;j+=2) {
    	System.out.print(arr[j]+"  ");
    }
    
    
    
    
    
    

	}

}
