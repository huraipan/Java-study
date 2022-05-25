package study;

/*     사용자로 부터 임의의 정수를 입력받아
 * 1부터 입력받은 수 까지의 합계, 짝수의 합계, 홀수의 합을 가각 출력하는 프로그램을 구현하고
 * 10단위로 합계를 출력하시오.
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
		
		
		System.out.print("정수 입력: ");
		n=sc.nextInt();
		
		if(n<=10) {
		for(i=1;i<=n;i++) {
			sum=sum+i;}
			System.out.println("1~10까지의 전체 합: "+sum);
			
			sum=0;
			for(i=2;i<=n;i+=2) {
				sum=sum+i;}
				System.out.println("1~10까지의 짝수 합: "+sum);
			
			sum=0;
			for(i=1;i<=n;i+=2) {
				sum=sum+i;}
				System.out.println("1~10까지의 홀수 합: "+sum);
		}
				sum=0;
			
				if(n<=20) {
					for(i=1;i<=n;i++) {
						sum=sum+i;}
						System.out.println("1~20까지의 전체 합: "+sum);
						
						sum=0;
						for(i=2;i<=n;i+=2) {
							sum=sum+i;}
							System.out.println("1~20까지의 짝수 합: "+sum);
						
						sum=0;
						for(i=1;i<=n;i+=2) {
							sum=sum+i;}
							System.out.println("1~20까지의 홀수 합: "+sum);
							sum=0;
							
							for(i=1;i<=10;i++) {
								sum=sum+i;}
								System.out.println("1~10까지의 전체 합: "+sum);
								
								sum=0;
								for(i=2;i<=10;i+=2) {
									sum=sum+i;}
									System.out.println("1~10까지의 짝수 합: "+sum);
								
								sum=0;
								for(i=1;i<=10;i+=2) {
									sum=sum+i;}
									System.out.println("1~10까지의 홀수 합: "+sum);
			
		}

	}

}
