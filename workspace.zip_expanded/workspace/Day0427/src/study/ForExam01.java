package study;

/*   1에서부터 10까지의 합계를 구한다.
 * 
 *    1+2+3+4+5+6+7+8+9+10
 *    
 * 
 * 
 */
public class ForExam01 {

	public static void main(String[] args) {
		// 1~10까지 반복 처리하는 변수
		int i;
		//반복처리하면서 누적합계를 저장하는 변수
		int sum=0;
		
		i=1;
		
		while(i<=10) {
			sum=sum+i;
			
			System.out.println(i+","+sum);
			i++;
		}
		sum=0;
		System.out.println("");
		for(i=1;i<=10;i++)
		{
			if(i%2!=0) {
				sum=sum+i;
			}else {
				continue;
			}
			
			System.out.println(i+","+sum);	
		}
		System.out.println();
		
		sum=0;
		i=1;
		
		do {
			sum=sum+i;
			System.out.println(i+","+sum);
			i++;
			
		}while(i<=10);
		

	}

}
