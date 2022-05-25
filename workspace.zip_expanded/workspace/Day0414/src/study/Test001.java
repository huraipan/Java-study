package study;


/*  형 변환
 * 
 *     
 *     묵시적 형변환(자동형변환)
 *      - 더 큰 자료형으로 변환(자동)
 *      - 정보 손실 없음
 *      
 *          ex)  short a, b;
 *                 a=b=10;
 *                 int c= a+b;
 *                 
 *                 
 *       명시적 형변환(강제형변환)
 *         - 더 작은 자료형으로 변환(명시)
 *         - 정보의 손실 가능성이 있음
 *         
 *          ex)
 *          int c=0;
 *          short s=10;
 *          s=(short)(c+s);
 *          
 *          
 *          boolean형은 형 변환 불가
 *          byte: char은 casting임
 *          long: float는 자동으로 실수형처리됨 실수형은 정수형보다 크므로
 *          
 *          
 */
 
public class Test001 {

	public static void main(String[] args) {
		
		
		
		// 형변환이란: 변수 또는 상수 타입을 다른 타입으로 변환하고자 할 때
		// 변환방법: (자료형)(변수명)
		
		double d=97.64;
		int score=(int)(d);
		
			
		int i=10;
		byte b=(byte)i;
		
		i=500;
		b=(byte)i;
		
		
		System.out.println(b);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
