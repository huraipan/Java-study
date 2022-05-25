package exam;

public class Test008 {

	public static void main(String[] args) {
		int[] arr = new int[45];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
		}
		
		int temp=0,j=0;
		
		
		
		
		
		for(int i=0;i<6;i++) {
			j = (int)(Math.random()*45);
			
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		
		for(int i=0;i<6;i++) {
			System.out.printf("lot[%d]: %d\n",i,arr[i]);
		}
		
		
		
		
		

	}

}
