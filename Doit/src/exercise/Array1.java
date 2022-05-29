package exercise;

public class Array1 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		int sum=0;
		int a=2;
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=a;
			a+=2;
			sum+=arr[i];
		}
		
		System.out.println(sum);
		
		

	}

}
