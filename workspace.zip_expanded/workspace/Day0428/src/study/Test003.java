package study;

/*     ����ڷ� ���� ������ ������ �Է¹޾�
 * 1���� �Է¹��� �� ������ �հ�, ¦���� �հ�, Ȧ���� ���� ���� ����ϴ� ���α׷��� �����ϰ�
 * 10������ �հ踦 ����Ͻÿ�.
 * 1~10
 * 1~20
 * 1~30
 * 
 * 
 */
import java.util.*;
public class Test003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i, n, sum=0;
		
		
		System.out.print("���� �Է�: ");
		n=sc.nextInt();
		
		if(n<=10) {
		for(i=1;i<=n;i++) {
			sum=sum+i;}
			System.out.println("1~10������ ��ü ��: "+sum);
			
			sum=0;
			for(i=2;i<=n;i+=2) {
				sum=sum+i;}
				System.out.println("1~10������ ¦�� ��: "+sum);
			
			sum=0;
			for(i=1;i<=n;i+=2) {
				sum=sum+i;}
				System.out.println("1~10������ Ȧ�� ��: "+sum);
		}
				sum=0;
			
				if(n<=20) {
					for(i=1;i<=n;i++) {
						sum=sum+i;}
						System.out.println("1~20������ ��ü ��: "+sum);
						
						sum=0;
						for(i=2;i<=n;i+=2) {
							sum=sum+i;}
							System.out.println("1~20������ ¦�� ��: "+sum);
						
						sum=0;
						for(i=1;i<=n;i+=2) {
							sum=sum+i;}
							System.out.println("1~20������ Ȧ�� ��: "+sum);
							sum=0;
							
							for(i=1;i<=10;i++) {
								sum=sum+i;}
								System.out.println("1~10������ ��ü ��: "+sum);
								
								sum=0;
								for(i=2;i<=10;i+=2) {
									sum=sum+i;}
									System.out.println("1~10������ ¦�� ��: "+sum);
								
								sum=0;
								for(i=1;i<=10;i+=2) {
									sum=sum+i;}
									System.out.println("1~10������ Ȧ�� ��: "+sum);
			
		}

	}

}
