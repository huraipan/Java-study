package study;

/*   1�������� 10������ �հ踦 ���Ѵ�.
 * 
 *    1+2+3+4+5+6+7+8+9+10
 *    
 * 
 * 
 */
public class ForExam01 {

	public static void main(String[] args) {
		// 1~10���� �ݺ� ó���ϴ� ����
		int i;
		//�ݺ�ó���ϸ鼭 �����հ踦 �����ϴ� ����
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
