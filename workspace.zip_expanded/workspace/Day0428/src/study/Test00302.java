package study;
import java.util.*;
public class Test00302 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
int i, n, sum=0, even=0, odd=0, tot=0;
		
		System.out.print("���� �Է�: ");
		n=sc.nextInt();
		
		
		
		for(i=1;i<=n;i++) 
			if(i%2==0)
				even+=i;
			else
				odd+=i;
			tot=tot+i;
			if(i==n) {
				System.out.println("1~"+n+"������ ��ü�� �հ�:"+tot);
				System.out.println("1~"+n+"������ ¦���� �հ�:"+even);
				System.out.println("1~"+n+"������ Ȧ���� �հ�:"+odd);
			}
			
			
			
			
			
	}

}
