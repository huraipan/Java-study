package study;
import java.util.*;
public class Test005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sel;
		
		
		while(true) {
			System.out.println("메뉴: 콜라, 사이다, 마운틴, 초코송이, 에이스, 웨하스");
			
			
			System.out.print("입력(0입력시 종료): ");
			sel=sc.next();
			
			if(sel.equals("0")) {
				System.out.println("종료");
				break;
				}
			
			
			
			switch (sel) {
			case "콜라":
				 System.out.println("콜라가 나왔습니다.\n");
				 break;
			case "사이다":
				 System.out.println("사이다가 나왔습니다.\n");
				 break;
			case "마운틴":
				 System.out.println("마운틴이 나왔습니다.\n");
				 break;
			case "초코송이":
				 System.out.println("초코송이가 나왔습니다.\n");
				 break;
			case "에이스":
				 System.out.println("에이스가 나왔습니다.\n");
				 break;
			case "웨하스":
				 System.out.println("웨하스가 나왔습니다.\n");
				 break;
			
				  
			}
			
			
		}

	}

}
