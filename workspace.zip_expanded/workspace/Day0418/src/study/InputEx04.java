package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class InputEx04 {

	public static void main(String[] args) throws IOException {
		
		
		
		String name, nai, addr, tel;
		
		
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader bb = new BufferedReader(is);
		
		
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		
		System.out.print("�̸�: ");
		name = br.readLine();
		
		System.out.print("����: ");
		nai = br.readLine();
		
		System.out.print("�ּ�: ");
		addr = br.readLine();
		
		System.out.print("��ȭ��ȣ: ");
		tel = br.readLine();
		
		
		
		
		

	}

}
