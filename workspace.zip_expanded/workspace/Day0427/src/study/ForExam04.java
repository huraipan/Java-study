package study;


/*  ���� �Ǽ��� �Է¹޾� �Է¹��� ���� ����� ���ϴ� ���α׷� ����
 * ��, ���� ������ �ԷµǸ� ����Ͻÿ�
 * 
 * ���� �Ǽ� �Է�: 1.1
 * ���� �Ǽ� �Է�: 2.2
 * ���� �Ǽ� �Է�: 3.3
 * ���� �Ǽ� �Է�: 4.4
 * ���� �Ǽ� �Է� -5.5
 * ���ݱ����� ���: 2.2
 * 
 */

import java.util.*;
public class ForExam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		float num1, num2, num3, num4, num5, ave, sum;
		 int i, n;
		 sum=0;
		 
		 
		 
		 
		 System.out.print("ù��° �Ǽ� �Է�:" );
		 num1=sc.nextFloat();
		 
		 System.out.print("�ι�° �Ǽ� �Է�:" );
		 num2=sc.nextFloat();
		 
		 System.out.print("����° �Ǽ� �Է�:" );
		 num3=sc.nextFloat();
		 
		 System.out.print("�׹�° �Ǽ� �Է�:" );
		 num4=sc.nextFloat();
		 
		 System.out.print("�ټ���° �Ǽ� �Է�:" );
		 num5=sc.nextFloat();
		 
		 
		 
		 if(num1<0) {
			 num1=0;
		 }else if(num2<0) {
			 num2=0;
		 }else if(num3<0) {
			 num3=0;
		 }else if(num4<0) {
			 num4=0;
		 }else if(num5<0) {
			 num5=0;
		 }
		 
		 sum=num1+num2+num3+num4+num5;
		 
		 
		 ave=sum/5.0f;
		 
		 
		 
		 
		 System.out.println(ave);
		 
		 
		 

	}

}
