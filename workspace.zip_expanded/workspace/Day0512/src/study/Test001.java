package study;

public class Test001 {

	public static void main(String[] args) {
	
		//2차원 배열의 선언과 초기화
		// 방법 1
		/*int [][] arr1 = new int[3][3];
		
		arr1[0][0]=1;
		arr1[0][1]=2;
		arr1[0][2]=3;
	*/
		
		
		int[][] arr2 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		
		
		for(int i =0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.printf("%2d",arr2[i][j]);
				
			}System.out.println();
		}
		
	
		
		
		
		
		
		
		
		
		
		
	

	}

}
