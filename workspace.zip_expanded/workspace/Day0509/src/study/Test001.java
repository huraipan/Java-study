package study;

/*문제) 최대 100개까지의 정수를 차례로 입력받다가 0이 입력되면 입력을 중단하고 짝수 번째에 입력된 정수를 모두 출력하는 프로그램 작성 
 * 
 * 
 */
import java.util.*;
public class Test001 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    
    int[] arr = new int[100];
    int count=0;
    
    
    for(int i=0;i<arr.length;i++) {
    	System.out.print("정수 입력(0입력시 종료): ");
    	arr[i]=sc.nextInt();
    	if(arr[i]==0) {
    		break;
    	}count++;
    }
    
    for(int j=1;j<count;j+=2) {
    	System.out.print(arr[j]+"  ");
    }
    
    
    
    
    
    

	}

}
