package study;

public class Test006 {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		for(int i=2;i<10;i+=3) {
			for(int j=1;j<10;j++) {
				for(int k=i;k<i+3;k++) {
					if(k>9) {
						break;
					}
					System.out.printf(k+"x"+j+"="+k*j+"\t");
					
				}System.out.println();
			}System.out.println();
		}
		
		
		
		
		
		
		
	}

}
