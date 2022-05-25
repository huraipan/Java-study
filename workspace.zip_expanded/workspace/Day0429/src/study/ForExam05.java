package study;

/*   Scanner를 이용하여 소문자 알파벳을 하나 입력
 *    
 *    알파벳: e
 *    
 *    abcde
 *    abcd
 *    abc
 *    ab
 *    a
 * 
 * 
 */

import java.util.*;
public class ForExam05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    char a;
//		int i, j;
		
		System.out.print("알파벳 입력: ");
		a=sc.next().charAt(0);
		
		
		for(char i=a;i>='a';i--) {
			for(char j='a';j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
				
		}
		
		
		

	}

}
