package study;
import java.util.*;
public class Test001 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	
	int low, high, card;
	
	// y/n 문자열이 들어오면 게임을 반복진행 duqnfmf vkswjd
	while(true) {
		int i=0;//사용자의 시행 횟수
		low = 0; // 카드의 최소 범위
		high = 99; // 카드의 최대 범위
		card = r.nextInt(100);
		System.out.println("숨겨져 있는 카드 값을 맞추어 보세요.");
		
		while(true) {
			System.out.println("입력하실 수 있는 값의 범위"+low+"~~"+high+"입니다.");
		int n=0;
		n=sc.nextInt();
		if(n>high||n<low) {
			System.out.println("입력하는 값은 범위를 초과하셨습니다.");
		}else {
			if(n==card) {
				System.out.println("맞추셨습니다. 축하드립니다.");
				break;
			}else if(n>card) {
				System.out.println("더 낮은 값을 입력하시오.");
				high=n;
			}else {
				System.out.println("더 큰 값을 입력하시오.");
				low=n;
			}
		}
			
			i++;
			
		}
		System.out.println("계속 게임을 진행 하시겠습니까?(y/n): ");
		if(sc.next().equals("n")) {
			break;
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

	}

}
