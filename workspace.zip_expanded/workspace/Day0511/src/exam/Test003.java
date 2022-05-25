package exam;
/*  문]  
 *   키보드로 돈의 액수를 입력받아 오만원, 만원, 오천원, 천원, 오백원, 백원
 *   오십원, 십원, 1원으로 변환
 *   단, 배열과 반복문을 활용   
 *   배열명: unit
 *   65123
 */
import java.util.*;

public class Test003 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = 50000;
		int[] b = new int[10];
		int[] unit = new int[10];

		System.out.print("금액 입력: ");
		int money = sc.nextInt();

		for (int i = 0; i < unit.length; i++) {
			b[i]=a;
			unit[i] = money / a;
			money %= a;
			if (i % 2 == 0) {
				a /= 5;
			} else
				a /= 2;			
		}

		for (int i = 0; i < unit.length; i++) {
			System.out.println(b[i]+"원: " + unit[i] + "개");
			
		}

	}

}
