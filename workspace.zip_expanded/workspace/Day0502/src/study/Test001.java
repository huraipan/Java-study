package study;


/*
 *    1~100 ������ ���� �߿��� 2, 3, 5 ,7 �� ����� ������ ���� ���࿡
 *    10���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */

public class Test001 {

	public static void main(String[] args) {
		
		int i, j=1;
		
		for(i=1;i<=100;i++) {
			if(i%2!=0&&i%3!=0&&i%5!=0&&i%7!=0)
				System.out.printf("%3d%c",i, (j++ %10!=0)?' ':'\n');
			
			
			
		}
			
		
		
		
		
		
		
		
		
		
		
				

	}

}
