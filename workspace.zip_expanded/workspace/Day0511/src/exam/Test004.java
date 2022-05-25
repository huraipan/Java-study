package exam;

/*    문]
 *     컴퓨터와 사용자 사이의 가위 바위 보 게임을 만듬
 *     사용자가 먼저 3가지중 하나를 입력하고 실행함
 *     컴퓨터는 랜덤으로 하나를 선택하여 사용자와 비교함
 *     누가 이겼는지를 판단하고 사용자가 그만을 입력하면 게임을 종료함
 *    
 */
import java.util.*;
public class Test004 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String c="사용자가 졌습니다.\n";
    String b="사용자가 이겼습니다.\n";
    String[] str = {"가위","바위","보"};
    
    
    while(true) {
    	int n=(int)(Math.random()*3);	
    	System.out.print("가위 바위 보: ");
        String a=sc.next();
    		if(a.equals(str[n])) {
    			System.out.printf("사용자: %s, 컴퓨터: %s, 비겼습니다.\n",a,str[n]);	   		
    	}else if(a.equals("바위")&&str[n].equals("가위")) {
    		System.out.printf("사용자: %s, 컴퓨터: %s, %s",a,str[n],b);		
    	}else if(a.equals("바위")&&str[n].equals("보")) {
    		System.out.printf("사용자: %s, 컴퓨터: %s, %s",a,str[n],c);		
    	}else if(a.equals("가위")&&str[n].equals("바위")) {
    		System.out.printf("사용자: %s, 컴퓨터: %s, %s",a,str[n],c);		
    	}else if(a.equals("가위")&&str[n].equals("보")) {
    		System.out.printf("사용자: %s, 컴퓨터: %s, %s",a,str[n],b);		
    	}else if(a.equals("보")&&str[n].equals("가위")) {
    		System.out.printf("사용자: %s, 컴퓨터: %s, %s",a,str[n],c);		
    	}else if(a.equals("보")&&str[n].equals("바위")) {
    		System.out.printf("사용자: %s, 컴퓨터: %s, %s",a,str[n],b);		
    	}
    		
    		if(a.equals("그만")) {
        		break;}	
    	
    }

	}

}
