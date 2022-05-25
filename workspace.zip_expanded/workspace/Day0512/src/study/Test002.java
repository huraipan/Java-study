package study;

public class Test002 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
    
		
		int n=1;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=n;
				n++;
			}n=i+2;
		}
		
		
		for(int i =0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("%2d",arr[i][j]);
				
			}System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}

}
