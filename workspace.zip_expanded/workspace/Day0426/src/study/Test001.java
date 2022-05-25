package study;

import java.util.*;
public class Test001 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    double num1,num2,tot;
    String c;
    tot=0;
    
//   System.out.print("첫번째 정수 입력: ");
//    num1=sc.nextInt();
//    
//    System.out.print("연산자 입력: ");
//    c=sc.next().charAt(0);
//    
//    System.out.print("두번째 정수 입력:");
//    num2=sc.nextInt();
    
    System.out.print("연산: ");
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
			System.out.println("0으로 나눌 수 없습니다.");
		}
		break;
    case "%":
        tot=num1%num2;
         break;
    case "*":
		tot=num1*num2;
		break;

	default:
		System.out.println("연산자 오류");
		break;
	}
    
    System.out.printf("%f %s %f = %f",num1,c,num2,tot);
    
    
    
    
    

	}

}
