package study;

/*     -50에서 1까지의 수를 출력하는 프로그램
 *      단, 한줄에 5개씩만 출력하시고, 이 수들 사이를 탭 간격으로 띄우시오.
 * 
 * 
 */
public class Test002 {

	public static void main(String[] args) {
    
		
		int a=-50,b;
		
		while(a<=1) {
			
			
			System.out.printf("%d\t",a);
			a++;
			System.out.printf("%d\t",a);
			a++;
			if(a>1) {
				break;}
			System.out.printf("%d\t",a);
			a++;
			System.out.printf("%d\t",a);
			a++;
			System.out.printf("%d\t",a);
			a++;
			
			System.out.println();
		}
		
		
		

	}

}
