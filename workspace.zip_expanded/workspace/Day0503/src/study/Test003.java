package study;

/*     -1^2+2^2-3^2+4^2-5^2+.........+100^2�� �հ踦 ���ϴ� ���α׷�
 * 
 * 
 */


public class Test003 {

	public static void main(String[] args) {
		
		int i=1, sum=0;
		
		while(i<101) {
			sum-=(i*i);
			i++;
			sum=-sum;
			
		}
       System.out.println(sum);
		
		
					

	}

}
