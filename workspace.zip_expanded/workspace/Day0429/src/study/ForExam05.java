package study;

/*   Scanner�� �̿��Ͽ� �ҹ��� ���ĺ��� �ϳ� �Է�
 *    
 *    ���ĺ�: e
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
		
		System.out.print("���ĺ� �Է�: ");
		a=sc.next().charAt(0);
		
		
		for(char i=a;i>='a';i--) {
			for(char j='a';j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
				
		}
		
		
		

	}

}
