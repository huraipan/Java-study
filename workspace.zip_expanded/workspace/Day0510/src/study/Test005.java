package study;

/*
 *   ����ڷκ��� ������ ������ �Է¹޾�
 *   �Է¹��� ���߿��� ���� ū ���� ���  
 */
import java.util.*;
public class Test005 {

	public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);		
		
     int n;
     System.out.print("�Է��� ������ ����: ");
     n=sc.nextInt();
     
     
	int arr[] = new int[n];
	
	int max=arr[0];
	
	
	System.out.print("���� �Է�: ");
	for(int i=0;i<arr.length;i++) {
		
		arr[i]=sc.nextInt();
	}
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}
		
		System.out.println("���� ū ��: "+max);
		
		
	}

}
