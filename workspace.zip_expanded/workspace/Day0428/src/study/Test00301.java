package study;
import java.util.*;
public class Test00301 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int i, n, sum=0;
		
		System.out.print("정수 입력: ");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++) {
			sum+=i;}
			System.out.printf("1~%d까지의 전체 합: %d\n",n,sum);			
			sum=0;
			
			for(i=2;i<=n;i+=2) {
				sum+=i;}
				System.out.printf("1~%d까지의 짝수 합: %d\n",n,sum);			
			sum=0;
			
			for(i=1;i<=n;i+=2) {
				sum+=i;}
				System.out.printf("1~%d까지의 홀수 합: %d",n,sum);
		


	}

}
