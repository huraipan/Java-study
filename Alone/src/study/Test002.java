package study;

public class Test002 {
	int c=0;
	int count;
	int count2=0;
	int count3=0;
	int count5=0;
	public int solution(int left, int right) {
		
		
		
		for(int i=left;i<=right;i++) {
			
			while(i%2!=0) {
				i/=2;
				count2++;
			}
			
			while(i%3!=0) {
				i/=3;
				count3++;
			}
			
			while(i%5!=0) {
				i/=5;
				count5++;
			}
			
			if(count2!=0) {
				count2++;
			}
			
			if(count3!=0) {
				count3++;
			}
			
			if(count5!=0) {
				count5++;
			}
			
			count=count2+count3+count5;
			if(count==0) {
				count=2;
			}
			
			
			if(count%2!=0) {
				i*=-1;
			}
			
			c+=i;
			
			count=0;
			count2=0;
			count3=0;
			count5=0;
		}
		
		
		
		
		
		return c;
	}

	public static void main(String[] args) {
		
		Test002 t = new Test002();
		
		System.out.println(t.solution(13, 17));
		
		

		
	}

}
