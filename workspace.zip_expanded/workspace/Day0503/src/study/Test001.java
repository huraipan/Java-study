package study;

/*    ����ڷ� ���� �ϳ��� ���ڸ� �Է¹��� ����, �� ����ŭ 3�� ����� ����ϴ� ���α׷��� �ۼ�
 *    ���࿡ ����ڷκ��� 5�� �Է¹޾Ҵٸ� 3 6 9 12 15�� ����Ͻÿ�
 * 
 */

import java.util.*;
public class Test001 {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     
    
     
     System.out.print("���� �Է�: ");
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
