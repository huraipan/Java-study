package study;

/*   while문 이용하여 구구단을 출력하시오.
 *  
 * 
 * 
 */
public class Test004 {

	public static void main(String[] args) {

		int a = 2, b, sum = 0;

		while (a <= 9) {
			b = 1;
			while (b <= 9) {
				System.out.printf("%d x %d = %d\n", a, b, (a * b));
				b++;
			}
			System.out.println();
			a++;
		}

	}

}
