package study;

import java.io.*;
public class Test001 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		
		
		int a;
		
		
		
		
		System.out.print("���� �Է�: ");
		a = Integer.parseInt(br.readLine());
		
		
		
		if (a%2==0&&a!=0) {
	    	System.out.println("¦���Դϴ�.");
	    }else if (a%2!=0) {
	    	System.out.println("Ȧ���Դϴ�.");
	    }else if (a==0){
	    	System.out.println("0�Դϴ�.");
	    }
	    
		
		
		
		
		

	}

}
