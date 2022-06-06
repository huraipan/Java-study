package study;

public class Test001 {
	int c = 0;
	public int solution(int a, int b) {
		

		if(a>b) {
			a=a^b;
			b=b^a;
			a=a^b;
		}
		for(int i=a;i<=b;i++) {
		c+=i;	
		}
		

		return c;
	}

	public static void main(String[] args) {
		Test001 t = new Test001();

	System.out.println(t.solution(3, 3));
		
		
		
		
		

	}

}
