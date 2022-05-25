

package study;

public class ForExam04 {

	public static void main(String[] args) {
		
		int i, j, k;
		
		
		for(i=0;i<5;i++) {
			for(j=1;j<5-i;j++) {
				System.out.print(" ");
			}for(k=0;k<i*2+1;k++) {
				System.out.print(Math.abs(k-i));
				
			}System.out.println();
		}

	}

}
