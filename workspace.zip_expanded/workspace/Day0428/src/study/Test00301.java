package study;
import java.util.*;
public class Test00301 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int i, n, sum=0;
		
		System.out.print("���� �Է�: ");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++) {
			sum+=i;}
			System.out.printf("1~%d������ ��ü ��: %d\n",n,sum);			
			sum=0;
			
			for(i=2;i<=n;i+=2) {
				sum+=i;}
				System.out.printf("1~%d������ ¦�� ��: %d\n",n,sum);			
			sum=0;
			
			for(i=1;i<=n;i+=2) {
				sum+=i;}
				System.out.printf("1~%d������ Ȧ�� ��: %d",n,sum);
		


	}

}
