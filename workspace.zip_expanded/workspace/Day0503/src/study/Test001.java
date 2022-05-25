package study;

/*    사용자로 부터 하나의 숫자를 입력받은 다음, 그 수만큼 3의 배수를 출력하는 프로그램을 작성
 *    만약에 사용자로부터 5를 입력받았다면 3 6 9 12 15를 출력하시오
 * 
 */

import java.util.*;
public class Test001 {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     
    
     
     System.out.print("숫자 입력: ");
     int a=sc.nextInt();
     
     
//     for(int i=3;i<=a*3;i+=3) {
//    	 
//    	 System.out.print(i);
//    	 System.out.print("  ");
//     }
     int i=3;
     while(i<=a*3) {
    	 System.out.printf("%d   ",i);
    	
    	 i+=3;
     }
     
     
     
     
     
     
	}

}
