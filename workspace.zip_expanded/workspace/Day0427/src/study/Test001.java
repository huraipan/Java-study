package study;
import java.util.*;
public class Test001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float total, input;
		total=input=0.0f;
		
		
		int count=0;
		 
		for(;input>=0.0;) {
			total=total+input;
			System.out.print("���� �Ǽ� �Է�: ");
			input=sc.nextFloat();
			count++;
		}
		System.out.println("���ݱ����� ���: "+total/count);
		 
		

	}

}
