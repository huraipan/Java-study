package study;

public class ForExam03 {

	public static void main(String[] args) {
		int i,j;
		
		
		for(i=0;i<6;i++) {
			for(j=0;j<6;j++) {
				if(i==j) {
					System.out.printf("(%d,%d)  ",i,j);	
				}else {
					System.out.print("    "
							+ "    ");
				}
				
			}System.out.println();
		}
		
		
		

	}

}
