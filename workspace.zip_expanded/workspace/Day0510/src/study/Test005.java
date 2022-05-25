package study;

/*
 *   사용자로부터 임의의 정수를 입력받아
 *   입력받은 수중에서 가장 큰 수를 출력  
 */
import java.util.*;
public class Test005 {

	public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);		
		
     int n;
     System.out.print("입력할 데이터 개수: ");
     n=sc.nextInt();
     
     
	int arr[] = new int[n];
	
	int max=arr[0];
	
	
	System.out.print("정수 입력: ");
	for(int i=0;i<arr.length;i++) {
		
		arr[i]=sc.nextInt();
	}
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}
		
		System.out.println("가장 큰 수: "+max);
		
		
	}

}
