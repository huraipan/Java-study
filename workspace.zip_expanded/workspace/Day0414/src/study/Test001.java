package study;


/*  �� ��ȯ
 * 
 *     
 *     ������ ����ȯ(�ڵ�����ȯ)
 *      - �� ū �ڷ������� ��ȯ(�ڵ�)
 *      - ���� �ս� ����
 *      
 *          ex)  short a, b;
 *                 a=b=10;
 *                 int c= a+b;
 *                 
 *                 
 *       ����� ����ȯ(��������ȯ)
 *         - �� ���� �ڷ������� ��ȯ(���)
 *         - ������ �ս� ���ɼ��� ����
 *         
 *          ex)
 *          int c=0;
 *          short s=10;
 *          s=(short)(c+s);
 *          
 *          
 *          boolean���� �� ��ȯ �Ұ�
 *          byte: char�� casting��
 *          long: float�� �ڵ����� �Ǽ���ó���� �Ǽ����� ���������� ũ�Ƿ�
 *          
 *          
 */
 
public class Test001 {

	public static void main(String[] args) {
		
		
		
		// ����ȯ�̶�: ���� �Ǵ� ��� Ÿ���� �ٸ� Ÿ������ ��ȯ�ϰ��� �� ��
		// ��ȯ���: (�ڷ���)(������)
		
		double d=97.64;
		int score=(int)(d);
		
			
		int i=10;
		byte b=(byte)i;
		
		i=500;
		b=(byte)i;
		
		
		System.out.println(b);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
