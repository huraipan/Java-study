package study;

import java.util.*;
public class Test001 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int n, fact, sum;
		
		sum=1;
		
		System.out.print("정수 입력: ");
		n=sc.nextInt();
		
		
	
		
		
		for(fact=n;fact>0;fact--) {
			sum=sum*fact;
			
		}
		System.out.println(sum);
		
		
		
		

	}

}
