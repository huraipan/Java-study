package study;

import java.util.*;
public class Test001 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    double num1,num2,tot;
    String c;
    tot=0;
    
//   System.out.print("ù��° ���� �Է�: ");
//    num1=sc.nextInt();
//    
//    System.out.print("������ �Է�: ");
//    c=sc.next().charAt(0);
//    
//    System.out.print("�ι�° ���� �Է�:");
//    num2=sc.nextInt();
    
    System.out.print("����: ");
    num1=sc.nextInt();
    c=sc.next();
    num2=sc.nextInt();
    
    
    
    switch (c) {
	case "+":
		tot=num1+num2;
		break;
    case "-":
		tot=num1-num2;
		break;
    case "/":
		tot=num1/num2;
		if(num1==0||num2==0) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		break;
    case "%":
        tot=num1%num2;
         break;
    case "*":
		tot=num1*num2;
		break;

	default:
		System.out.println("������ ����");
		break;
	}
    
    System.out.printf("%f %s %f = %f",num1,c,num2,tot);
    
    
    
    
    

	}

}
