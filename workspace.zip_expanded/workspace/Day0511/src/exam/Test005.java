package exam;
import java.util.*;
public class Test005 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] str = {"가위", "바위","보"};
    
    Random rd= new Random();
    
    int com =rd.nextInt(3)+1;
    
    int user;
    
    do {
    	System.out.print("1: 가위, 2: 바위, 3: 보 중 입력");
    	user=sc.nextInt();
    	
    }while(user<1||user>3);
    
    System.out.println("사용자: "+str[user-1]);
    System.out.println("컴터: "+str[com-1]);
    
    String result;
    result="무승부~~~~!!!!";
    if((user==1&&com==3)||(user==2&&com==1)||(user==3&&com==2)) {
    	result="사용자가 승리하셨습니다.~~~~!!!!!";
    }
    

	}

}
