package study;

/*
 * switch ~ case 문을 이용하여 커피 메뉴의 가격을 알려주는 프로그램 구현
 * 커피메뉴: 에스프레소, 카푸치노, 카페라떼는 3500원, 아메리카노는 2000원이다.
 * 
 */
import java.util.*;
public class Test002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int price=1;
		while(price !=0) {
		System.out.print("무슨 커피를 드릴까요? ");
		String order = sc.next();
		
		switch(order) {
		
		case "에스프레소":
		case "카푸치노":
		case "카페라떼":	
		price =3500;
		break;
		case "아메리카노":
		price =2000;
		break;
		
		
		
		
		default:
			System.out.println("없는 메뉴입니다.");
		}
		
		System.out.println(order+"는 "+price+"원입니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
